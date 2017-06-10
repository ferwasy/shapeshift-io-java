package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpClientException;
import com.despegar.http.client.HttpResponse;

public class ShapeshiftCoins {
	
	private HttpClient httpClient;

	public ShapeshiftCoins(HttpClient httpClient) {
		this.httpClient = httpClient;
	}
	
	public JSONObject get() throws HttpClientException {
		GetMethod getMethod = new GetMethod("https://shapeshift.io/getcoins", false);
		getMethod.addHeader("Accept", "application/json; charset=utf-8");
		HttpResponse httpResponse = this.httpClient.execute(getMethod);
		System.out.println(httpResponse.code());
		System.out.println(new String(httpResponse.body()));
		return new JSONObject(new String(httpResponse.body()));
	}
	
	public static void main(String[] args) throws HttpClientException {
		System.out.println(new ShapeshiftCoins(new HttpClient(1)).get().toString());
	}
	
}
