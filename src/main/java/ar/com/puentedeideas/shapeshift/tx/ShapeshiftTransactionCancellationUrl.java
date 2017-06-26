package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftTransactionCancellationUrl extends ShapeshiftUrl {

	ShapeshiftTransactionCancellationUrl() {
		super(new StringBuilder().append("/cancelpending").toString());
	}

}
