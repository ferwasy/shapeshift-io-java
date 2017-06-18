package ar.com.puentedeideas.shapeshift.deposit;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftDepositStatus {
	
	private ShapeshiftRequest shapeshiftRequest;
	
	private String address;
	
	public ShapeshiftDepositStatus(HttpClient httpClient, String address) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.address = address;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftDepositStatusUrl(this.address).toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
