package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftTxTimeRemainingUrl extends ShapeshiftUrl {

	public ShapeshiftTxTimeRemainingUrl(String address) {
		super(new StringBuilder().append("/timeremaining").append('/').append(address).toString());
	}

}
