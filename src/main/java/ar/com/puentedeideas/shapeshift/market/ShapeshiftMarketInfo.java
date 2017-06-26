package ar.com.puentedeideas.shapeshift.market;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;

public final class ShapeshiftMarketInfo extends ShapeshiftGetRequest {
	
	public ShapeshiftMarketInfo(HttpClient httpClient) {
		super(httpClient, new ShapeshiftMarketInfoUrl());
	}
		
}
