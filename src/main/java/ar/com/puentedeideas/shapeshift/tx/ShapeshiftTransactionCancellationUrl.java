package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftTransactionCancellationUrl extends ShapeshiftUrl {

	public ShapeshiftTransactionCancellationUrl() {
		super(new StringBuilder().append("/cancelpending").toString());
	}

}
