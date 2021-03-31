package learnAPI;

import java.io.IOException;

import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;


public class Get200 {
	public String baseEND_POINT = "https://api.github.com/";
	
	HttpClient client = (HttpClient) HttpClientBuilder.create().build();
//	Comment
	@Test
	public void baseURL200() throws ClientProtocolException, IOException {
		
		HttpGet get = new HttpGet(baseEND_POINT);
		HttpResponse response = client.execute(get);
		
		
	}

}
