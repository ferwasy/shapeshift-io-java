package ar.com.puentedeideas.shapeshift.deposit;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftDepositStatus {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftDepositStatusUrl url;
	
	public ShapeshiftDepositStatus(HttpClient httpClient, String address) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftDepositStatusUrl(address);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
		
}
