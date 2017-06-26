package ar.com.puentedeideas.shapeshift.tx;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;

public class ShapeshiftTxTimeRemaining extends ShapeshiftGetRequest {
	
	public ShapeshiftTxTimeRemaining(HttpClient httpClient, String address) {
		super(httpClient, new ShapeshiftTxTimeRemainingUrl(address));
	}
		
}
