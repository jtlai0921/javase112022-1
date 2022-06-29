package lab;

// A
public class Q01 {
	public static void main(String[] args) {
	    int a;
	    int b = 5;
	    if (b > 2) {
	        a = ++b;
	        b = a + 7;
	    } else {
	        b++;
	    }
	    System.out.println(a + " " + b);
	}


}
