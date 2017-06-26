package ar.com.puentedeideas.shapeshift.tx;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftTxTimeRemainingUrl extends ShapeshiftUrl {

	ShapeshiftTxTimeRemainingUrl(String address) {
		super(new StringBuilder().append("/timeremaining").append('/').append(address).toString());
	}

}
