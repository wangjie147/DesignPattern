package com.facetofront.strategyExample;

public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}
    
	
}
