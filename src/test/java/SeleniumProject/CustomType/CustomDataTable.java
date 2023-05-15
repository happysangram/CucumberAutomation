package SeleniumProject.CustomType;

import SeleniumProject.DomainObject.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTable {
    @DataTableType
    public BillingDetails billingEntry(Map<String,String> entry){
        return  new BillingDetails(entry.get("FirstName"),
                entry.get("LastName"),
                entry.get("Address"),
                entry.get("City"),
                entry.get("ZipCode"),
                entry.get("Email"));
    }
}
