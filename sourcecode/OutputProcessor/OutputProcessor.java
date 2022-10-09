package sourcecode.OutputProcessor;

import sourcecode.DataStore.*;
import sourcecode.OutputProcessor.Actions_Strategies.*;


public class OutputProcessor {
    DataStore d;
    StoreData a1;
    IncorrectIdMsg a2;
    PromptForPin a3;
    IncorrectPinMsg a4;
    TooManyAttemptsMsg a5;
    DisplayMenu a6;
    DisplayBalance a7;
    NoFundsMsg a8;
    MakeDeposit a9;
    MakeWithdrawl a10;
    BelowMinBalanceMsg a11;
    Penalty a12;
    CloseAccount a13;

    
    public OutputProcessor(DataStore ds,
                            StoreData sd,
                            IncorrectIdMsg iim,
                            PromptForPin pfp,
                            IncorrectPinMsg ipm,
                            TooManyAttemptsMsg tmam,
                            DisplayMenu dm,
                            DisplayBalance db,
                            NoFundsMsg nfm,
                            MakeDeposit md,
                            MakeWithdrawl mw,
                            BelowMinBalanceMsg bmbm,
                            Penalty pen,
                            CloseAccount ca){
        d = ds;
        a1 = sd;
        a2 = iim;
        a3 = pfp;
        a4 = ipm;
        a5 =tmam;
        a6 = dm;
        a7 = db;
        a8 = nfm;
        a9 = md;
        a10 = mw;
        a11 = bmbm;
        a12 = pen;
        a13 = ca;

        
    }

    public void BelowMinBalanceMsg(){
        a11.BelowMinBalanceMsg_();
    }

    public void CloseAccount(){
        a13.CloseAccount_(d);
    }

    public void DisplayBalance(){
        a7.DisplayBalance_(d);
    }

    public void DisplayMenu(){
        a6.DisplayMenu_();
    }

    public void IncorrectIdMsg(){
        a2.IncorrectIdMsg_();
    }

    public void IncorrectPinMsg(){
        a4.IncorrectPinMsg_();
    }

    public void MakeDeposit(){
        a9.MakeDeposit_(d);
    }

    public void MakeWithdrawl(){
        a10.MakeWithdrawl_(d);
    }

    public void NoFundsMsg(){
        a8.NoFundsMsg_();
    }

    public void Penalty(){
        a12.Penalty_(d);
    }

    public void PromptForPin(){
        a3.PromptForPin_(d);
    }

     public void StoreData(){
        a1.StoreData_(d);
    }

    public void TooManyAttemptsMsg(){
        a5.TooManyAttemptsMsg_();
    }

}
