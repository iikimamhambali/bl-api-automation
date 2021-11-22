package postmodule;

import constant.Constanta;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PostMethod {

    @Test
    public void postMethod() {

        baseURI = "https://jsonplaceholder.cypress.io/posts";

        Response response = given()
                .contentType("application/json")
                .queryParam(Constanta.USER_ID,12)
                .queryParam(Constanta.TITLE, "recommendation")
                .queryParam(Constanta.BODY, "motocycle")
                .post();

        String resp = response.getBody().prettyPrint();
        System.out.println(resp);

    }
}
