package ar.com.puentedeideas.shapeshift.tx;

import com.despegar.http.client.HttpClient;

import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequest;

public class ShapeshiftTransactionCancellation extends ShapeshiftPostRequest {

	public ShapeshiftTransactionCancellation(HttpClient httpClient, String address) {
		super(httpClient, new ShapeshiftTransactionCancellationUrl(), new ShapeshiftTransactionCancellationBody(address));
	}

}
