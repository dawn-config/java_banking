package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class CheckPin extends States{
    public CheckPin(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void IncorrectPin(int max) {
        // TODO Auto-generated method stub
        m.attempts++;
        p.IncorrectPinMsg();

        if (m.attempts >= max){
            p.TooManyAttemptsMsg();
            m.ChangeState(m.IDLE);
            m.attempts = 0;
        }else{
            m.ChangeState(m.IDLE);
            System.out.println("\tTry to login again with a different pin");
            System.out.print("Press Enter key to continue...");
            try
            {
                System.in.read();
            }  
            catch(Exception e)
            {}
            
        }
     
    }
    

    @Override
    public void CorrectPinBelowMin() {
        // TODO Auto-generated method stub
        p.DisplayMenu();
        m.ChangeState(m.OVERDRAWN);
        m.attempts = 0;
        
    }

    @Override
    public void CorrectPinAboveMin() {
        // TODO Auto-generated method stub
        p.DisplayMenu();
        m.ChangeState(m.READY);
        m.attempts = 0;        
    }


    @Override
    public void Logout() {
        // TODO Auto-generated method stub
      m.ChangeState(m.IDLE);    
    }


    
}
