package ar.com.puentedeideas.shapeshift.coins;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftCoins {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftCoinsUrl url;

	public ShapeshiftCoins(HttpClient httpClient) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftCoinsUrl();
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
	
}
