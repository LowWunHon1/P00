
public class Calculator {
	
	public int add (int a, int b) {
		 return a + b;
	}
	
	public int subtract (int a, int b) {
		 return a - b;
	}
	
	public int multiply (int a, int b) {
		 return a * b;
	}
	
	public int divide (int a, int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		
		 return a / b;
	}
	
	public boolean boundary (int a, int b) {
		boolean bound = true;
		if (a <= 0 || a > 9999) {
			if (b < 0 || b > 9999) {
				bound = false;
			} else {
				bound = true;
			}
		}
		return bound;
	}
	
	
}
