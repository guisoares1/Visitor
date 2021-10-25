package visitor;


public class SumConvencional {
	
	public void sumTwo(int a, int b) {
		int sum = a + b;
		System.out.printf(a + "+" + b + " = " + sum);
	}

	public void sumThree(int a, int b, int c) {
		int sum = a + b + c;
		System.out.printf(a + "+" + b + c + " = " + sum);
	}

}
