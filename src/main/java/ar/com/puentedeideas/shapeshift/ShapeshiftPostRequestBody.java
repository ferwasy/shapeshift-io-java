package ar.com.puentedeideas.shapeshift;

import org.json.JSONObject;

public class ShapeshiftPostRequestBody {

	private JSONObject json;
	
	public ShapeshiftPostRequestBody(JSONObject json) {
		this.json = json;
	}
	
	public String toString() {
		return this.json.toString();
	}
	
}
