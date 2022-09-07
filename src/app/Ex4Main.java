package app;

import bankApp.BankLogin;
import collection.Ex9HashMap;

public class Ex4Main {
	public static void main(String[] args) {
		BankLogin ex = new BankLogin();
		new Ex9HashMap().getAdminInfo();
		boolean result = ex.login("abc", "123");
		if(result) {
			System.out.println("관리자 로그인 되었습니다.");
		} else {
			System.out.println("id 또는 패스워드가 올바르지 않습니다.");
		}
	}
}