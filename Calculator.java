public class Calculator {
	private MathStrategy mathStrat;
	
	public Calculator(MathStrategy strat) {SetStrategy(strat);}
	public void SetStrategy(MathStrategy strat) {
		mathStrat = strat;
		System.out.println("Changed Strategy to " + strat.getClass().getName());
	}
	public void Calculate(int a, int b) {mathStrat.Calculate(a, b);}
}
