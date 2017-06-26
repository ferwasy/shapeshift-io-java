package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpMethod;
import com.despegar.http.client.PostMethod;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftNormalTransaction {

	private ShapeshiftRequest shapeshiftRequest;

	private ShapeshiftNormalTransactionBody body;

	public ShapeshiftNormalTransaction(HttpClient httpClient, String withdrawal, ShapeshiftPair shapeshiftPair,
			String returnAddress) {
		this.shapeshiftRequest = new ShapeshiftRequest(httpClient);
		this.body = new ShapeshiftNormalTransactionBody(withdrawal, shapeshiftPair, returnAddress);
	}

	public JSONObject get(HttpMethod httpMethod) throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.shapeshiftRequest
				.get(new PostMethod(new ShapeshiftNormalTransactionUrl().toString(), this.body.toString(), false));
	}

}
