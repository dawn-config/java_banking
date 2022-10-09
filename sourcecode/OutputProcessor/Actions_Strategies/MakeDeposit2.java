package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class MakeDeposit2 extends MakeDeposit {
  
    public void MakeDeposit_(DataStore d){
        makeDeposit2((DS2) d);
    }


    public void makeDeposit2(DS2 d){
        d.b = d.b + d.temp_d;
    }
}