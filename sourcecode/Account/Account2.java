package sourcecode.Account;

import sourcecode.DataStore.*;
import sourcecode.Model.MDA_EFSM;

public class Account2 extends Account{  
    MDA_EFSM m;
    DS2 d;
    public Account2(DataStore dstore, MDA_EFSM mdaefsm){
        d = (DS2) dstore;
        m = mdaefsm;
    }

    public void OPEN(int p, int y, float a){
        d.temp_p = p;
        d.temp_y = y;
        d.temp_a = a;
        m.open();       
    }

    public void PIN(int x){
        if (d.pn ==x){
            m.CorrectPinAboveMin();
        }
        else{
            m.IncorrectPin(2);
        }
    }

    public void DEPOSIT(float deposit){
        d.temp_d = deposit;
        m.Deposit();
        //since the account has no minimum balance, it will move to this state
        m.AboveMin();
    }

    public void WITHDRAW(float w){
        d.temp_w = w;
        if ((d.b-w) <= 0){
            m.WithdrawNoFunds();
        }
        else{
            m.Withdraw();
            m.AboveMin();
        }
    }

    public void BALANCE(){
        m.Balance();
    }

    public void LOGIN(int y){
        if (y == d.id){
            m.login();
            PIN(d.temp_p);
        }
        else{
            m.IncorrectLogin();
        }
    }

    public void LOGOUT(){
        m.Logout();
    }

    public void suspend(){
        m.Suspend();
    }

    public void activate(){
        m.Activate();
    }

    public void close(){
        m.Close();
    }
}
