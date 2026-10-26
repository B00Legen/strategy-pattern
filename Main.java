public class Main {
	private static void test(Calculator calc) {
		calc.Calculate(4, 5);
		calc.Calculate(10, 15);
	}
	
	public static void main (String[] args) {
		Calculator calc = new Calculator(new AddStrategy());
		test(calc);
		
		calc.SetStrategy(new MultiplyStrategy());
		test(calc);
		
		calc.SetStrategy(new SubtractStrategy());
		test(calc);
	}
}
