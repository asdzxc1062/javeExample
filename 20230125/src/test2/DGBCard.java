package test2;

public class DGBCard extends Card {

	private String company = "대구은행";
	private String cardStaff;

	
	public DGBCard(String cardNo, int validDate, int cvc) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
	}
	
	
}
