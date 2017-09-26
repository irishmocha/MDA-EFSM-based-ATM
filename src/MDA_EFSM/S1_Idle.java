package MDA_EFSM;

import outputProcessor.OutputProcessor;

/**
 * @author Seungho Han A20360115
 * Idle state performs the function related Login
 */

public class S1_Idle implements efsm_states{

	OutputProcessor Action;
	
	public S1_Idle(OutputProcessor op) {
		Action = op;
	}
	
	@Override
	public void Open() {
		
	}

	@Override
	public void Login() {
		Action.PromptForPin();
	}
	
	@Override
	public void Pin() {
	
	}

	@Override
	public void IncorrectLogin() {
		System.out.println("IncorrectLogin");
		Action.IncorrectIdMsg();
		
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
