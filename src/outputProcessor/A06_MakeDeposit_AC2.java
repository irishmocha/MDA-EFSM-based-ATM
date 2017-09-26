package outputProcessor;

import dataStore.DataStore;

public class A06_MakeDeposit_AC2 extends A06_MakeDeposit_Abs {
	
	public A06_MakeDeposit_AC2(DataStore ds2) {
		super(ds2);
	}
	
	public void MakeDeposit() {
		ds.setA((int)ds.getTemp_d() + (int)ds.getA());
	}
}
