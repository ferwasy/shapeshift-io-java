package ar.com.puentedeideas.shapeshift.market;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftMarketInfo {
	
	private ShapeshiftRequest shapeshiftRequest;
	
	public ShapeshiftMarketInfo(HttpClient httpClient) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftMarketInfoUrl().toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
