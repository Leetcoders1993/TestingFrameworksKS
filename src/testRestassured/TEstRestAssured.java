package testRestassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class TEstRestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RestAssured.baseURI = "";
		
		
		String res = given().log().all().basePath("").
		header("", "", "").body("").when().post().asString();
		
		
		JsonPath json = new JsonPath(res);
		
		json.get("firstName");
		
		json.get("lastName");
		

	}

}
