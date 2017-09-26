package outputProcessor;

import dataStore.DataStore;

public class A01_StoreData_AC2 extends A01_StoreData_Abs {
	
	public A01_StoreData_AC2(DataStore _ds2) {
		super(_ds2);
	}
	
	public void StoreData() {
		ds.setP(ds.getTemp_p());
		ds.setY(ds.getTemp_y());
		ds.setA(ds.getTemp_a());
	}
}
