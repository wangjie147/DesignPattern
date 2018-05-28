package com.facetofront.strategyAndFactory;

import com.facetofront.Factory.CashNormal;
import com.facetofront.Factory.CashRebate;
import com.facetofront.Factory.CashReturn;

public class CashContext {
            
	   CashSuper cs = null;
	   
	   public CashContext (String type){

			switch(type){
			  
				case "�����շ�":
					CashNormal cs0 =new CashNormal();
					cs =cs0 ;
					break;
				case "��300��100":
					CashReturn cr1 = new CashReturn("300","100");
					cs =cs1 ;
					break;
				case "��8��":
					CashRebate cr2 = new CashRebate("0.8");
					cs =cr2;
					break;
			}
	   }
	   
	   public double GetResult(double money){
		   return cs.acceptCash(money);
	   }
	   
}
