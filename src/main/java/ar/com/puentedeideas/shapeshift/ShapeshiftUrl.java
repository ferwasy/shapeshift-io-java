package ar.com.puentedeideas.shapeshift;

public class ShapeshiftUrl {
	
	private static final String BASE_URL = "https://shapeshift.io";
	
	private String relativeUrl;
	
	public ShapeshiftUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}
	
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(BASE_URL);
		buffer.append(this.relativeUrl);
		return buffer.toString();
	}	

}
