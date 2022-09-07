package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		String names[] = {"경여랑", "공재현", "김민아"};
		int kors[] = {30, 20, 100};
		int engs[] = {100, 70, 100};
		int maths[] = {20, 50, 100};
		List arr = new ArrayList();
		for(int i = 0; i < names.length; i++) {
			arr.add(names[i]);
			arr.add(kors[i]);
			arr.add(engs[i]);
			arr.add(maths[i]);
		}
		System.out.println("-------학생 성적 조회 프로그램-------");
		System.out.println("이름 \t국어\t영어\t수학\t총점\t평균");
		Iterator iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.println("\n" + iterator.next());
			Object obj = iterator.next();
			kor = (Integer) obj;
			eng = ((Integer) iterator.next()).intValue();
			math = (Integer) iterator.next();
			total = kor + eng + math;
			avg = (double) total / 3;
			System.out.println("\t" + kor + "\t" + eng + "\t" + math);
			System.out.println("\t" + total + "\t" + avg);
		}
	}
}
