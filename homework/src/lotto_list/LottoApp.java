package lotto_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	Scanner sc = new Scanner(System.in);

	int menu = 0;

	List<Lotto> list = new ArrayList<>();
	
	String userName = "";
	public LottoApp() {
		run();
	}

	private void run() {

		while (menu != 99) {
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	private void menuInfo() {
		System.out.println("메뉴를 선택해주세요.\n");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
	}

	private void makeLotto() {
		System.out.println("userName>");
		userName = sc.nextLine();
		System.out.println("금액>");
		
		int money;
		
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			list.add(makeNumber());
		}
		
		System.out.println("번호 출력 완료\n");
	}

	private void showInfo() {
		
		Lotto lottos = new Lotto();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(userName)) {
				lottos = list.get(i);
				break;
			}
		}
		System.out.println("조회 이름 > " + lottos.getName());
		System.out.println("구매 한 금액> " + (lottos.getLottoNo().size() * 1000) + "원");
		
		for (int i = 0; i < lottos.getLottoNo().size(); i++) {
		
			System.out.print((i % 5 + 1) + "번>");
			
			
			
			for (int j = 0; j < 6; j++) {
				System.out.print(lottos.getLottoNo().get(i)[j] + " "); 
			}
			
			System.out.println();
			
			if ((i+1) != 0 && (i+1) % 5 == 0) {
				System.out.println("-------------------------------------");
			}
		}
	}

	private Lotto makeNumber() {
		
		Lotto lotto = null;
		
		List<int[]> makeLotto = new ArrayList<>();
		
		int[] lottoNo = new int[6];
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(userName)) {
				lotto = list.get(i);
			}
		}
		
		if(lotto == null) {
			lotto = new Lotto();
		}
		
		for (int i = 0; i < 6; i++) {
			
			lottoNo[i] = (int) (Math.random() * 45) + 1;
			
			if (i > 0) {
			
				for (int j = 0; j < i; j++) {
				
					if (lottoNo[j] == lottoNo[i]) {
						i -= 1;
						break;
					}
				}
			}
		}
		makeLotto.add(lottoNo);
		lotto.setLottoNo(makeLotto);
		lotto.setName(userName);
		return lotto;
	}
}
