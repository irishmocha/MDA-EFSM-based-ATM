package abstractFactory;

import dataStore.DataStore_02;
import outputProcessor.A01_StoreData_AC2;
import outputProcessor.A02_IncorrectIdMsg_AC2;
import outputProcessor.A03_IncorrectPinMsg_AC2;
import outputProcessor.A04_TooManyAttemptsMsg_AC2;
import outputProcessor.A05_DisplayMenu_AC2;
import outputProcessor.A06_MakeDeposit_AC2;
import outputProcessor.A07_DisplayBalance_AC2;
import outputProcessor.A08_PromptForPin_AC2;
import outputProcessor.A09_MakeWithdraw_AC2;
import outputProcessor.A10_Panelty_AC2;
import outputProcessor.A11_IncorrectLockMsg_AC2;
import outputProcessor.A12_IncorrectUnlockMsg_AC2;
import outputProcessor.A13_NoFundsMsg_AC2;

public class ConcreteFactory_02 extends AbstractFactory {

	public ConcreteFactory_02() {
		super.ds = new DataStore_02();
		
		super.sda = new A01_StoreData_AC2(super.ds);
		super.ima = new A02_IncorrectIdMsg_AC2(super.ds);
		super.ipm = new A03_IncorrectPinMsg_AC2();
		super.tma = new A04_TooManyAttemptsMsg_AC2();
		super.dma = new A05_DisplayMenu_AC2();
		super.mda = new A06_MakeDeposit_AC2(super.ds);
		super.dba = new A07_DisplayBalance_AC2(super.ds);
		super.pfa = new A08_PromptForPin_AC2();
		super.mwa = new A09_MakeWithdraw_AC2(super.ds);
		super.pna = new A10_Panelty_AC2(super.ds);
		super.ila = new A11_IncorrectLockMsg_AC2();
		super.iua = new A12_IncorrectUnlockMsg_AC2();
		super.nfa = new A13_NoFundsMsg_AC2();
	}
}
