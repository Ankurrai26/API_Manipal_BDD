package stepDefinations;

import io.cucumber.core.resource.Resource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoPackageSerialization.GetQuoteApiPojo;
import resources.APIResource;
import resources.Utility;

public class StepDefinations extends Utility {
	
	RequestSpecification Res;
	Response response;
	
	 

	@Given("Add payload with {string} {string} {string} {int} {int}")
	public void add_payload_with(String productId, String PolicyType, String productPlanOptionCd, int noOfAdults, int noOfKids)throws IOException {
	   
		
		 Res = given().log().all().spec(RequestSpecificationss()).body(GetQuoteApiPojo.getQuoteApiPojo(productId, PolicyType, productPlanOptionCd, noOfAdults, noOfKids));
		
		
		
	}

	@When("Users call {string} with http request {string}")
	public void users_call_with_http_request(String resource, String method) {
	    
		APIResource resourcepath = APIResource.valueOf(resource);
		
		if (method.equalsIgnoreCase("POST"))
			response = Res.when().post(resourcepath.Getresource());
		else if (method.equalsIgnoreCase("GET"))
			response = Res.when().get(resourcepath.Getresource());
		else if (method.equalsIgnoreCase("DELETE"))
			response = Res.when().delete(resourcepath.Getresource());
		
	}

	@Then("The API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(int statuscode) {
	    
		assertEquals(response.getStatusCode(), statuscode);
		
	}

	
}
