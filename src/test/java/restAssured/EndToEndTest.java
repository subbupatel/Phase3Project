package restAssured;

import java.util.HashMap;
import java.util.Map;

public class EndToEndTest<Response> {

	Response response;
	String baseURI = "http://localhost:3000";
	
	public Response GetALLEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification request = RestAssured.given();
	    response = request.get("employees");
	    
		System.out.println( response.getBody().asString());
        return response;
		
	}
public Response GetSingleEmployee(int EmpID) {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification request = RestAssured.given();
	    Response response = request.param("Id" , EmpID).get("employees");
	    
		System.out.println( response.getBody().asString());
        return response;
}
	
public Response CreateEmp() {
	
	RestAssured.baseURI = "http://localhost:3000";
	RequestSpecification request = RestAssured.given();
   Map<String, Object> MapObj = new HashMap<String,object>();
   MapObj.put("name", "Ravi");
   MapObj.put("salary", "3000");
   
   Response response=request
		 .contentType(ContentType.JSON) 
		 .accept(ContentType.JSON)
		 .body(MapObj)
		 .post(Employees/Create);
		 
	System.out.println( response.getBody().asString());
    return response;
}

public Response UpdateEmp() {
	
	RestAssured.baseURI = "http://localhost:3000";
	RequestSpecification request = RestAssured.given();
   Map<String, Object> MapObj = new HashMap<String,object>();
   MapObj.put("name", "suresh");
   MapObj.put("salary", "8000");
   
   Response response=request.contentType(ContentType.JSON).accept(ContentType.JSON).body(MapObj).post(Employees/Update);
			 
		System.out.println( response.getBody().asString());
	    return response;
	}

public Response DelateEmpID() {
	
	RestAssured.baseURI = "http://localhost:3000";
	
	RequestSpecification request = RestAssured.given();
	
	Response response = request.delete("employees/5");
	
	int responseCode = response.getStatusCode();
	Assert.assertEquals(200, responseCode);
		
}



