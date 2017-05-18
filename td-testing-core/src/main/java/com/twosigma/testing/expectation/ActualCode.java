package com.twosigma.testing.expectation;

/**
 * @author mykola
 */
public class ActualCode implements ActualCodeExpectations {
    private CodeBlock actual;

    private ActualCode(final CodeBlock actual) {
        this.actual = actual;
    }

    public static ActualCodeExpectations code(CodeBlock actual) {
        return new ActualCode(actual);
    }

    @Override
    public void should(final CodeMatcher codeMatcher) {
        boolean matches = codeMatcher.matches(actual);
        if (! matches) {
            throw new AssertionError("\n" + codeMatcher.mismatchedMessage(actual));
        }
    }
}
