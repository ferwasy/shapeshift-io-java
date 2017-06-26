package ar.com.puentedeideas.shapeshift.validation;

import org.json.JSONObject;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftAddressValidation {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftAddressValidationUrl url;

	public ShapeshiftAddressValidation(HttpClient httpClient, String address, String coinSymbol) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftAddressValidationUrl(address, coinSymbol);
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new GetMethod(this.url.toString(), false));
	}
		
}
