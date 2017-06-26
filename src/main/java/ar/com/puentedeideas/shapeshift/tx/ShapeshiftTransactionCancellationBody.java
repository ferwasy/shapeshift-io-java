package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

public class ShapeshiftTransactionCancellationBody {
	
	private JSONObject json;

	public ShapeshiftTransactionCancellationBody(String address) {
		this.json = new JSONObject();
		this.json.put("address", address);
	}
	
	public String toString() {
		return this.json.toString();
	}
	
}
