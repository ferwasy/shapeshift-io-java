package ar.com.puentedeideas.shapeshift.market;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftMarketInfoPair {
	
	private ShapeshiftRequest shapeshiftRequest;
	
	private ShapeshiftPair shapeshiftPair;

	public ShapeshiftMarketInfoPair(HttpClient httpClient, ShapeshiftPair pair) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.shapeshiftPair = pair;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftMarketInfoPairUrl(this.shapeshiftPair).toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
