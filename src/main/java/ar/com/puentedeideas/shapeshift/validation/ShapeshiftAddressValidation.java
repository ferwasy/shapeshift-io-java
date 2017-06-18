package ar.com.puentedeideas.shapeshift.validation;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftAddressValidation {
	
	private ShapeshiftRequest shapeshiftRequest;
	
	private String address;
	
	private String coinSymbol;

	public ShapeshiftAddressValidation(HttpClient httpClient, String address, String coinSymbol) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.address = address;
		this.coinSymbol = coinSymbol;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		GetMethod getMethod = new GetMethod(new ShapeshiftAddressValidationUrl(this.address, this.coinSymbol).toString(), false);
		return this.shapeshiftRequest.get(getMethod);
	}
		
}
