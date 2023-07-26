package httpReq;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getReq {

	@Test
	 void getRequest1() {
		
		given()

		.when()
		    .get("https://reqres.in/api/users?page=2")

		.then()
		    .statusCode(200)
		    .body("page",equalTo(2))
		    .log().all();
		}
}
