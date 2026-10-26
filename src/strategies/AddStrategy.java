package strategies;

public class AddStrategy implements MathStrategy {
	@Override
	public void calculate(int a, int b) {
		System.out.print(a + "+" + b + "=");
		System.out.println(a + b);
	}
}
