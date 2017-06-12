package ar.com.puentedeideas.shapeshift;

import org.json.JSONException;
import org.json.JSONObject;

import com.despegar.http.client.HttpClient;
import com.despegar.http.client.HttpClientException;
import com.despegar.http.client.HttpMethod;
import com.despegar.http.client.HttpResponse;

public class ShapeshiftRequest {
	
	private HttpClient httpClient;
	
	public ShapeshiftRequest(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public JSONObject get(HttpMethod httpMethod) throws ShapeshiftConnectionException, ShapeshiftResponseException {
		HttpResponse httpResponse = null;
		try {
			httpResponse = this.httpClient.execute(httpMethod);
		} catch (HttpClientException e) {
			throw new ShapeshiftConnectionException("Error connecting to ShapeShift: " + e.getMessage(), e);
		}
		if (httpResponse.code() == 200) {
			JSONObject json = null;
			try {
				json = new JSONObject(new String(httpResponse.body()));
			} catch (JSONException e) {
				throw new ShapeshiftResponseException("Error parsing ShapeShift response: " + e.getMessage(), e);
			}
			if (json.has("error")) {
				throw new ShapeshiftResponseException("Error in ShapeShift response: " + json.getString("error"));
			} else {
				return json;
			}
		} else {
			throw new ShapeshiftConnectionException("Error in ShapeShift response. Status code: " + httpResponse.code());
		}
	}	
	
}
