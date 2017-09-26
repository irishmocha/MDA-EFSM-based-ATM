package inputProcessor;

import MDA_EFSM.StateConverter;
import dataStore.DataStore;
import abstractFactory.*;

public class Account1 {

	DataStore ds;
	StateConverter m;

	Account1(AbstractFactory af, StateConverter sc) {
		ds = af.getDS();
		m = sc;
	}

	void open(String p, String y, float a) {
		ds.setTemp_p(p);
		ds.setTemp_y(y);
		ds.setTemp_a(a);
		m.Open();
	}

	void pin(String x) {
		if (x.equals(ds.getP().toString())) {
			if ((float) ds.getA() > 500) { 
				m.CorrectPinAboveMin();
			} else {
				m.CorrectPinBelowMin();
			}
		} else {
			m.IncorrectPin(3);
		}
	}

	void deposit(float d) {
		ds.setTemp_d(d);
		m.Deposit();
		if ((float) ds.getA() > 500)
			m.AboveMinBalance();
		else
			m.BelowMinBalance();
	}

	void withdraw(float w) {
		ds.setTemp_w(w);
		m.Withdraw();
		if (((float) ds.getA() > 500)) {
			m.AboveMinBalance();
		} else {
			m.WithdrawBelowMinBalance();
		}
	}

	void balance() {
		m.Balance();
	}

	void login(String y) {
		if (y.equals(ds.getY())) {
			m.Login();
		} else {
			m.IncorrectLogin();
		}
	}

	void logout() {
		m.Logout();
	}

	void lock(String x) {
		if (x.equals(ds.getP())) {
			m.Lock();
		} else
			m.IncorrectLock();
	}

	void unlock(String x) {
		if (x.equals(ds.getP())) {
			m.Unlock();
			if ((float) ds.getA() > 500) {
				m.AboveMinBalance();
			} else {
				m.BelowMinBalance();
			}
		} else {
			m.IncorrectUnlock();
		}
	}
}
