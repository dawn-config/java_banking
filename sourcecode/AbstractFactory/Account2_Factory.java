package sourcecode.AbstractFactory;
import sourcecode.Account.*;
import sourcecode.DataStore.DS2;
import sourcecode.DataStore.DataStore;
import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;
import sourcecode.OutputProcessor.Actions_Strategies.*;

class Account_2_Factory extends AbstractFactory{

    @Override
    public Account getAccount(int account_type) {
        //Create DataStore for Account
        DataStore dstore = getDS();

        //Create all the strategies for Account
        StoreData sd = getStoreData();
        IncorrectIdMsg iim = getIncorrectIdMsg();
        PromptForPin pfp = getPromptForPin();
        IncorrectPinMsg ipm = getIncorrectPinMsg();
        TooManyAttemptsMsg tmam = getTooManyAttemptsMsg();
        DisplayMenu dm = getDisplayMenu();
        DisplayBalance db = getDisplayBalance();
        NoFundsMsg nfm = getNoFundsMsg();
        MakeDeposit md = getMakeDeposit();
        MakeWithdrawl mw = getMakeWithdrawl();
        BelowMinBalanceMsg bmbm = getBelowMinBalanceMsg();
        Penalty pen = getPenalty();
        CloseAccount ca = getCloseAccount();

        //Create OutputProcessor for Account
        OutputProcessor op = getOutputProcessor(dstore, sd, iim, pfp, ipm, tmam, dm, db, nfm, md, mw, bmbm, pen, ca);

        //Create MDA-EFSM for Account
        MDA_EFSM mdaefsm = new MDA_EFSM(op);

        Account2 account2 = new Account2(dstore, mdaefsm);
        return account2;
    }

    @Override
    public DataStore getDS() {
        // TODO Auto-generated method stub
        DS2 ds=new DS2();
        return ds;
    }

    @Override
    public StoreData getStoreData() {
        // TODO Auto-generated method stub
        StoreData2 sd = new StoreData2();
        return sd;
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        // TODO Auto-generated method stub
        IncorrectIdMsg2 iid = new IncorrectIdMsg2(); 
        return iid;
    }

    @Override
    public PromptForPin getPromptForPin() {
        // TODO Auto-generated method stub
        PromptForPin2 pfp = new PromptForPin2();
        return pfp;
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        // TODO Auto-generated method stub
        IncorrectPinMsg2 ipm = new IncorrectPinMsg2();
        return ipm;
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        // TODO Auto-generated method stub
        TooManyAttemptsMsg2 tmam = new TooManyAttemptsMsg2();
        return tmam;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        // TODO Auto-generated method stub
        DisplayMenu2 dm = new DisplayMenu2();
        return dm;
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        // TODO Auto-generated method stub
        DisplayBalance2 db = new DisplayBalance2();
        return db;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        // TODO Auto-generated method stub
        NoFundsMsg2 nfm = new NoFundsMsg2();
        return nfm;
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        // TODO Auto-generated method stub
        MakeDeposit2 md= new MakeDeposit2();
        return md;
    }

    @Override
    public MakeWithdrawl getMakeWithdrawl() {
        // TODO Auto-generated method stub
        MakeWithdrawl2 mw = new MakeWithdrawl2();
        return mw;
    }

    @Override
    public BelowMinBalanceMsg getBelowMinBalanceMsg() {
        // TODO Auto-generated method stub
        BelowMinBalanceMsg2 bmbm = new BelowMinBalanceMsg2();
        return bmbm;
    }


    @Override
    public Penalty getPenalty() {
        // TODO Auto-generated method stub
        Penalty2 pen = new Penalty2();
        return pen;
    }

    @Override
    public CloseAccount getCloseAccount() {
        // TODO Auto-generated method stub
        CloseAccount2 ca = new CloseAccount2();
        return ca;
    }

    @Override
    public OutputProcessor getOutputProcessor(DataStore ds,
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
                                                CloseAccount ca) {
        // TODO Auto-generated method stub
        OutputProcessor op = new OutputProcessor(ds, sd, iim, pfp, ipm, tmam, dm, db, nfm, 
                                                    md, mw, bmbm, pen, ca);
        return op;
    }

}

