package testRestassured;

import io.restassured.path.json.JsonPath;

public class JSONParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jsonstring = "Result:\r\n"
				+ "  {\r\n"
				+ "   \"Status\": \"ok\",\r\n"
				+ "    \"StatusCode\": 200,\r\n"
				+ "   \"welcome\":{\r\n"
				+ "   \"firstName\":\"Sanjay\",\r\n"
				+ "   \"lastName\":\"Adaki\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		
		System.out.println(jsonstring);
		
		
		
		JsonPath json = new JsonPath(jsonstring);
		
		System.out.println(json.get("Status"));

	}

}
