package example;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요: ");
		int num = sc.nextInt();
		String str = "";
		if(num % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str);
		
		System.out.println(num % 2 == 0 ? "짝수2" : "홀수2" );
		sc.close();
	}
}
