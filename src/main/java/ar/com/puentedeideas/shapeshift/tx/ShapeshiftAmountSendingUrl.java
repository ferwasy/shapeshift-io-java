package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftAmountSendingUrl extends ShapeshiftUrl {

	public ShapeshiftAmountSendingUrl() {
		super(new StringBuilder().append("/sendamount").toString());
	}

}
