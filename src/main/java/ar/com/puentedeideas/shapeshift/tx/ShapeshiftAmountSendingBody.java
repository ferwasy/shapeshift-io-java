package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequestBody;

final class ShapeshiftAmountSendingBody extends ShapeshiftPostRequestBody {
	
	ShapeshiftAmountSendingBody(double amount, String withdrawal, ShapeshiftPair shapeshiftPair, String returnAddress) {
		super(new JSONObject().put("amount", amount).put("withdrawal", withdrawal).put("pair", shapeshiftPair.toString()).put("returnAddress", returnAddress));
	}
	
}
