package test3;

public class CardPayment implements Payment {

	double cardRatio;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;

		
	}

	@Override
	public int online(int price) {
		return 0;
	}

	@Override
	public int offline(int price) {
		return 0;
	}

	@Override
	public void showInfo() {
		
	}
}
