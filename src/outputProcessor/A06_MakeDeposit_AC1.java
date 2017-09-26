package outputProcessor;

import dataStore.DataStore;

public class A06_MakeDeposit_AC1 extends A06_MakeDeposit_Abs {
	
	public A06_MakeDeposit_AC1(DataStore ds1) {
		super(ds1);
	}
	
	public void MakeDeposit() {
		ds.setA((float)ds.getTemp_d() + (float)ds.getA());
	}
}
