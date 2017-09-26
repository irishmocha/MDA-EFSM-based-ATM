package outputProcessor;

import dataStore.DataStore;

public class A07_DisplayBalance_AC1 extends A07_DisplayBalance_Abs {

	public A07_DisplayBalance_AC1(DataStore ds1) {
		super(ds1);
	}
	
	public void DisplayBalance() {
		System.out.println("Current balance is " + ds.getA());
	}
}
