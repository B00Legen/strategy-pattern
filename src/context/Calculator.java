package context;

import strategies.*;

public class Calculator {
	private MathStrategy mathStrat;
	
	public Calculator(MathStrategy strat) {setStrategy(strat);}
	public void setStrategy(MathStrategy strat) {
		mathStrat = strat;
		System.out.println("Changed Strategy to " + strat.getClass().getName());
	}
	public void calculate(int a, int b) {mathStrat.calculate(a, b);}
}
