package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class Penalty1 extends Penalty {
    public void Penalty_(DataStore d){
        penalty1((DS1) d);
    }

    public void penalty1(DS1 d){
        d.b = d.b - 15;
    }
}
