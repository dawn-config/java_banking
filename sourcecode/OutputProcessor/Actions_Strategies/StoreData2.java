package sourcecode.OutputProcessor.Actions_Strategies;

import sourcecode.DataStore.*;

public class StoreData2 extends StoreData{

    public void StoreData_(DataStore d){
        storeData2((DS2) d);
    }

    public void storeData2(DS2 d){
        d.pn = d.temp_p;
        d.id = d.temp_y;
        d.b = d.temp_a;
    }
}
