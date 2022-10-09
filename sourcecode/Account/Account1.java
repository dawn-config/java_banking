package sourcecode.Account;



import sourcecode.DataStore.DS1;
import sourcecode.Model.MDA_EFSM;


public class Account1 extends Account{
    MDA_EFSM m;
    DS1 d;
    public Account1(DS1 dstore, MDA_EFSM mdaefsm){
        d =  dstore;
        m = mdaefsm;

    }
    public void open(int p, int y, int a){
        d.temp_p = p;
        d.temp_y = y;
        d.temp_a = a;
        m.open();
    }

    public void pin(int x){
        if (x== d.pn){
            if (d.b <= 100){
                m.CorrectPinBelowMin();
            }
            else{
                m.CorrectPinAboveMin();
            }
        }
        else{

            m.IncorrectPin(1);
            /*
            if (m.attempts < 1){
                System.out.print("\tTry again with a different pin : ");
                Scanner s = new Scanner(System.console().reader());
                int new_x = s.nextInt();
                pin(new_x);
            }*/

        }
    }

    public void deposit(int deposit){
        d.temp_d = deposit;
        if(!m.Deposit()){return;}
        
        if (d.b > 100){
            m.AboveMin();
        }
        else{
            m.BelowMin();
        }
    }

    public void withdraw(int w){
        d.temp_w = w;
        m.Withdraw();
        if (d.b > 100){
            m.AboveMin();
        }
        else{
            m.WithdrawBelowMin();
        }

    }

    public void  balance(){
        m.Balance();
    }

    public void login(int y){
        if (y== d.id){
            m.login();
            pin(d.temp_p);
        }
        else{
            m.IncorrectLogin();
        }
    }

    public void logout(){
        m.Logout();
    }

    public void lock(int x){
        if (d.pn == x){
            m.lockCorrectPin();
        }
        else{
            m.lockIncorrectPin();
        }
    }

    public void unlock(int x){
        if (d.pn == x){
            m.unlockCorrectPin();
            if (d.b < 100){
                m.BelowMin();
            }
            else{
                m.AboveMin();
            }
        }
        else{
            m.unlockIncorrectPin();
        }
    }

}
