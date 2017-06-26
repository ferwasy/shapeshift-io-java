package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import ar.com.puentedeideas.shapeshift.ShapeshiftPair;
import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequestBody;

final class ShapeshiftNormalTransactionBody extends ShapeshiftPostRequestBody {

	ShapeshiftNormalTransactionBody(String withdrawal, ShapeshiftPair shapeshiftPair, String returnAddress) {
		super(new JSONObject().put("withdrawal", withdrawal).put("pair", shapeshiftPair.toString()).put("returnAddress",
				returnAddress));
	}

}
