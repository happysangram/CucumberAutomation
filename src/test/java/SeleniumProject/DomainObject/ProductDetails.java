package SeleniumProject.DomainObject;

public class ProductDetails {

    public ProductDetails(String productName) {
        this.productName = productName;
    }

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
