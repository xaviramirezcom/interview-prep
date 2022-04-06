package strobogrammatic_number_ii;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat; 

import java.util.List;

import org.junit.Test;

public class StrobogrammaticNumberIISolutionTest {
    @Test
    public void when_2_Then_11_69_88_96() {

        StrobogrammaticNumberIISolution solver = new StrobogrammaticNumberIISolution();

        List<String> expected = solver.solve(2);

        assertThat(expected, hasItems("11", "69", "96"));
    }

    @Test
    public void when_1_Then_0_1_8() {

        StrobogrammaticNumberIISolution solver = new StrobogrammaticNumberIISolution();

        List<String> expected = solver.solve(1);

        assertThat(expected, hasItems("0", "1", "8"));

    }
}
