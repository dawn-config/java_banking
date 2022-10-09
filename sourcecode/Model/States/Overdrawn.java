package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class Overdrawn extends States{

    public Overdrawn(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void WithdrawBelowMin() {
        // TODO Auto-generated method stub
        p.BelowMinBalanceMsg();
    }

    @Override
    public boolean Deposit() {
        // TODO Auto-generated method stub
        p.MakeDeposit();
        m.ChangeState(m.DEPOSITWITDRAWLIMBO);
        return true;
    }

    @Override
    public void Balance() {
        // TODO Auto-generated method stub
        p.DisplayBalance();
    }

    @Override
    public void lockIncorrectPin() {
        // TODO Auto-generated method stub
        p.IncorrectPinMsg();
    }

    @Override
    public void lockCorrectPin() {
        // TODO Auto-generated method stub
        m.ChangeState(m.LOCKED);
    }


    @Override
    public void Logout() {
        // TODO Auto-generated method stub
        m.ChangeState(m.IDLE);
    }
    
}
