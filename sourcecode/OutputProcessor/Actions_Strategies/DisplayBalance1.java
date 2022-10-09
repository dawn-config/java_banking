package sourcecode.OutputProcessor.Actions_Strategies;
import sourcecode.DataStore.*;

public class DisplayBalance1 extends DisplayBalance {
    public void DisplayBalance_(DataStore d){
        displayBalance1((DS1)d);
    }

    public void displayBalance1(DS1 d){
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
