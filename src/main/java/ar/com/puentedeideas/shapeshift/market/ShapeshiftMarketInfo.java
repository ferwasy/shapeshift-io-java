package ar.com.puentedeideas.shapeshift.market;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftMarketInfo {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftMarketInfoUrl url;
	
	public ShapeshiftMarketInfo(HttpClient httpClient) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftMarketInfoUrl();
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(this.url.toString(), false);
		return this.request.get(getMethod);
	}
		
}
