package test2;

public class TossCard extends Card {
	
	private String company = "Toss";
	private String cardStaff;
	
	public TossCard(String cardNo, int validDate, int cvc) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
	}
	
	
}
