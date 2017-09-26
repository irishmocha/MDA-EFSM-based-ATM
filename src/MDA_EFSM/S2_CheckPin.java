package MDA_EFSM;

import outputProcessor.OutputProcessor;

/**
 * @author Seungho Han A20360115
 * Check Pin state performs functions related the permission
 */

public class S2_CheckPin implements efsm_states{

	OutputProcessor Action;
	static int counter;
	
	
	public S2_CheckPin(OutputProcessor op) {
		Action = op;
		counter = 0;
	}
	
	@Override
	public void Open() {
		
	}

	@Override
	public void Login() {
		
	}
	
	@Override
	public void Pin() {
		
	}

	@Override
	public void IncorrectLogin() {
		
	}

	@Override
	public void IncorrectPin(int max) {
		
		counter++;
		
		Action.IncorrectPinMsg();
		if (counter == max) {
			Action.TooManyAttemptsMsg();
		}
		
	}

	@Override
	public void CorrectPinBelowMin() {
		Action.DisplayMenu();
	}

	@Override
	public void CorrectPinAboveMin() {
		Action.DisplayMenu();
		
	}

	@Override
	public void Deposit() {
		
	}

	@Override
	public void BelowMinBalance() {
		
	}

	@Override
	public void AboveMinBalance() {
		
	}

	@Override
	public void Logout() {
		
	}

	@Override
	public void Balance() {
		
	}

	@Override
	public void Withdraw() {
		
	}

	@Override
	public void WithdrawBelowMinBalance() {
		
	}

	@Override
	public void NoFunds() {
		
	}

	@Override
	public void Lock() {
		
	}

	@Override
	public void IncorrectLock() {
		
	}

	@Override
	public void Unlock() {
		
	}

	@Override
	public void IncorrectUnlock() {
		
	}

	@Override
	public void Suspend() {
		
	}

	@Override
	public void Active() {
		
	}

	@Override
	public void Close() {
		
	}

}
