package outputProcessor;

import dataStore.DataStore;

public abstract class A01_StoreData_Abs {

	DataStore ds;
	
	public A01_StoreData_Abs(DataStore dataStore) {
		ds = dataStore;
	}
	
	public void StoreData() {}
}
