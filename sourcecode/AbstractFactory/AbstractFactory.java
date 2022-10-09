package sourcecode.AbstractFactory;

import sourcecode.Account.*;
import sourcecode.OutputProcessor.OutputProcessor;
import sourcecode.OutputProcessor.Actions_Strategies.*;
import sourcecode.DataStore.*;

public abstract class AbstractFactory {

    //Create Account
    public abstract Account getAccount(int account_type); 

    //Create DataStore
    public abstract DataStore getDS();

    //Create Meta-Actions which are the strategy pattern
    public abstract StoreData getStoreData();
    public abstract IncorrectIdMsg getIncorrectIdMsg();
    public abstract PromptForPin getPromptForPin();
    public abstract IncorrectPinMsg getIncorrectPinMsg();
    public abstract TooManyAttemptsMsg getTooManyAttemptsMsg();
    public abstract DisplayMenu getDisplayMenu();
    public abstract DisplayBalance getDisplayBalance();
    public abstract NoFundsMsg getNoFundsMsg();
    public abstract MakeDeposit getMakeDeposit();
    public abstract MakeWithdrawl getMakeWithdrawl();
    public abstract BelowMinBalanceMsg getBelowMinBalanceMsg();
    public abstract Penalty getPenalty();
    public abstract CloseAccount getCloseAccount();

    //Create OutputProcessor
    public abstract OutputProcessor getOutputProcessor(DataStore ds,
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
                                                        CloseAccount ca);

}
