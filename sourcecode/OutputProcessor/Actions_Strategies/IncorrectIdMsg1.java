package sourcecode.OutputProcessor.Actions_Strategies;

public class IncorrectIdMsg1 extends IncorrectIdMsg {
    public void IncorrectIdMsg_(){
        System.out.println("Incorrect ID");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
}
