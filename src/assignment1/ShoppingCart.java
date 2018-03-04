package assignment1;

import java.util.Scanner;

public class ShoppingCart {
	final static int numProduct = 5;
	private String[] productList;
	private int[] priceList;
	private int totalPrice;
	private Scanner in;
	
	public static void main(String[] args) {
		/*
		 * Create two lists, productList and priceList
		 * Set totalPrice to 0
		 * Set constant numProduct to 5
		 * 
		 * Add products:
		 * Repeat numProduct times
		 * 		Input product price
		 * 		Add price to priceList
		 *  
		 *		Input product name 
		 * 		Add name to productList
		 * End
		 * 
		 * Check out:
		 * For each item in productList and priceList
		 * 		Print product name
		 * 		Print product prices
		 * 		Add product price to totalPrice
		 * End
		 * 
		 * Print totalPrice
		 * 
		 */
		ShoppingCart cart = new ShoppingCart();
		cart.add();
		cart.checkOut();
	}
	
	public ShoppingCart() {
		this.priceList = new int[ShoppingCart.numProduct];
		this.productList = new String[ShoppingCart.numProduct];
		this.totalPrice = 0;
		this.in = new Scanner(System.in);
	}
	
	public void checkOut() {
		System.out.println("Products in cart: ");
		for (int i = 0; i <= ShoppingCart.numProduct-1; i++) {
			System.out.println(this.productList[i]+ " : " + this.priceList[i]);
			this.totalPrice += this.priceList[i]; 
		}
		System.out.println("Total price: "+this.totalPrice);
	}
	
	public void add() {
		for (int i = 0; i <= ShoppingCart.numProduct-1; i++) {
			System.out.print("Input product name: ");
			this.productList[i] = in.nextLine();
			
			System.out.print("Input price: ");
			this.priceList[i] = in.nextInt();
			
			in.nextLine();
		}
		
		this.in.close();
		
	}
}
