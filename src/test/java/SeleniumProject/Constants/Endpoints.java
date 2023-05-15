package SeleniumProject.Constants;

public enum Endpoints {

    STORE("/Store");
    //ADD_TO_CART("/cart");

    public final String url;
    Endpoints(String url) {
        this.url=url;
    }
}
