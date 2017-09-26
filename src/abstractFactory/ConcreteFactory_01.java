package abstractFactory;

import dataStore.DataStore_01;

import outputProcessor.A01_StoreData_AC1;
import outputProcessor.A02_IncorrectIdMsg_AC1;
import outputProcessor.A03_IncorrectPinMsg_AC1;
import outputProcessor.A04_TooManyAttemptsMsg_AC1;
import outputProcessor.A05_DisplayMenu_AC1;
import outputProcessor.A06_MakeDeposit_AC1;
import outputProcessor.A07_DisplayBalance_AC1;
import outputProcessor.A08_PromptForPin_AC1;
import outputProcessor.A09_MakeWithdraw_AC1;
import outputProcessor.A10_Panelty_AC1;
import outputProcessor.A11_IncorrectLockMsg_AC1;
import outputProcessor.A12_IncorrectUnlockMsg_AC1;
import outputProcessor.A13_NoFundsMsg_AC1;

public class ConcreteFactory_01 extends AbstractFactory{
	
	public ConcreteFactory_01() {
		
		super.ds = new DataStore_01();
		
		super.sda = new A01_StoreData_AC1(super.ds);
		super.ima = new A02_IncorrectIdMsg_AC1(super.ds);
		super.ipm = new A03_IncorrectPinMsg_AC1();
		super.tma = new A04_TooManyAttemptsMsg_AC1();
		super.dma = new A05_DisplayMenu_AC1();
		super.mda = new A06_MakeDeposit_AC1(super.ds);
		super.dba = new A07_DisplayBalance_AC1(super.ds);
		super.pfa = new A08_PromptForPin_AC1();
		super.mwa = new A09_MakeWithdraw_AC1(super.ds);
		super.pna = new A10_Panelty_AC1(super.ds);
		super.ila = new A11_IncorrectLockMsg_AC1();
		super.iua = new A12_IncorrectUnlockMsg_AC1();
		super.nfa = new A13_NoFundsMsg_AC1();
		
		
	}
}
