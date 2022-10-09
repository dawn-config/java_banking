package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class MakeWithdrawl2 extends MakeWithdrawl {
    public void MakeWithdrawl_(DataStore d){
        makeWithdrawl2((DS2) d);
    }
    
    public void makeWithdrawl2(DS2 d){
        d.b = d.b - d.temp_w;
    }
}
