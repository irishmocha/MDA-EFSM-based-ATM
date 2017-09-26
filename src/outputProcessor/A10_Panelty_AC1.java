package outputProcessor;

import dataStore.DataStore;

public class A10_Panelty_AC1 extends A10_Panelty_Abs {
	
	public A10_Panelty_AC1(DataStore ds1) {
		super(ds1);
	}
	
	public void Penalty() {
		ds.setA((float )ds.getA()-20);
	}
	
}
