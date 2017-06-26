package ar.com.puentedeideas.shapeshift.tx;

import org.json.JSONObject;

import ar.com.puentedeideas.shapeshift.ShapeshiftPostRequestBody;

final class ShapeshiftTransactionCancellationBody extends ShapeshiftPostRequestBody {
	
	ShapeshiftTransactionCancellationBody(String address) {
		super(new JSONObject().put("address", address));
	}
	
}
