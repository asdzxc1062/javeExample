package test2;

public class Card {
	private String cardNo;
	private int validDate;
	private int cvc;

	public Card(String cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;

	}
	public String getCardNo() {
		return cardNo;
	}
	public int getValidDate() {
		return validDate;
	}
	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println();
	}
}
