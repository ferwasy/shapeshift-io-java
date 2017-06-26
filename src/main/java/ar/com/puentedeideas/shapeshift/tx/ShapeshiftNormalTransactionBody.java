package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;

public class ShapeshiftNormalTransactionBody {
	
	private JSONObject json;

	public ShapeshiftNormalTransactionBody(String withdrawal, ShapeshiftPair shapeshiftPair, String returnAddress) {
		this.json = new JSONObject();
		this.json.put("withdrawal", withdrawal);
		this.json.put("pair", shapeshiftPair.toString());
		this.json.put("returnAddress", returnAddress);
	}
	
	public String toString() {
		return this.json.toString();
	}
	
}
