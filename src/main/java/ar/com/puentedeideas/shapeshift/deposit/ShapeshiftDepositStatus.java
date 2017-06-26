package ar.com.puentedeideas.shapeshift.deposit;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;

public final class ShapeshiftDepositStatus extends ShapeshiftGetRequest {
	
	public ShapeshiftDepositStatus(HttpClient httpClient, String address) {
		super(httpClient, new ShapeshiftDepositStatusUrl(address));
	}
		
}
