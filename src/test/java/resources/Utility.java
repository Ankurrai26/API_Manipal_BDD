package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utility {

	
	public static RequestSpecification RequestSpecificationss() throws IOException {
		
		PrintStream log = new PrintStream(new FileOutputStream("logging1.text",true));
		
		RequestSpecification Pathspecified= new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo(log)).setBaseUri("https://computequoteapi-3scale-apicast-staging.uatwebservices.manipalcigna.com").addHeader("app_id","240f9d2c").addHeader("app_key", "12345").setContentType(ContentType.JSON).build();
System.out.println(GetPropertiesValue("baseurl"));
		return Pathspecified;
		
	}
	
	



public static String GetPropertiesValue(String key) throws IOException {
	
	Properties p =new Properties();

	FileInputStream intfile = new FileInputStream("C:\\Users\\PolicyGuru\\eclipse-workspace\\API_Manipal_BDD\\src\\test\\java\\resources\\global.properties");

	
	p.load(intfile);
	String propertydetail = p.getProperty(key);
	return propertydetail;
	
}


}
