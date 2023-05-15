package SeleniumProject.CustomType;

import SeleniumProject.DomainObject.ProductDetails;

public class ParameterType {

    @io.cucumber.java.ParameterType(".*")
    public ProductDetails productDetails(String name){
        return new ProductDetails(name.replace("\"",""));
    }
}
