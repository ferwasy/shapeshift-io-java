package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

public class ShapeshiftGetRequest {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftUrl url;
	
	public ShapeshiftGetRequest(HttpClient httpClient, ShapeshiftUrl url) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = url;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
	

}
