package app;

import java.util.Scanner;

import bankApp.BankAccount;

public class Tst {
	
	public BankAccount member;
	
	BankAccount ex2[] = new BankAccount[2];
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------");
			System.out.println("���� > ");
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				System.out.println("�л��� > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i =0; i < scores.length; i++) {
					System.out.println("scores["+ i + "]>");
					scores[i] = sc.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i =0; i < scores.length; i++) {
					System.out.println("scores["+ i + "]:" + scores[i] );
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.length; i++) {
					max = (max < scores[i])? scores[i] : max;
					sum += scores[i];
				}
				
				avg = (double) sum / studentNum;
				System.out.println("�ְ��� :" + max);
				System.out.println("��� : " + avg);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("����");
	}

}
