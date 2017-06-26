package ar.com.puentedeideas.shapeshift.validation;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftGetRequest;

public final class ShapeshiftAddressValidation extends ShapeshiftGetRequest {
	
	public ShapeshiftAddressValidation(HttpClient httpClient, String address, String coinSymbol) {
		super(httpClient, new ShapeshiftAddressValidationUrl(address, coinSymbol));
	}
	
}