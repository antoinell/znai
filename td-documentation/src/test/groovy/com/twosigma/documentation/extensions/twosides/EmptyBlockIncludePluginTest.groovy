package com.twosigma.documentation.extensions.twosides

import com.twosigma.documentation.extensions.PluginParams
import org.junit.Test

class EmptyBlockIncludePluginTest {
    @Test
    void "converts rightSide to meta-rightSide"() {
        def plugin = new EmptyBlockIncludePlugin()
        def result = plugin.process(null, null, null, new PluginParams(plugin.id(),
                [rightSide: true]))

        result.docElements*.toMap().should == [[meta: [rightSide: true], type: 'EmptyBlock']]
    }
}
