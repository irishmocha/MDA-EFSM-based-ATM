package outputProcessor;

import dataStore.DataStore;

public abstract class A06_MakeDeposit_Abs {
	
	DataStore ds;
	
	public A06_MakeDeposit_Abs(DataStore dataStore) {
		ds = dataStore;
	}
	
	public void MakeDeposit() {
		ds.setA((float)ds.getTemp_d() + (float)ds.getA());
	}
}
