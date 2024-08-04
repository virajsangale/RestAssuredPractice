package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	static RequestSpecification req;
	public RequestSpecification RequestSpecificationBuild() throws IOException {
		
		if(req == null) {
		PrintStream log = new PrintStream("logging.txt");
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		req = new RequestSpecBuilder().setBaseUri(GetGlobalValues("baseUrl")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		return req;
		}
		return req;
	}
	
	public static String GetGlobalValues(String key) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("/Users/virajsangale/Desktop/Api_Automation/RestAssured/APIFramework/src/test/java/resources/global.properties");
		props.load(fis);
		return props.getProperty(key);
	}
}
