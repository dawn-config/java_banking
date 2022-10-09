package sourcecode.OutputProcessor.Actions_Strategies;
import sourcecode.DataStore.*;
import java.util.Scanner;

public class PromptForPin2 extends PromptForPin {
    public void PromptForPin_(DataStore d){
        promptForPin2((DS2) d);
    }

    public void promptForPin2(DS2 d){
        System.out.print("\tPlease enter your pin : ");
        Scanner s = new Scanner(System.console().reader());
        d.temp_p = s.nextInt();
    }
}
