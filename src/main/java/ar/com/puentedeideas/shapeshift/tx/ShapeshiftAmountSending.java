package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpMethod;
import com.despegar.http.client.PostMethod;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftAmountSending {

	private ShapeshiftRequest request;

	private ShapeshiftAmountSendingUrl url;

	private ShapeshiftAmountSendingBody body;

	public ShapeshiftAmountSending(HttpClient httpClient, double amount, String withdrawal, ShapeshiftPair shapeshiftPair,
			String returnAddress) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftAmountSendingUrl();
		this.body = new ShapeshiftAmountSendingBody(amount, withdrawal, shapeshiftPair, returnAddress);
	}

	public JSONObject get(HttpMethod httpMethod) throws ShapeshiftConnectionException, ShapeshiftResponseException {
		PostMethod post = new PostMethod(this.url.toString(), this.body.toString(), false);
		post.addHeader("Content-Type", "application/json");
		return this.request.get(post);
	}

}
