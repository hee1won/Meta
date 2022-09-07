//package collection;
//
//import java.util.Arrays;
//import java.util.List;
//
//import bankApp.BankAccount;
//
//import java.util.*;
//
//public class Ex8 {
//	
//	BankAccount[] member;
//	static List<BankAccount> list;
//	
//	public Ex8() {
//		member = new BankAccount[3];
//		member[0] = new BankAccount("ccc", "ccc", "손흥민", "110-444-4444", 0, "9999");
//		member[1] = new BankAccount("abc", "123", "장그래", "110-555-5555", 0, "5678");
//		member[2] = new BankAccount("eee", "eee", "박주영", "110-666-6666", 0, "1010");
//		list = Arrays.asList(member);
//		for(BankAccount b : list) {
//			System.out.println(b.getName());
//		}
//		list = new LinkedList<>();
//		Iterator<BankAccount> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		list.remove(member[1]);
//		for(BankAccount b : list) {
//			System.out.println(b.getName());
//		}
//	}
//	
//	public static void main(String[] args) {
//		new Ex8();
//	}
//}
