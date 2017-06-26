package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

import com.despegar.http.client.HttpClient;
import com.despegar.http.client.PostMethod;

public class ShapeshiftPostRequest {
	
	private ShapeshiftRequest request;
	
	private ShapeshiftUrl url;
	
	private ShapeshiftPostRequestBody body;
	
	public ShapeshiftPostRequest(HttpClient httpClient, ShapeshiftUrl url, ShapeshiftPostRequestBody body) {
		this.request = new ShapeshiftRequest(httpClient);
		this.url = url;
		this.body = body;
	}
	
	public JSONObject get() throws ShapeshiftConnectionException, ShapeshiftResponseException {
		PostMethod post = new PostMethod(this.url.toString(), this.body.toString(), false);
		post.addHeader("Content-Type", "application/json");
		return this.request.get(post);
	}

}
