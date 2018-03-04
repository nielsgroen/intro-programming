package assignment1;

public class Question6 {
	public static void main(String[] args) {		
		double sum = 0;
		int number = 2;
		for(int i=1; i<=3 ; i++) { 
			sum = sum + Math.pow(number, i);
		}
		System.out.println(sum);
		
		double sum2 = 0;
		int number2 = 2;
		for(int i=1; i<=6 ; i++) { 
			sum2 = sum2 + Math.pow(number2, i);
		}
		System.out.println(sum2);
		
		double sum3 = 0;
		int number3 = 2;
		for(int i=4; i<=6 ; i++) { 
			sum3 = sum3 + Math.pow(number3, i);
		}
		System.out.println(sum3);
		
		double sum4 = 0;
		int number4 = 3;
		for(int i=1; i<=4 ; i++) { 
			sum4 = sum4 + Math.pow(number4, i);
		}
		
		System.out.println(sum4);
	}
}
