package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public abstract class States {
    MDA_EFSM m;
    OutputProcessor p;

    
    public States(MDA_EFSM mdaefsm, OutputProcessor op){
        m = mdaefsm;
        p = op;
    }
    private void invalidop(){
        System.out.println("Invalid opeartion call for current state");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
    public void open(){invalidop();};
    public void login(){invalidop();};
    public void IncorrectLogin(){invalidop();};
    public void IncorrectPin(int max){invalidop();};
    public void CorrectPinBelowMin(){invalidop();};
    public void CorrectPinAboveMin(){invalidop();};
    public void WithdrawNoFunds(){invalidop();};
    public void AboveMin(){};
    public void BelowMin(){};
    public void Withdraw(){invalidop();};
    public void WithdrawBelowMin(){invalidop();};    
    public boolean Deposit(){invalidop();return false;};
    public void Balance(){invalidop();};
    public void lockIncorrectPin(){invalidop();};
    public void lockCorrectPin(){invalidop();};
    public void Suspend(){invalidop();};
    public void unlockIncorrectPin(){invalidop();};
    public void unlockCorrectPin(){invalidop();};
    public void Activate(){invalidop();};
    public void Logout(){invalidop();};
    public void Close(){invalidop();};
    public void Create(){invalidop();};
}
