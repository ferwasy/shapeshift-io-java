package ar.com.puentedeideas.shapeshift.market;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftMarketInfoPair {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftMarketInfoPairUrl url;

	public ShapeshiftMarketInfoPair(HttpClient httpClient, ShapeshiftPair pair) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftMarketInfoPairUrl(pair);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
		
}
