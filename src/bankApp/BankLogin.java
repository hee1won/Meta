package bankApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import collection.Ex9HashMap;

public class BankLogin extends Thread {
	public List<BankAccount> member = new ArrayList<>();
	BankAccount member1;

	public BankLogin() {
		Calendar cal = Calendar.getInstance();
		member1 = new BankAccount("abc", "123", "홍길동", "110-111-1111", 0, "0000", cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE));
		member.add(member1);
		member1 = new BankAccount("aaa", "aaa", "박지성", "110-222-2222", 0, "1234", cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE));
		member.add(member1);
		member1 = new BankAccount("bbb", "bbb", "차범근", "110-333-3333", 0, "1111", cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE));
		member.add(member1);
	}

	public boolean login(String id, String pw) {
		boolean result = false;
		for (int i = 0; i < member.size(); i++) {
			if (id.equals(member.get(i).getId()) && pw.equals(member.get(i).getPassword())) {
				System.out.println(member.get(i).getName() + "님 로그인 되었습니다.");
				System.out.println("계좌번호는 " + member.get(i).getBankNum() + " 입니다.");
				result = true;
			}
		}

		return result;
	}

	public BankAccount addMember(String id, String pw, String name, String bankNum, long Rank, String bknw, int year,
			int month, int day) {
		BankAccount accountMember = null;
		member1 = new BankAccount(id, pw, name, bankNum, Rank, bknw, year, month, day);
		member.add(member1);
		return accountMember;
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
