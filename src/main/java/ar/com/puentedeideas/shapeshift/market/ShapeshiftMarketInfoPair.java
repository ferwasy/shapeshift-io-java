package ar.com.puentedeideas.shapeshift.market;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;

public final class ShapeshiftMarketInfoPair extends ShapeshiftGetRequest {
	
	public ShapeshiftMarketInfoPair(HttpClient httpClient, ShapeshiftPair pair) {
		super(httpClient, new ShapeshiftMarketInfoPairUrl(pair));
	}
		
}
