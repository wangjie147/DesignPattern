package com.facetofront.strategyExample;

public class CashReturn extends CashSuper {
    
	//返利收费子类
	private double moneyCondition =0;
	private double moneyReturn = 0;
	
	public CashReturn(String moneyCondition,String moneyReturn){
		this.moneyCondition =Integer.parseInt(moneyCondition);
		this.moneyReturn =Integer.parseInt(moneyReturn);
	}
	
	@Override
	public double acceptCash(double money) {
		
		double result =money;
		
		if(money >= moneyCondition){
			result =money -Math.floor(money/moneyCondition)*moneyReturn;
		}
		return result;
	}

}
