public class Calculator {
	private MathStrategy mathStrat;
	
	public Calculator(MathStrategy strat) {SetStrategy(strat);}
	public void SetStrategy(MathStrategy strat) {mathStrat = strat;}
	public int Calculate(int a, int b) {return mathStrat.Calculate(a, b);}
}
