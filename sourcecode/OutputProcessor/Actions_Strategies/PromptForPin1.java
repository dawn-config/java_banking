package sourcecode.OutputProcessor.Actions_Strategies;

import java.util.Scanner;
import sourcecode.DataStore.*;

public class PromptForPin1 extends PromptForPin {
    public void PromptForPin_(DataStore d){
        promptForPin1((DS1) d);
    }

    public void promptForPin1(DS1 d){
        System.out.print("\tPlease enter your pin : ");
        Scanner s = new Scanner(System.console().reader());
        d.temp_p = s.nextInt();
    }
}