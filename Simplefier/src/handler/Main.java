package handler;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		TextHandler th = new TextHandler();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text");
		String self = sc.nextLine();
		self = th.simplify(self);
		System.out.println(self);
		
	}

}
