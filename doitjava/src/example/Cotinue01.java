package example;

public class Cotinue01 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2 != 0) {
//				System.out.print("나머지가 없음: ");
//				break;	//반복문을 부수고 멈추게 하는 구문
				continue;
			}
			System.out.println(i);
		}
	}
}
