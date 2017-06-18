package ar.com.puentedeideas.shapeshift.coins;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftCoins {
	
	private ShapeshiftRequest shapeshiftRequest;

	public ShapeshiftCoins(HttpClient httpClient) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftCoinsUrl().toString(), false);
		getMethod.addHeader("Accept", "application/json; charset=utf-8");
		return this.shapeshiftRequest.get(getMethod);
	}
	
}
