package ar.com.puentedeideas.shapeshift.rate;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;

public final class ShapeshiftRate extends ShapeshiftGetRequest {
	
	public ShapeshiftRate(HttpClient httpClient, ShapeshiftPair pair) {
		super(httpClient, new ShapeshiftRateUrl(pair));
	}
		
}
