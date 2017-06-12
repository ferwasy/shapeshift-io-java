package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

public class ShapeshiftCoins {
	
	private static final String URL = "https://shapeshift.io/getcoins";
	
	private ShapeshiftRequest shapeshiftRequest;

	public ShapeshiftCoins(HttpClient httpClient) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(URL, false);
		getMethod.addHeader("Accept", "application/json; charset=utf-8");
		return this.shapeshiftRequest.get(getMethod);
	}
	
}
