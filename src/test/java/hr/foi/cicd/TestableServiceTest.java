package hr.foi.cicd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestableServiceTest {

    @Test
    void testSum() {
        TestableService service = new TestableService();
        final var sum = service.sum(2, 3);
        assertThat(sum).isEqualTo(5);
    }

    @Test
    void testSub() {
        TestableService service = new TestableService();
        service.sub(2, 0);
    }
}