package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpMethod;
import com.despegar.http.client.PostMethod;

import ar.com.puentedeideas.shapeshift.ShapeshiftConnectionException;
import ar.com.puentedeideas.shapeshift.ShapeshiftRequest;
import ar.com.puentedeideas.shapeshift.ShapeshiftResponseException;

public class ShapeshiftTransactionCancellation {

	private ShapeshiftRequest request;

	private ShapeshiftTransactionCancellationUrl url;

	private ShapeshiftTransactionCancellationBody body;

	public ShapeshiftTransactionCancellation(HttpClient httpClient, String address) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = new ShapeshiftTransactionCancellationUrl();
		this.body = new ShapeshiftTransactionCancellationBody(address);
	}

	public JSONObject get(HttpMethod httpMethod) throws ShapeshiftConnectionException, ShapeshiftResponseException {
		return this.request.get(new PostMethod(this.url.toString(), this.body.toString(), false));
	}

}
