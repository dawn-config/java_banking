package sourcecode.OutputProcessor.Actions_Strategies;

public class NoFundsMsg2 extends NoFundsMsg {
    public void NoFundsMsg_(){
        System.out.println("No funds available");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
}
