package outputProcessor;

import dataStore.DataStore;

public class A02_IncorrectIdMsg_AC2 extends A02_IncorrectIdMsg_Abs {
	
	public A02_IncorrectIdMsg_AC2(DataStore ds2) {
		super(ds2);
	}

	public void IncorrectIdMsg() {
		System.out.println("Incorrect ID");
	}
}
