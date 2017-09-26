package outputProcessor;

import dataStore.DataStore;

public class A07_DisplayBalance_AC2 extends A07_DisplayBalance_Abs {
	
	public A07_DisplayBalance_AC2(DataStore ds2) {
		super(ds2);
	}
	
	public void DisplayBalance() {
		System.out.println("Current balance is " + ds.getA());
	}
}
