package ar.com.puentedeideas.shapeshift.rate;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftRateUrl extends ShapeshiftUrl {

	public ShapeshiftRateUrl(ShapeshiftPair shapeshiftPair) {
		super(new StringBuilder().append("/rate").append('/').append(shapeshiftPair.toString()).toString());
	}

}
