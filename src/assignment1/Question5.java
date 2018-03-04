package assignment1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = in.nextLine();
		
		System.out.print("Hello ");
		System.out.print(name);
		System.out.print(", I'm a Java program.");
		System.out.println("");
		
		System.out.print("What's your favorite food? ");
		String food = in.nextLine();
		
		System.out.print("I like ");
		System.out.print(food);
		System.out.print(" too!");
		
		in.close();
	}
}
