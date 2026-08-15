package hr.foi.cicd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

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
                .get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello World"));
    }

}