/*import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("2a4543d025144cf699160843251504");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ApisApi apiInstance = new ApisApi();
        String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
        LocalDate dt = LocalDate.now(); // LocalDate | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
        try {
            Object result = apiInstance.astronomy(q, dt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#astronomy");
            e.printStackTrace();
        }
    }
} */