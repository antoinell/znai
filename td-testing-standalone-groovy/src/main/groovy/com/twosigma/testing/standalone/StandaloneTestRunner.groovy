package com.twosigma.testing.standalone

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

import java.nio.file.Path

/**
 * @author mykola
 */
class StandaloneTestRunner {
    private List<String> staticImports
    private List<StandaloneTest> tests
    private List<StandaloneTest> exclusiveTests

    private Path workingDir
    private Path currentTestPath
    private GroovyScriptEngine groovy

    StandaloneTestRunner(List<String> staticImports, Path workingDir) {
        this.staticImports = staticImports
        this.workingDir = workingDir.toAbsolutePath()
        this.tests = []
        this.exclusiveTests = []
        this.groovy = prepareGroovyEngine()
    }

    void process(Path scriptPath, delegate) {
        currentTestPath = scriptPath.isAbsolute() ? scriptPath : workingDir.resolve(scriptPath)

        def script = groovy.createScript((workingDir.relativize(currentTestPath)).toString(), new Binding())

        script.setDelegate(delegate)
        script.setProperty("scenario", this.&scenario)

        StandaloneTestListeners.beforeScriptParse(scriptPath)
        script.run()
    }

    List<StandaloneTest> getTests() {
        return tests
    }

    int getNumberOfPassed() {
        return tests.count { it.isPassed() }
    }

    int getNumberOfFailed() {
        return tests.count { it.isFailed() }
    }

    int getNumberOfErrored() {
        return tests.count { it.hasError() }
    }

    void scenario(String description, Closure code) {
        def test = new StandaloneTest(currentTestPath, description, code)
        tests.add(test)
    }

    void sscenario(String description, Closure code) {
        def test = new StandaloneTest(currentTestPath, description, code)
        exclusiveTests.add(test)
    }

    void runTests() {
        StandaloneTestListeners.beforeFirstTest()

        def testsToRun = exclusiveTests.isEmpty() ? tests : exclusiveTests
        def testsToSkip = exclusiveTests.isEmpty() ? [] : tests

        testsToSkip.each { test ->
            StandaloneTestListeners.beforeTestRun(test)
            StandaloneTestListeners.afterTestRun(test)
        }

        testsToRun.each { test ->
            StandaloneTestListeners.beforeTestRun(test)
            test.run()
            StandaloneTestListeners.afterTestRun(test)
        }

        StandaloneTestListeners.afterAllTests()
    }

    private GroovyScriptEngine prepareGroovyEngine() {
        def imports = new ImportCustomizer()
        def fullListOfStatics = staticImports + [StandaloneTestRunner.canonicalName]
        fullListOfStatics.forEach { imports.addStaticStars(it) }

        def compilerCfg = new CompilerConfiguration()
        compilerCfg.addCompilationCustomizers(imports)
        compilerCfg.scriptBaseClass = DelegatingScript.class.name

        def engine = new GroovyScriptEngine(workingDir.toString())
        engine.config = compilerCfg
        return engine
    }
}
