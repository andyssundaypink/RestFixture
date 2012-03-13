package smartrics.rest.test.fitnesse.drivers;

import org.junit.Before;
import org.junit.Test;

import fitnesse.junit.JUnitHelper;

public class RunFromJUnitTest {

    private JUnitHelper helper;

    @Before
    public void setup() {
        helper = new JUnitHelper("build/fitnesse", "build/output");
    }

    @Test
    public void run_RestFixtureTests_SlimTests_SequenceDiagrams() throws Exception {
        helper.assertTestPasses("RestFixtureTests.SlimTests.SequenceDiagrams");
    }
}
