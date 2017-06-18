package ar.com.puentedeideas.shapeshift.validation;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftAddressValidationUrl extends ShapeshiftUrl {

	public ShapeshiftAddressValidationUrl(String address, String coinSymbol) {
		super(new StringBuilder().append("/validateAddress").append('/').append(address).append('/').append(coinSymbol).toString());
	}

}
