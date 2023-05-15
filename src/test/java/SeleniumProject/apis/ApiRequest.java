package SeleniumProject.apis;

import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;

import static SeleniumProject.apis.SpecBuilder.getResponseSpec;
import static SeleniumProject.apis.SpecBuilder.getResquestSpec;
import static io.restassured.RestAssured.given;

public class ApiRequest {
    public static Response POST(String endpoint, Headers headers, HashMap<String,Object> formParams, Cookies cookies) throws IOException {

        return given(getResquestSpec()).
                headers(headers).
                formParams(formParams).
                cookies(cookies).
                when().
                post(endpoint).
                then().spec(getResponseSpec()).
                extract().
                response();
    }

    public static Response GET(String endpoint, Cookies cookies) throws IOException {

        return given(getResquestSpec()).
                cookies(cookies).
                when().
                get(endpoint).
                then().spec(getResponseSpec()).
                extract().
                response();
    }
}
