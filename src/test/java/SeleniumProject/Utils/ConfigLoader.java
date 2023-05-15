package SeleniumProject.Utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    private static ConfigLoader configLoader;
    private static Properties prop;


    private ConfigLoader() throws IOException {
        prop= PropertyUtils.propertyLoader("src/test/resources/config.properties");
    }
    public static ConfigLoader getInstance() throws IOException {
        if(configLoader==null) {
            configLoader = new ConfigLoader();
        }

        return configLoader;
    }

    public String getBaseUrl(){

       String url= prop.getProperty("url");
       return url;
    }
}
