package orange;

import static org.testng.Assert.assertEquals;

import java.security.InvalidAlgorithmParameterException;

import  org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiLearning {  
	@Test
	private void checkuser() {
		
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");

	
		System.out.println(response.statusCode());
		
		System.out.println(response.getTime());
		
		System.out.println(response.getHeader("content-type"));
		
	    System.out.println(response.asPrettyString());
		
		System.out.println(response.cookies());
		
		int statusCode = response.getStatusCode();
		
		System.out.println(response.getStatusCode());
		assertEquals(statusCode, 200);
		
		
	
	}
	@Test
	private void postData() {
		RestAssured.baseURI=("https://reqres.in/");
		
		 String data ="{\r\n"
		 		+ "    \"name\": \"morpheus\",\r\n"
		 		+ "    \"job\": \"leader\"\r\n"
		 		+ "}";

		 Response response = RestAssured.given().request()
		 .contentType("application/json")
		 .body(data)
		 .when()
		 .post("/api/users)")
		 .then().extract().response();
		 
		System.out.println(response.statusCode());
		
		System.out.println(response.getTime());
		
		System.err.println(response.getHeader(data));
		
		System.out.println(response.getCookies());
		
		System.out.println(response.asPrettyString());
		
		int Statuscode = response.getStatusCode();
		Assert.assertEquals(Statuscode, 201);
	}
	
	
	@Test
     private void putdata() {
	  RestAssured.baseURI=("https://reqres.in/");
		
		String data ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		 Response response3= RestAssured.given().request()
		.contentType("application/json")
		.body("data")
		.when()
		.put("\r\n"
				+ "/api/users/2")
		.then().extract().response();
		
		System.out.println(response3.getStatusCode());
		
		System.out.println(response3.getTime());
		
		System.out.println(response3.getHeader(data));
		
		System.out.println(response3.getCookie(data));	
		
		System.out.println(response3.asPrettyString());
			
			
		int Statuscode = response3.getStatusCode();
			
		Assert.assertEquals(Statuscode, 400);
			
	}
	@Test
	private void delete() {
		
	RestAssured.baseURI=("https://reqres.in/");
	
	Response response4 = RestAssured.given()
			.delete("/api/users/2")
			.then().extract().response();
	
	
			System.out.println(response4.getStatusCode());
			
			int statucode = response4.getStatusCode();
			Assert.assertEquals(statucode, 204);

	} 
	      
	private void test5() {
		
   
     
	}
	
	
	}
	
	
	
	

	
