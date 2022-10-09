package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class Locked extends States{

    public Locked(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public void unlockIncorrectPin() {
        // TODO Auto-generated method stub
        p.IncorrectPinMsg();
    }

    @Override
    public void unlockCorrectPin() {
        // TODO Auto-generated method stub
        m.ChangeState(m.LOCKLIMBO);    
    }
    
}
