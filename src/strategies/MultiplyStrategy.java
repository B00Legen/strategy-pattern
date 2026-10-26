package strategies;

public class MultiplyStrategy implements MathStrategy {
	@Override
	public void calculate(int a, int b) {
		System.out.print(a + "*" + b + "=");
		System.out.println(a * b);
	}
}
