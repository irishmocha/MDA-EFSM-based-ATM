package outputProcessor;

import dataStore.DataStore;

public abstract class A09_MakeWithdraw_Abs {
	
	DataStore ds;
	
	public A09_MakeWithdraw_Abs(DataStore dataStore) {
		ds = dataStore;
	}
	
	public void MakeWithdraw() {

		ds.setA((float)ds.getA() - (float)ds.getTemp_w());
	}
	
}
