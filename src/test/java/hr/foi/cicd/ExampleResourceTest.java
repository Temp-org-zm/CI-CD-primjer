package hr.foi.cicd;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ExampleResourceTest {

    @Test
    void exampleTest_passing() {
        assertThat(true).isTrue();
    }

    @Test
    @Disabled
    void exampleTest_failing() {
        assertThat(false).isTrue();
    }


    @Test
    void exampleTest_fullCoverage() {
        given()
                .when()
                .get("/api/resource")
                .then()
                .statusCode(200);
    }

}