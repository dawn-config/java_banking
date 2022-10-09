package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class Idle extends States {
    public Idle(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void login() {
        // TODO Auto-generated method stub
        p.PromptForPin();
        m.ChangeState(m.CHECKPIN);
    }

    @Override
    public void IncorrectLogin() {
        // TODO Auto-generated method stub
        p.IncorrectIdMsg();

        // display menu
    }

}
