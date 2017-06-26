package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftAmountSendingUrl extends ShapeshiftUrl {

	ShapeshiftAmountSendingUrl() {
		super(new StringBuilder().append("/sendamount").toString());
	}

}
