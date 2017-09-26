package abstractFactory;
import outputProcessor.*;
import dataStore.*;

public abstract class AbstractFactory {
	
	public DataStore ds;
	
	public A01_StoreData_Abs sda;
	public A02_IncorrectIdMsg_Abs ima;
	public A03_IncorrectPinMsg_Abs ipm;
	public A04_TooManyAttemptsMsg_Abs tma;
	public A05_DisplayMenu_Abs dma;
	public A06_MakeDeposit_Abs mda;
	public A07_DisplayBalance_Abs dba;
	public A08_PromptForPin_Abs pfa;
	public A09_MakeWithdraw_Abs mwa;
	public A10_Panelty_Abs pna;
	public A11_IncorrectLockMsg_Abs ila;
	public A12_IncorrectUnlockMsg_Abs iua;
	public A13_NoFundsMsg_Abs nfa;
	
	public DataStore getDS() {
		return ds;
	}
	
	public A01_StoreData_Abs getA01() {
		return sda;
	}
	
	public A02_IncorrectIdMsg_Abs getA02() {
		return ima;
	}
	
	public A03_IncorrectPinMsg_Abs getA03() {
		return ipm;
	}
	
	public A04_TooManyAttemptsMsg_Abs getA04() {
		return tma;
	}
	
	public A05_DisplayMenu_Abs getA05() {
		return dma;
	}
	
	public A06_MakeDeposit_Abs getA06() {
		return mda;
	}
	
	public A07_DisplayBalance_Abs getA07() {
		return dba;
	}
	
	public A08_PromptForPin_Abs getA08() {
		return pfa;
	}
	
	public A09_MakeWithdraw_Abs getA09() {
		return mwa;
	}
	
	public A10_Panelty_Abs getA10() {
		return pna;
	}
	
	public A11_IncorrectLockMsg_Abs getA11() {
		return ila;
	}
	
	public A12_IncorrectUnlockMsg_Abs getA12() {
		return iua;
	}
	
	public A13_NoFundsMsg_Abs getA13() {
		return nfa;
	}
}
