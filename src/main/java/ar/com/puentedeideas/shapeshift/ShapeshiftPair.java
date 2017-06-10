package ar.com.puentedeideas.shapeshift;

public class ShapeshiftPair {
	
	private String deposit;
	
	private String withdrawal;

	public ShapeshiftPair(String deposit, String withdrawal) {
		this.deposit = deposit;
		this.withdrawal = withdrawal;
	}
	
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(this.deposit);
		buffer.append('_');
		buffer.append(this.withdrawal);
		return buffer.toString();
	}
	

}
