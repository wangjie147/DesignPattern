package com.facetofront.strategyAndFactory;

public class CashRebate extends CashSuper {
	
	private double moneyRebate = 1d;
	
	public CashRebate(String moneyRebate){
		this.moneyRebate =Integer.parseInt(moneyRebate)*0.1;
	}

	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}
    
	
}
