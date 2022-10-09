package sourcecode.Model.States;

import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor; 

public class Suspended extends States{
    
    public Suspended(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void Balance() {
        // TODO Auto-generated method stub
        p.DisplayBalance();
    }

    @Override
    public void Activate() {
        // TODO Auto-generated method stub
        m.ChangeState(m.READY);
        System.out.println("Account Re-Activated");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }

   
    @Override
    public void Close() {
        // TODO Auto-generated method stub
        p.CloseAccount();
        System.out.println("Account closed");
        m.ChangeState(m.IDLE);
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}    
    }

}
