package ar.com.puentedeideas.shapeshift.tx;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequest;

public class ShapeshiftNormalTransaction extends ShapeshiftPostRequest {

	public ShapeshiftNormalTransaction(HttpClient httpClient, String withdrawal, ShapeshiftPair shapeshiftPair,
			String returnAddress) {
		super(httpClient, new ShapeshiftNormalTransactionUrl(),
				new ShapeshiftNormalTransactionBody(withdrawal, shapeshiftPair, returnAddress));
	}

}
