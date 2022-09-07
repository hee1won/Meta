package app;

import java.util.*;

public class Arrays {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int max = a;
//		
//		if(b > a) {
//			max = b;
//		}
//		if(c > b) {
//			max = c;
//		}
//		System.out.println(max);
		
		
		int[] q = {1, 2, 3, 4, 5};
		int maxq = q[0];
		
		for(int i = 0; i < q.length; i++) {
			if(maxq < q[i]) {
				maxq = q[i];
			}
		}
		System.out.println(maxq);
		
	}

}
