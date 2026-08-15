package hr.foi.cicd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleResourceTest {

    @Test
    void exampleTest_passing() {
        assertThat(true).isTrue();
    }

    @Test
    void exampleTest_failing() {
        assertThat(false).isTrue();
    }

}