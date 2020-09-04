package chapter04;

public class BreakEx {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;	//switch문을 파괴하는 break입니다.
		default:
			System.out.println("num은 1과 2가 아닌 다른 수입니다.");
		}
		
		while(true) {	//조건이 true이면 무한반복문입니다.
			System.out.println("반복중.." + num);
			num++;
			if(num > 10) {
				break;	//while문을 파괴하는 break입니다.
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.print("*");
			break;
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("@");
				break;
			}
			System.out.println();
		}
	}
}







