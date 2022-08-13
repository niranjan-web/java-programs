package oops;

public class insufficientFundException extends Exception {
	
	int amount;
	public insufficientFundException(int withDraw) {
		amount = withDraw;
	}
	
}
