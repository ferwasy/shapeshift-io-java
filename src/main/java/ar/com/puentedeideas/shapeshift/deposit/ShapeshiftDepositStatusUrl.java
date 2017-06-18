package ar.com.puentedeideas.shapeshift.deposit;

import ar.com.puentedeideas.shapeshift.ShapeshiftUrl;

public class ShapeshiftDepositStatusUrl extends ShapeshiftUrl {

	public ShapeshiftDepositStatusUrl(String address) {
		super(new StringBuilder().append("/txStat").append('/').append(address).toString());
	}

}
