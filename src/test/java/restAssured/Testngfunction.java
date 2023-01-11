package restAssured;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngfunction extends EndToEndTest {
	
	@Test
	public void test1() {
		
		System.out.println("Get ALL Employees");
		
		response = GetALLEmployee();
		Assert.assertEquals(200, response.getStatusCode());

        System.out.println("Get Single Employee");
		
		response=GetSingleEmployee(2);
		Assert.assertEquals(200, response.getStatusCode());
}

}