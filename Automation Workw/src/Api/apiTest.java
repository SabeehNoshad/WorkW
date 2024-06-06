//package Api;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.http.HttpClient;
//
//import org.apache.hc.client5.http.classic.methods.HttpGet;
//import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
//import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
//import org.apache.hc.client5.http.impl.classic.HttpClients;
//import org.openqa.selenium.remote.http.HttpResponse;
//
//public class apiTest {
//	  public static void main(String[] args) throws IOException {
//	        // Create an instance of HttpClient
//	        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//	        // Define the API endpoint URL
//	        String apiUrl = "https://api.example.com/data";
//
//	        // Create an HTTP GET request
//	        HttpGet httpGet = new HttpGet(apiUrl);
//
//	        // Send the GET request and capture the response
//	        CloseableHttpResponse response = httpClient.execute(httpGet);
//
//	        // Extract the response status code
//	        int statusCode = response.getStatusLine().getStatusCode();
//	        System.out.println("Response Status Code: " + statusCode);
//
//	        // Read and print the response body
//	        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//	        StringBuilder responseBody = new StringBuilder();
//	        String line;
//	        while ((line = reader.readLine()) != null) {
//	            responseBody.append(line);
//	        }
//	        System.out.println("Response Body: " + responseBody);
//
//	        // Close the reader and release resources
//	        reader.close();
//	    }
//}
