package getmodule;

import static io.restassured.RestAssured.*;

import constant.Constanta;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMethod {

    private final static String url = "https://jsonplaceholder.cypress.io/posts";

    @Test
    public void testGet() {
        given().when().get(url).then().log().body();

//        given().queryParam(Constanta.USER_ID, "1")
//                .queryParam(Constanta.ID, "2")
//                .when().get(url).then().log().all();

//        String responseObject = RestAssured.get(url).then().extract().asPrettyString();
//        System.out.println(responseObject);

//        JsonPath jsonPath = new JsonPath(responseObject);
//        String userId = jsonPath.get("userId").toString();
//        System.out.println(userId);
    }
}