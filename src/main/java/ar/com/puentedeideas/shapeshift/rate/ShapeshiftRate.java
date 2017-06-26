package ar.com.puentedeideas.shapeshift.rate;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftRate {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftRateUrl url;
	
	public ShapeshiftRate(HttpClient httpClient, ShapeshiftPair pair) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftRateUrl(pair);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
		
}
