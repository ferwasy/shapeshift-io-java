package ar.com.puentedeideas.shapeshift.rate;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftRateUrl extends ShapeshiftUrl {

	ShapeshiftRateUrl(ShapeshiftPair shapeshiftPair) {
		super(new StringBuilder().append("/rate").append('/').append(shapeshiftPair.toString()).toString());
	}

}
