package app;

public class Ex3 {

	Ex3() {
		this("a", 10);
	}

	Ex3(int a) {

	}

	Ex3(String b) {

	}
	
	Ex3(String c, int d) {
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		new Ex3("ddd", 10);
		new Ex3("ccc");
		new Ex3();
	}

}
