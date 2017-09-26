package outputProcessor;

import dataStore.DataStore;

public class A01_StoreData_AC1 extends A01_StoreData_Abs {
	
	public A01_StoreData_AC1(DataStore ds1) {
		super(ds1);
	}
	
	@Override
	public void StoreData() {
		ds.setP(ds.getTemp_p());
		ds.setY(ds.getTemp_y());
		ds.setA(ds.getTemp_a());
	}
}
