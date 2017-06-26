package ar.com.puentedeideas.shapeshift.validation;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftAddressValidationUrl extends ShapeshiftUrl {

	ShapeshiftAddressValidationUrl(String address, String coinSymbol) {
		super(new StringBuilder().append("/validateAddress").append('/').append(address).append('/').append(coinSymbol).toString());
	}

}
