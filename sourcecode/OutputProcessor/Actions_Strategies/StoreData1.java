package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class StoreData1 extends StoreData{
    //public void storeData(DS1 d)
    public void StoreData_(DataStore d){
        storeData1((DS1)d);
    }
    public void storeData1(DS1 d){
        d.pn = d.temp_p;
        d.id = d.temp_y;
        d.b = d.temp_a;
    }
}
