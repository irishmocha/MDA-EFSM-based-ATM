package MDA_EFSM;

/**
 * @author Seungho Han A20360115
 * efsm_states interface offers interfaces which should be
 * implemented at each of states.
 * And each of states have a OutputProcessor instance, which
 * gets AbstractFactory.
 */

public interface efsm_states {
	void Open();
	void Login();
	void Pin();
	void IncorrectLogin();
	void IncorrectPin(int max);
	void CorrectPinBelowMin();
	void CorrectPinAboveMin();
	void Deposit();
	void BelowMinBalance();
	void AboveMinBalance();
	void Logout();
	void Balance();
	void Withdraw();
	void WithdrawBelowMinBalance();
	void NoFunds();
	void Lock();
	void IncorrectLock();
	void Unlock();
	void IncorrectUnlock();
	void Suspend();
	void Active();
	void Close();
}
