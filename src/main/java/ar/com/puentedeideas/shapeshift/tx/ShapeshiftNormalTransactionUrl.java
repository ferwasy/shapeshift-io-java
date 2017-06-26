package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftNormalTransactionUrl extends ShapeshiftUrl {

	ShapeshiftNormalTransactionUrl() {
		super(new StringBuilder().append("/shift").toString());
	}

}
