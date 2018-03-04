package assignment1;

public class Question4 {
	public static void main(String[] args) {
		System.out.println(4.35*100);
		
		/*
		 * This is related to the round-off error which says the computer
		 * cannot always represent a number with a fraction part precisely,
		 * so that computations using this kind of numbers may be imprecise.
		 * 
		 * Integers are not affected by this problem.
		 * 
		 * From a practical point of view, money amount is a number with
		 * a potential fraction part, and hence, is subjected to this problem.
		 * However, in most applications, a money amount only has a finite
		 * number of decimals so that you can do all the calculations in cents
		 * to avoid this problem  
		 */
	}

}
