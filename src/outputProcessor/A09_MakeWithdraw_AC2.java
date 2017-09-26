package outputProcessor;

import dataStore.DataStore;

public class A09_MakeWithdraw_AC2 extends A09_MakeWithdraw_Abs {
	
	public A09_MakeWithdraw_AC2(DataStore ds2) {
		super(ds2);
	}
	
	public void MakeWithdraw() {
		ds.setA((int)ds.getA() - (int)ds.getTemp_w());
	}
}
