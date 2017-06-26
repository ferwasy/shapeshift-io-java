package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftNormalTransactionUrl extends ShapeshiftUrl {

	public ShapeshiftNormalTransactionUrl() {
		super(new StringBuilder().append("/shift").toString());
	}

}
