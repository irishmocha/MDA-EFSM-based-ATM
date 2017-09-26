package outputProcessor;

import dataStore.DataStore;

public abstract class A02_IncorrectIdMsg_Abs {
	
	DataStore ds;
	
	public A02_IncorrectIdMsg_Abs(DataStore dataStore) {
		ds = dataStore;
	}
	
	public void IncorrectIdMsg() {
		System.out.println("Incorrect ID");
	}
}
