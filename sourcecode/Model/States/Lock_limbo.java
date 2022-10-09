package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class Lock_limbo extends States{
    public Lock_limbo(MDA_EFSM mdaefsm, OutputProcessor op) {
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
    
}
