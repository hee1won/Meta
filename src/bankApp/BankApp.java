package bankApp;

import java.util.*;

public class BankApp implements Bank {

	@Override
	public String Rank(BankLogin bank, String id) {
		String a = "";
		for (int i = 0; i < bank.member.size(); i++) {
			if(bank.member.get(i).getId().equals(id)) {				
				if (bank.member.get(i).getRank() < 999999999 && bank.member.get(i).getRank() > 100000000) {
					a = "silver";
				} else if (bank.member.get(i).getRank() < 199999999 && bank.member.get(i).getRank() > 1000000000) {
					a = "gold";
				} else if (bank.member.get(i).getRank() > 2000000000) {
					a = "vip";
				} else {
					a = "bronze";
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		BankLogin ex = new BankLogin();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		BankApp app = new BankApp();
		Scanner sc = new Scanner(System.in);
		Thread thread = new BankLogin();

		for(;;) {
			System.out.println("|------------------------------|");
			System.out.println("| 1. 로그인 | 2. 회원가입 | 3. 종료 |");
			System.out.println("|------------------------------|");
			
			int main = sc.nextInt();
			
			switch(main) {
			case 1:
				System.out.println("ID : ");
				String id = sc.next();
				System.out.println("PW : ");
				String pw = sc.next();
				String bankNum = "";
				boolean a = true;
				boolean result = ex.login(id, pw);
				if (result) {
					while(a) {
						System.out.println("|------------------------------------------------------------------------|");
						System.out.println("| 1. 입금 | 2. 출금 | 3. 잔고 | 4. 등급 확인 | 5. 송금 | 6. 계좌 조회 | 7. 로그아웃 | ");
						System.out.println("|------------------------------------------------------------------------|");
						int menu = sc.nextInt();
						switch (menu) {
						case 1:
							for (int i = 0; i < ex.member.size(); i++) {
								if (id.equals(ex.member.get(i).getId())) {
									System.out.println("입금액 > ");
									ex.member.get(i).setRank(ex.member.get(i).getRank() + sc.nextInt());
									System.out.println("입금 계좌명 : " + ex.member.get(i).getName());
								}
							}
							break;
							
						case 2:
							System.out.println("비밀번호를 입력해주세요");
							
							for (int i = 0; i < ex.member.size(); i++) {
								if (id.equals(ex.member.get(i).getId())) {
									if (ex.member.get(i).getBknw().equals(sc.next())) {
										System.out.println("출금액 > ");
										int money = sc.nextInt();
										if(ex.member.get(i).getRank() < money) {
											System.out.println("잔고가 부족합니다.");
										} else {
											ex.member.get(i).setRank(ex.member.get(i).getRank() - money);
											System.out.println("남은 잔고는 " + ex.member.get(i).getRank() + " 입니다.");
										}
									} else {
										System.out.println("비밀번호가 다릅니다.");
									}
								}
							}
							break;
							
						case 3:
							System.out.println("잔고 > ");
							for(int i = 0; i < ex.member.size(); i++) {
								System.out.println(ex.member.get(i).getName() +" "+ ex.member.get(i).getRank() + "원");
							}
							break;
							
						case 4:
							for(int i = 0; i < ex.member.size(); i++) {
								if(id.equals(ex.member.get(i).getId())) {
									System.out.println(ex.member.get(i).getName() + "님의 등급은 "+ app.Rank(ex, ex.member.get(i).getId()) +"입니다.");
								}
							}
							break;
							
						case 5:
							System.out.println("계좌번호를 입력하세요.");
							String asd = sc.next();
							int a1 = 0;
							for (int i = 0; i < ex.member.size(); i++) {
								if (ex.member.get(i).getBankNum().equals(asd)) {
									System.out.println(ex.member.get(i).getName());
									System.out.println("비밀번호를 입력하세요.");
									for (int j = 0; j < ex.member.size(); j++) {
										if (id.equals(ex.member.get(j).getId())) {
											if (ex.member.get(j).getBknw().equals(sc.next())) {
												System.out.println("송금액");
												a1 = sc.nextInt();
												if(ex.member.get(j).getRank() <= a1) {
													System.out.println("잔고가 부족합니다.");
													break;
												}else {											
													ex.member.get(i).setRank(ex.member.get(i).getRank() + a1);
												}
												System.out.println("송금이 완료 되었습니다.");
												break;
											} else {
												System.out.println("비밀번호가 일치하지 않습니다.");
											}
										}
									}
								} else if (ex.member.get(i).getBankNum().equals(null)) {
									System.out.println("없는 계좌 입니다.");
								}
							}
							
							for (int i = 0; i < ex.member.size(); i++) {
								if (id.equals(ex.member.get(i).getId())) {
									if(ex.member.get(i).getRank() <= a1) {
									} else {								
										ex.member.get(i).setRank(ex.member.get(i).getRank() - a1);
									}
								}
							}
							
							break;
							
						case 6:
							for(int i = 0; i < ex.member.size(); i++) {
								if(id.equals(ex.member.get(i).getId())) {
									System.out.println("가입 날짜는 " + ex.member.get(i).getYear() + " 년 " + (ex.member.get(i).getMonth())+ " 월 " + ex.member.get(i).getDay() + " 일 입니다.");
									System.out.println("계좌 번호는 " + ex.member.get(i).getBankNum() + " 입니다.");
									break;
								}
							}
							break;
						case 7:
							a = false;
							break;
						default:
							System.out.println("worng answer");
						}
					}
					
				} else {
					System.out.println("아이디나 패스워드가 올바르지 않습니다.");
				}
				break;
			case 2:
				
				System.out.println("아이디를 입력해주세요.");
				String addId = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String addPw = sc.next();
				System.out.println("이름을 입력해주세요.");
				String addName = sc.next();
				System.out.println();
				String addBankNum = "110-"+"111-" + (int)((Math.random()*8999)+1000);
				System.out.println("계좌번호 : " + addBankNum);
				System.out.println();
				int addRank = 0;
				System.out.println("계좌 비밀번호를 입력해주세요.");
				String addBknw = sc.next();
				int addYear = year;
				int addMonth = month;
				int addDay = day;
				System.out.println("가입이 완료 되었습니다.");
				
				BankAccount addMember = ex.addMember(addId, addPw, addName, addBankNum, addRank, addBknw, addYear, addMonth, addDay);
				break;
			case 3:
				System.out.println("종료합니다.");
				return;
			}
			
		}
		

	}

}
