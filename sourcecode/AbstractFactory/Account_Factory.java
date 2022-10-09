package sourcecode.AbstractFactory;

import sourcecode.Account.Account;

public class Account_Factory {
    public Account getAccount(int account_type) {
        if (account_type ==1){
            Account_1_Factory factory =new Account_1_Factory();
            return factory.getAccount(1);
        }else{
            if(account_type==2){
                Account_2_Factory factory =new Account_2_Factory();
                return factory.getAccount(2);
            }
        }
        return null;
    }

}
