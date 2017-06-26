package ar.com.puentedeideas.shapeshift.deposit;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;

public final class ShapeshiftDepositLimit extends ShapeshiftGetRequest {
	
	public ShapeshiftDepositLimit(HttpClient httpClient, ShapeshiftPair pair) {
		super(httpClient, new ShapeshiftDepositLimitUrl(pair));
	}
		
}
