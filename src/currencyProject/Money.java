package currencyProject;

public class Money extends Currency {


	private String nameOfNote = "Dollars";
	private String nameOfCoin = "Cents";

	Money(int dollarVal, int centVal) {
		super(dollarVal, centVal);
	}
	
	public String toString() {
		return super.getNote() + " " + nameOfNote + " " + super.getCoin() + " " + nameOfCoin ;
	}
	
	public static void main(String[] args) {
		Money value1 = new Money(1, 7);
		System.out.println(value1.toString());
	}

	

}
