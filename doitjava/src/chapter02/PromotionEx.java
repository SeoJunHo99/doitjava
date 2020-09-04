package chapter02;

public class PromotionEx {
	public static void main(String args[]){
		byte byteValue = 10;
		int intValue = byteValue;	//int <- byte
		System.out.println(intValue);
//		byteValue = intValue;

		char charValue = 0;
		intValue = charValue;	//int <- char
		System.out.println("媛��쓽 �쑀�땲肄붾뱶 : " + intValue);

		intValue = 200;
		double doubleValue = intValue;	//double <- int
		System.out.println(doubleValue);
//		intValue = doubleValue;
		
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue;
		
		long longValue = 10000L;
		long res2 = intValue + longValue;
	}
}












