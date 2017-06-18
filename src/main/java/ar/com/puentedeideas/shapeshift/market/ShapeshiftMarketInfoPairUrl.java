package ar.com.puentedeideas.shapeshift.market;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftMarketInfoPairUrl extends ShapeshiftUrl {

	public ShapeshiftMarketInfoPairUrl(ShapeshiftPair shapeshiftPair) {
		super(new StringBuilder().append("/marketinfo").append('/').append(shapeshiftPair.toString()).toString());
	}

}
