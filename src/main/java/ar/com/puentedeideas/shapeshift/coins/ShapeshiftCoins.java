package ar.com.puentedeideas.shapeshift.coins;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;

public final class ShapeshiftCoins extends ShapeshiftGetRequest {
	
	public ShapeshiftCoins(HttpClient httpClient) {
		super(httpClient, new ShapeshiftCoinsUrl());
	}
	
}
