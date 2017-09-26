package MDA_EFSM;

import outputProcessor.OutputProcessor;

public class StateConverter {
	
	private efsm_states IS;
	private efsm_states IL;
	private efsm_states CP;
	private efsm_states RD;
	private efsm_states IT;
	private efsm_states OD;
	private efsm_states LK;
	private efsm_states SP;
	private efsm_states CD;
	
	private efsm_states CurrentState;
	
	static int counter;
	
	public StateConverter(OutputProcessor op) {
		
		IS 	= new S0_InitialState(op);
		IL 	= new S1_Idle(op);
		CP	= new S2_CheckPin(op);
		RD	= new S3_Ready(op);
		IT 	= new S4_IntermediateState(op);
		OD	= new S5_Overdrawn(op);
		LK	= new S6_Locked(op);
		SP	= new S7_Suspended(op);
		CD	= new S8_Closed(op);
		
		CurrentState = IS ;
		
		counter = 0;
		
	}
	

	public void Open() {
		if (CurrentState == IS) {
			CurrentState.Open();
			CurrentState = IL;
		}
	}

	public void Login() {
		if (CurrentState == IL) {
			CurrentState.Login();
			CurrentState = CP; 
		}
	}

	public void Pin() {
		if (CurrentState == CP) {
			CurrentState.Pin();
			CurrentState = RD; 
		}
	}
	
	public void IncorrectLogin() {
		if (CurrentState == IL) {
			CurrentState.IncorrectLogin();
			CurrentState = IL;
		}
	}

	public void IncorrectPin(int max) {
		
		counter++;
		
		CurrentState.IncorrectPin(max);
		
		if(counter == max) {
			CurrentState = IL;
			
		}
	}
	

	public void CorrectPinAboveMin() {
		if (CurrentState == CP) {
			CurrentState.CorrectPinAboveMin();
			CurrentState = RD;
		}
	}

	public void CorrectPinBelowMin() {
		if (CurrentState == CP) {
			CurrentState.CorrectPinBelowMin();
			CurrentState = OD;
		}
	}
	
	public void Deposit() {
		if (CurrentState == RD) {
			CurrentState.Deposit();
			CurrentState = RD;
		} else if (CurrentState == OD) {
			CurrentState.Deposit();
			CurrentState = IT;
		}
	}

	public void AboveMinBalance() {
		if (CurrentState == IT) {
			CurrentState = RD;
		}
	}

	public void BelowMinBalance() {
		if (CurrentState == IT) {
			CurrentState = OD;
		}
	}
	
	public void Logout() {
		if (CurrentState == RD) {
			CurrentState = IL;
		}
	}
	
	public void Balance() {
		if (CurrentState == RD) {
			CurrentState.Balance();
		} else if (CurrentState == OD) {
			CurrentState.Balance();
		} else if (CurrentState == SP) {
			CurrentState.Balance();
		}
	}

	public void Withdraw() {
		if (CurrentState == RD) {
			CurrentState.Withdraw();
			CurrentState = IT;
		} else if (CurrentState == OD) {
			CurrentState.Withdraw();
			CurrentState = OD;
		}
	}
	
	public void WithdrawBelowMinBalance() {
		if (CurrentState == IT) {
			CurrentState.WithdrawBelowMinBalance();
			CurrentState = OD;
		}
	}

	public void NoFunds() {
		if (CurrentState == RD) {
			CurrentState = RD;
		}
	}

	public void Lock() {
		if (CurrentState == RD) {
			CurrentState = LK;
		} else if (CurrentState == OD) {
			CurrentState = LK;
		}
	}

	public void IncorrectLock() {
		if (CurrentState == RD) {
			CurrentState = RD;
		}
	}

	public void Unlock() {
		if (CurrentState == LK) {
			CurrentState = IT;
		}
	}

	public void IncorrectUnlock() {
		if (CurrentState == LK) {
			CurrentState.IncorrectUnlock();
			CurrentState = LK;
		}
	}

	public void Suspend() {
		if (CurrentState == RD) {
			CurrentState = SP;
		}
	}

	public void Activate() {
		if (CurrentState == SP) {
			CurrentState = RD;
		}
	}

	public void Close() {
		if (CurrentState == SP) {
			CurrentState = CD;
		}
	}
}
