package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

public class ShapeshiftRate {
	
	private static final String URL_BEGINNING = "https://shapeshift.io/rate/"; 
	
	private ShapeshiftRequest shapeshiftRequest;
	
	private ShapeshiftPair shapeshiftPair;

	public ShapeshiftRate(HttpClient httpClient, ShapeshiftPair pair) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.shapeshiftPair = pair;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		StringBuilder urlBuffer = new StringBuilder();
		urlBuffer.append(URL_BEGINNING);
		urlBuffer.append(this.shapeshiftPair);
		GetMethod getMethod = new GetMethod(urlBuffer.toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
