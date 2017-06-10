package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpClientException;
import com.despegar.http.client.HttpResponse;

public class ShapeshiftRate {
	
	private HttpClient httpClient;
	
	private ShapeshiftPair shapeshiftPair;

	public ShapeshiftRate(HttpClient httpClient, ShapeshiftPair pair) {
		this.httpClient = httpClient;
		this.shapeshiftPair = pair;
	}
	
	public JSONObject get() throws HttpClientException {
		StringBuilder urlBuffer = new StringBuilder();
		urlBuffer.append("https://shapeshift.io/rate/");
		urlBuffer.append(this.shapeshiftPair);
		GetMethod getMethod = new GetMethod(urlBuffer.toString(), false);
		getMethod.addHeader("Accept", "application/json; charset=utf-8");
		HttpResponse httpResponse = this.httpClient.execute(getMethod);
		System.out.println(httpResponse.code());
		System.out.println(new String(httpResponse.body()));
		return new JSONObject(new String(httpResponse.body()));
	}
	
	public static void main(String[] args) throws HttpClientException {
		System.out.println(new ShapeshiftRate(new HttpClient(1), new ShapeshiftPair("btc", "eth")).get().toString());
	}
	
}
