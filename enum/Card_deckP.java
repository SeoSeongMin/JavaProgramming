package week_6;

public class Card_deckP {
	int card = 0;
	
	Card_deckP(){ //덱 클래스 생성
			card = Random_number();
	}
	
	static int Random_number() {//랜덤 2~10 호출
		int RN = (int) Math.floor(Math.random() * 9) + 2;
		return RN;
	}
	
	static void printf(Card_deckP[] cd) { //몇 장의 카드가 있는지 출력
		int count = 0;
		for(int i = 0; i < cd.length;i++) {
			count += 1;
			if(cd[i].card == -1) {
				break;
			}
		}
		System.out.println("현재 남아 있는 카드의 수는 : "+count);
		System.out.println();
	}
	
	static void deal(Card_deckP[] cd) {//카드를 나눠줌
		for (int i = cd.length-1; i >= 0; i--) {
			if(cd[i].card != -1) {
				System.out.println("다이아몬트 "+ cd[i].card);
				cd[i].card = -1;
				break;
			}
			if(cd[0].card == -1) {
				System.out.println("장이 모두 비였습니다.");
				break;			
			}
		}
	}
		
	public static void main(String[] args) {		
		//카드 덱 클래스 생성
		Card_deckP[] cd = new Card_deckP[3];
		for (int i = 0; i <cd.length ; i++) {
			cd[i] = new Card_deckP();
		}

		printf(cd); //카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력
		
		deal(cd); //카드를 한 장 나눠줌
		printf(cd); //카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력
		
		deal(cd); //카드를 한 장 나눠줌
		printf(cd);//카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력
		}
	}