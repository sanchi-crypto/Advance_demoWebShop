package api.requests;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;
import api.payloads.RegisterPayload;
import api.utils.ApiBase;
import io.restassured.RestAssured;

public class RegisterUserAPI {
	public static void register(String email,String password) {
		ApiBase.init();
		RegisterPayload payload=new RegisterPayload();
		payload.Email=email;
		payload.Password=password;
		payload.ConfirmPassword=password;
		RestAssured.given().contentType("application/json")
		.body(payload).post("/register").then().statusCode(anyOf(is(200), is(302)));;
	}

}
