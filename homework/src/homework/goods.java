package homework;

public class goods {
	// 필드
		String goods;
		int price;

		// 생성자
		goods(String goods, int price) {
			this.goods = goods;
			this.price = price;
		}

		// 메소드
		void getInfo() {
			System.out.println(goods + " : " + price);
		}
}
