package lab;

class Super8 {
	public void sup() {
		print();
	}

	private void print() {
		System.out.print("Bonjour le monde!");
	}
}

class Sub8 extends Super8 {
	public void sub() {
		print();
	}

	private void print() {
		System.out.print("Hello world!");
	}
}

// C
public class Q08 {

	public static void main(String[] args) {
		Sub8 b = new Sub8();
		b.sup();
		b.sub();
	}

}
