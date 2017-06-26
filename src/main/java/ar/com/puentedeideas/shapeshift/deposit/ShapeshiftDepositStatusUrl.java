package ar.com.puentedeideas.shapeshift.deposit;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

final class ShapeshiftDepositStatusUrl extends ShapeshiftUrl {

	ShapeshiftDepositStatusUrl(String address) {
		super(new StringBuilder().append("/txStat").append('/').append(address).toString());
	}

}
