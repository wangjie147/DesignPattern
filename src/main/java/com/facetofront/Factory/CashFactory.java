package com.facetofront.Factory;

public class CashFactory {
	
	public static CashSuper createCashAccpt(String type){
		
		CashSuper cs =null;
		
		switch(type){
		  
			case "�����շ�":
				cs =new CashNormal();
				break;
			case "��300��100":
				CashReturn cr1 = new CashReturn("300","100");
				break;
			case "��8��":
				CashRebate cr2 = new CashRebate("0.8");
				cs =cr2;
				break;
		}
		return cs;
	}

}
