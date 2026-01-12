package api.utils;

import io.restassured.RestAssured;
import utils.ConfigReader;

public class ApiBase {
	public static void init() {
		RestAssured.baseURI=ConfigReader.getBaseUrl();
	}

}
