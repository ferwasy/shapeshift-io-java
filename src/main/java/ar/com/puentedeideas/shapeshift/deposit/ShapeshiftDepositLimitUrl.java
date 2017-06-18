package ar.com.puentedeideas.shapeshift.deposit;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftDepositLimitUrl extends ShapeshiftUrl {

	public ShapeshiftDepositLimitUrl(ShapeshiftPair shapeshiftPair) {
		super(new StringBuilder().append("/limit").append('/').append(shapeshiftPair.toString()).toString());
	}

}
