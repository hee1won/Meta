package collection;

import java.util.Calendar;

/* 
 * Calendar class 는 1970년 1월 1일부터 특정 값으로 진보해 오면서
 * 날짜와 시각에 대한 조작을 수행할 수 있도록 제공되는 abstract class이다.
 * object 생성 법은 다음과 같다.
 * 		1) Calendar cal = Claendar.getInstance();
 * 		2) GregorianCalendar cal = new GregorianCalendar();
 */

public class CalendarEx implements Runnable{
	
	public CalendarEx() {
		new Thread(this).start();
	}
	
	public static void main(String[] args) {
		new CalendarEx();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = (cal.get(Calendar.MONTH)+1);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int hour = cal.get(Calendar.HOUR);
		int aaa = cal.get(Calendar.WEEK_OF_MONTH);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(aaa);
		System.out.println(hour + " 시");
		System.out.println(minute + " 분");
		System.out.println(second + " 초");
		System.out.println(day);
		
		if(day == 1) {
			System.out.println("오늘은 일요일 입니다.");
		} else if(day == 2){
			System.out.println("오늘은 월요일 입니다.");
		} else if(day == 3){
			System.out.println("오늘은 화요일 입니다.");
		} else if(day == 4) {
			System.out.println("오늘은 수요일 입니다.");
		} else if(day == 5) {
			System.out.println("오늘은 목요일 입니다.");
		} else if(day == 6) {
			System.out.println("오늘은 금요일 입니다.");
		} else {
			System.out.println("오늘은 토요일 입니다.");
		}
		
		// 달력
		boolean run = false;
		while(! run) {
			try {
				Thread.sleep(1000);
				System.out.println(Calendar.getInstance().get(Calendar.SECOND));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		year = 2020;
		month = 5;
		cal.set(year, month-1, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(Calendar.DATE);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i < lastDay + startDay; i++) {
			if(i < startDay) {
				System.out.print("\t");
				continue;
			}
			System.out.print((i - startDay + 1) + "\t");
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
	}
	public void run() {
	}
}
