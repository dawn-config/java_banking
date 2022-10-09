package sourcecode.Model;

import sourcecode.Model.States.*;
import sourcecode.OutputProcessor.*;

public class MDA_EFSM {
    States s;
    States[] LS = new States[8];
    public int attempts;
    OutputProcessor p;
    public final int IDLE = 0;
    public final int CHECKPIN = 1;
    public final int READY = 2;
    public final int DEPOSITWITDRAWLIMBO = 3;
    public final int LOCKLIMBO = 4;
    public final int LOCKED = 5;
    public final int OVERDRAWN = 6;
    public final int SUSPENDED = 7;

    public MDA_EFSM(OutputProcessor op){
        p = op;
        attempts = 0;
       
        LS[IDLE] = new Idle(this, p);
        LS[CHECKPIN] = new CheckPin(this, p);
        LS[READY] = new Ready(this, p);
        LS[DEPOSITWITDRAWLIMBO] = new deposit_withdraw_limbo(this, p);
        LS[LOCKLIMBO] = new Lock_limbo(this, p);
        LS[LOCKED] = new Locked(this, p);
        LS[OVERDRAWN] = new Overdrawn(this, p);
        LS[SUSPENDED] = new Suspended(this, p); 
        
        s = LS[IDLE];
    }
    public void ChangeState(int index){
        s = LS[index];
    }

    public void open(){
        p.StoreData();
    }


    public void login(){
        s.login();
    }

    public void IncorrectLogin(){
        s.IncorrectLogin();
    }

    public void IncorrectPin(int max){
        s.IncorrectPin(max);
    }

    public void CorrectPinBelowMin(){
        s.CorrectPinBelowMin();

    }   
    
    public void CorrectPinAboveMin(){
        s.CorrectPinAboveMin();
    }

    public void WithdrawNoFunds(){
        s.WithdrawNoFunds();
    }   
    
    public void WithdrawBelowMin(){
        s.WithdrawBelowMin();
    }

    public void Withdraw(){
        s.Withdraw();
    }

    public void AboveMin(){
        s.AboveMin();
    }
       
    public void BelowMin(){
        s.BelowMin();
    }

    public boolean Deposit(){
        return s.Deposit();
    }

    public void Balance(){
        s.Balance();
    }

    public void lockIncorrectPin(){
        s.lockIncorrectPin();
    }

    public void lockCorrectPin(){
        s.lockCorrectPin();
    }

    public void Suspend(){
        s.Suspend();
    }

    public void unlockIncorrectPin(){
        s.unlockIncorrectPin();
    }
     
    public void unlockCorrectPin(){
        s.unlockCorrectPin();
    }   
    
    public void Activate(){
        s.Activate();
    }

    public void Logout(){
        s.Logout();
    }  
    
    public void Close(){
        s.Close();
    }

    public void Create(){
        s.Create();
    }

}
