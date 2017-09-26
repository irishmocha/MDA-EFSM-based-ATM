package outputProcessor;

import abstractFactory.AbstractFactory;
import dataStore.DataStore;

public class OutputProcessor {
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
	
	public OutputProcessor (AbstractFactory af) {
		ds = af.getDS();
		sda = af.getA01();
		ima = af.getA02();
		ipm = af.getA03();
		tma = af.getA04();
		dma = af.getA05();
		mda = af.getA06();
		dba = af.getA07();
		pfa = af.getA08();
		mwa = af.getA09();
		pna = af.getA10();
		ila = af.getA11();
		iua = af.getA12();
		nfa = af.getA13();				
	}	
	
	public void StoreData() {
		System.out.println("outputProcessor -> StoreData");
		sda.StoreData();
	}
	
	public void IncorrectIdMsg() {
		ima.IncorrectIdMsg();
	}
	
	public void IncorrectPinMsg() {
		ipm.IncorrectPinMsg();
	}
	
	public void TooManyAttemptsMsg() {
		tma.TooManyAttemptsMsg();
	}
	
	public void DisplayMenu() {
		dma.DisplayMenu();
	}
	
	public void MakeDeposit() {
		mda.MakeDeposit();
	}
	
	public void DispayBalance() {
		dba.DisplayBalance();
	}
	
	public void PromptForPin() {
		pfa.PromptForPin();
	}
	
	public void MakeWithdraw() {
		mwa.MakeWithdraw();
	}
	
	public void Penalty() {
		pna.Penalty();
	}
	
	public void IncorrectLockMsg() {
		ila.IncorrectIdMsg();
	}
	
	public void IncorrectUnlockMsg() {
		iua.IncorrectUnlockMsg();
	}
	
	public void NoFundsMsg() {
		nfa.NoFundsMsg();
	}
}
