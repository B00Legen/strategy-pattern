import context.Calculator;
import strategies.*;

public class Main {
	private static void test(Calculator calc) {
		calc.calculate(4, 5);
		calc.calculate(10, 15);
	}
	
	public static void main (String[] args) {
		Calculator calc = new Calculator(new AddStrategy());
		test(calc);
		
		calc.setStrategy(new MultiplyStrategy());
		test(calc);
		
		calc.setStrategy(new SubtractStrategy());
		test(calc);
	}
}
