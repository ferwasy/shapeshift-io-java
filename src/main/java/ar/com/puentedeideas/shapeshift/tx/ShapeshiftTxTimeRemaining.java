package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftTxTimeRemaining {
	
	private ShapeshiftRequest shapeshiftRequest;
	
	private String address;
	
	public ShapeshiftTxTimeRemaining(HttpClient httpClient, String address) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.address = address;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftTxTimeRemainingUrl(this.address).toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
