package inputProcessor;

import MDA_EFSM.StateConverter;
import abstractFactory.AbstractFactory;
import dataStore.DataStore;

public class Account2 {

	DataStore ds;
	StateConverter m;

	Account2(AbstractFactory af, StateConverter sc) {
		ds = af.getDS();
		m= sc;
	}
	
	void OPEN(int p, int y, int a) {
		ds.setTemp_p(p);
		ds.setTemp_y(y);
		ds.setTemp_a(a);
		m.Open();
	}

	void PIN(int x) {
		if (x == (int)ds.getP()) {
			m.CorrectPinAboveMin();
		} else {
			m.IncorrectPin(2);
		}
	}

	void DEPOSIT (int d) {
		 ds.setTemp_d(d);
		 m.Deposit();
	}

	void WITHDRAW(int w) {
		ds.setTemp_w(w);
		if ((int)ds.getA() > 0) {
			m.Withdraw();
			m.AboveMinBalance();
		}
		else
			m.NoFunds();
	}

	void BALANCE() {
		m.Balance();
	}

	void LOGIN(int y) {
		if (y == (int)ds.getY())
			m.Login();
		else
			m.IncorrectLogin();
	}

	void LOGOUT() {
		m.Logout();
	}

	void suspend() {
		m.Suspend();
	}

	void activate() {
		m.Activate();
	}

	void close () {
		 m.Close();
	}
}
