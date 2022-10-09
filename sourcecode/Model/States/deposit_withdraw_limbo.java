package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class deposit_withdraw_limbo extends States{

    public deposit_withdraw_limbo(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }
   

    @Override
    public void AboveMin() {
        // TODO Auto-generated method stub
        m.ChangeState(m.READY);     
    }

    @Override
    public void BelowMin() {
        // TODO Auto-generated method stub
        m.ChangeState(m.OVERDRAWN);     
    }

    @Override
    public void WithdrawBelowMin() {
        // TODO Auto-generated method stub
        p.BelowMinBalanceMsg();
        p.Penalty();
        m.ChangeState(m.OVERDRAWN);    
    }
    
}
