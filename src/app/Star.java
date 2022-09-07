package app;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int stdInt = sc.nextInt();
		
		for(int i = 0; i < stdInt; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = stdInt; i < 0; i--) {
			for(int j = i+1; j < 05; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
