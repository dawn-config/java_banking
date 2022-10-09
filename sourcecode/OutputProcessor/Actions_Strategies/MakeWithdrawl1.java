package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class MakeWithdrawl1 extends MakeWithdrawl {
    public void MakeWithdrawl_(DataStore d){
        makeWithdrawl1((DS1) d);
    }
    
    public void makeWithdrawl1(DS1 d){
        d.b = d.b - d.temp_w;
    }
}
