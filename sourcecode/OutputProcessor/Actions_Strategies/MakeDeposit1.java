package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class MakeDeposit1 extends MakeDeposit {
    public void MakeDeposit_(DataStore d){
        makeDeposit1((DS1) d);
    }


    public void makeDeposit1(DS1 d){
        d.b = d.b + d.temp_d;
    }
}
