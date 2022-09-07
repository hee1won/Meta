package bankApp;

import java.time.DayOfWeek;
import java.util.Calendar;

public class BankAccount {
	
	private int year;
	private int month;
	private int day;
	private String name;
	private String id;
	private String password;
	private String bankNum;
	private String bknw;
	private long Rank;
	
	public BankAccount(String id, String password, String name, String bankNum, long Rank, String bknw, int year, int month, int day) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.bankNum = bankNum;
		this.Rank = Rank;
		this.bknw = bknw;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getBknw() {
		return bknw;
	}

	public void setBknw(String bknw) {
		this.bknw = bknw;
	}

	public long getRank() {
		return Rank;
	}

	public void setRank(long rank) {
		Rank = rank;
	}

	public String getBankNum() {
		return bankNum;
	}

	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}