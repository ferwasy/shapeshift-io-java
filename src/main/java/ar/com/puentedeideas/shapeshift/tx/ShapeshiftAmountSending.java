package ar.com.puentedeideas.shapeshift.tx;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequest;

public final class ShapeshiftAmountSending extends ShapeshiftPostRequest {

	public ShapeshiftAmountSending(HttpClient httpClient, double amount, String withdrawal,
			ShapeshiftPair shapeshiftPair, String returnAddress) {
		super(httpClient, new ShapeshiftAmountSendingUrl(),
				new ShapeshiftAmountSendingBody(amount, withdrawal, shapeshiftPair, returnAddress));
	}

}
