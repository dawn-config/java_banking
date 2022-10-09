package sourcecode.OutputProcessor.Actions_Strategies;
import sourcecode.DataStore.*;

public class DisplayBalance2 extends DisplayBalance {
    public void DisplayBalance_(DataStore d){
        displayBalance2((DS2)d);
    }

    public void displayBalance2(DS2 d){
        System.out.println("Account Balance: " + d.b);
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}
    }
}
