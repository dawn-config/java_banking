package sourcecode.Model.States;


import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;

public class Ready extends States {

    public Ready(MDA_EFSM mdaefsm, OutputProcessor op) {
        super(mdaefsm, op);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void WithdrawNoFunds() {
        // TODO Auto-generated method stub
        p.NoFundsMsg();
    }


    @Override
    public void Withdraw() {
        // TODO Auto-generated method stub
        p.MakeWithdrawl();
        m.ChangeState(m.DEPOSITWITDRAWLIMBO);
    }

    @Override
    public boolean Deposit() {
        // TODO Auto-generated method stub
        p.MakeDeposit();
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
    public void Suspend() {
        // TODO Auto-generated method stub
        m.ChangeState(m.SUSPENDED);
        System.out.println("Account Suspended");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }


    @Override
    public void Logout() {
        // TODO Auto-generated method stub
        m.ChangeState(m.IDLE);
    }
    
}
