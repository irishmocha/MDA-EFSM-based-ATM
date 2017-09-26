package MDA_EFSM;

import outputProcessor.OutputProcessor;

/* Only Account 2 can be included in this state */
public class S7_Suspended implements efsm_states {

	OutputProcessor Action;
	
	public S7_Suspended(OutputProcessor op) {
		Action = op;
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
		
	}

	@Override
	public void CorrectPinBelowMin() {
		
	}

	@Override
	public void CorrectPinAboveMin() {
		
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
		Action.DispayBalance();
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
