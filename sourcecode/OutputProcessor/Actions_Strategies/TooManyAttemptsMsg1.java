package sourcecode.OutputProcessor.Actions_Strategies;

public class TooManyAttemptsMsg1 extends TooManyAttemptsMsg {
    public void TooManyAttemptsMsg_(){
        System.out.println("Too many attempts");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
}
