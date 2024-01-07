package Tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;


public class POSTRestAssured {
	@Test
	public void Post() {
		baseURI="https://reqres.in/api";
		Map<String,Object > map=new HashMap<String, Object>();
//		map.put("name","Rohit Bhardwaj");
//		map.put("job","Engineer");
//		System.out.println(map);
		
		JSONObject request=new JSONObject();
		request.put("name", "Rohit Bhardwaj");
		request.put("job", "Engineer");
		System.out.println(request);
		
		
		
		
	}

}
