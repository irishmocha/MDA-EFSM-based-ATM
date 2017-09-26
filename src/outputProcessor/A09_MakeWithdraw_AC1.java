package outputProcessor;

import dataStore.DataStore;

public class A09_MakeWithdraw_AC1 extends A09_MakeWithdraw_Abs {
	
	public A09_MakeWithdraw_AC1(DataStore ds1) {
		super(ds1);
	}
	
	public void MakeWithdraw() {

		ds.setA((float)ds.getA()- (float)ds.getTemp_w());
	}
}
