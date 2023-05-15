package SeleniumProject.apis;


import SeleniumProject.Constants.Endpoints;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;

public class CartApi {
    public Cookies getCookies() {
        return cookies;
    }

    public CartApi(Cookies cookies) {
        this.cookies = cookies;
    }

    private Cookies cookies;

//    public Response addToCart(int productID,int quanity) throws IOException {
//        Header header=new Header("content-type","application/x-www-form-urlencoded");
//        Headers headers=new Headers(header);
//        HashMap<String,Object> formparams=new HashMap<>();
//        formparams.put("product_sku","");
//        formparams.put("produxt_id",productID);
//        formparams.put("quantity",quanity);
//
//       // Response response=ApiRequest.POST(Endpoints.ADD_TO_CART.url,headers,formparams,cookies);
//      //  this.cookies=response.getDetailedCookies();
//        return ;
//
//    }



}
