package sourcecode.OutputProcessor.Actions_Strategies;
import sourcecode.DataStore.*;

public class CloseAccount2 extends CloseAccount {
    public void CloseAccount_(DataStore d){
        closeAccount2((DS2)d);
    }

    public void closeAccount2(DS2 d){
        d.b=0;
        d.id = -1;
        d.pn = -1;
        d.temp_a = 0;
        d.temp_d = 0;
        d.temp_p = 0;
        d.temp_w =0;
        d.temp_y =0;
    }
}
