package strategies;

public class SubtractStrategy implements MathStrategy {
	@Override
	public void calculate(int a, int b) {System.out.println(a - b);}
}
