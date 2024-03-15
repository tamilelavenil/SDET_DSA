package restAssured_JIRA;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class summa {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "";
		RestAssured.authentication = RestAssured.preemptive().basic(null, null);
		Response response = RestAssured.given().contentType("application/json")
								.when()
								.body("")
								.post("path param");  //.get()//.delete
		
		response.prettyPrint();
		
		String id = response.jsonPath().get("key");
		
		response.then().assertThat().statusCode(200);
		response.then().assertThat().body("key",Matchers.equalTo(id));
		
	}
}
