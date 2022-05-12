package prob2;

public class Main {

	public static void main(String[] args) {
		MyStringStack mss = new MyStringStack();
		mss.push("A");
		mss.push("B");
		mss.push("C");
		mss.push("A");
		mss.push("B");
		System.out.println(mss); //expected: B A C B A 
		System.out.println(mss.pop()); //expected: B
		System.out.println(mss); //expected: A C B A
		mss.push("C");
		System.out.println(mss); //expected: C A C B A

	}


}
