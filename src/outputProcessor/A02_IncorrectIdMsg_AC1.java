package outputProcessor;

import dataStore.DataStore;

public class A02_IncorrectIdMsg_AC1 extends A02_IncorrectIdMsg_Abs {
	
	public A02_IncorrectIdMsg_AC1(DataStore ds1) {
		super(ds1);
	}

	public void IncorrectIdMsg() {
		if(ds.getY() != ds.getTemp_y()) {
			System.out.println("Incorrect ID");
		}
	}
}
