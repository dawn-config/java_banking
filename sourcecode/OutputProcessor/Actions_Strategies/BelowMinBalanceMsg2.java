package sourcecode.OutputProcessor.Actions_Strategies;


public class BelowMinBalanceMsg2 extends BelowMinBalanceMsg {
    public void BelowMinBalanceMsg_(){
        System.out.println("Below minimum balance");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
}

