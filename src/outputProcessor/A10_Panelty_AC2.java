package outputProcessor;

import dataStore.DataStore;

public class A10_Panelty_AC2 extends A10_Panelty_Abs {
	public A10_Panelty_AC2(DataStore ds2) {
		super(ds2);
	}
	
	public void Penalty() {
		ds.setA((int)ds.getA()-20);
	}
}
