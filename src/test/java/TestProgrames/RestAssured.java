package TestProgrames;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestAssured {

    @Test
    public void testcase(){
        HashMap data = new HashMap();
        data.put("name", "satyam");
        data.put("job","engineer");
        given().body(data)
        .when().post("https://reqres.in/api/users")
                .then().statusCode(201).log().body();
    }
}
