package sourcecode.AbstractFactory;
import sourcecode.Account.*;
import sourcecode.DataStore.DS1;
import sourcecode.DataStore.DataStore;
import sourcecode.Model.MDA_EFSM;
import sourcecode.OutputProcessor.OutputProcessor;
import sourcecode.OutputProcessor.Actions_Strategies.*;

class Account_1_Factory extends AbstractFactory{

    @Override
    public Account getAccount(int account_type) {
        //Create DataStore for Account
        DS1 dstore = (DS1)getDS();

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

        Account1 account1 = new Account1(dstore, mdaefsm);
        return account1;
    }

    @Override
    public DataStore getDS() {

        DS1 ds=new DS1();
        return ds;
    }

    @Override
    public StoreData getStoreData() {
        // TODO Auto-generated method stub
        StoreData1 sd = new StoreData1();
        return sd;
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        IncorrectIdMsg1 iid = new IncorrectIdMsg1(); 
        return iid;
    }

    @Override
    public PromptForPin getPromptForPin() {
        // TODO Auto-generated method stub
        PromptForPin1 pfp = new PromptForPin1();
        return pfp;
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        // TODO Auto-generated method stub
        IncorrectPinMsg1 ipm = new IncorrectPinMsg1();
        return ipm;
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        // TODO Auto-generated method stub
        TooManyAttemptsMsg1 tmam = new TooManyAttemptsMsg1();
        return tmam;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        // TODO Auto-generated method stub
        DisplayMenu1 dm = new DisplayMenu1();
        return dm;
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        // TODO Auto-generated method stub
        DisplayBalance1 db = new DisplayBalance1();
        return db;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        // TODO Auto-generated method stub
        NoFundsMsg1 nfm = new NoFundsMsg1();
        return nfm;
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        // TODO Auto-generated method stub
        MakeDeposit1 md= new MakeDeposit1();
        return md;
    }

    @Override
    public MakeWithdrawl getMakeWithdrawl() {
        // TODO Auto-generated method stub
        MakeWithdrawl1 mw = new MakeWithdrawl1();
        return mw;
    }

    @Override
    public BelowMinBalanceMsg getBelowMinBalanceMsg() {
        // TODO Auto-generated method stub
        BelowMinBalanceMsg1 bmbm = new BelowMinBalanceMsg1();
        return bmbm;
    }

    @Override
    public Penalty getPenalty() {
        // TODO Auto-generated method stub
        Penalty1 pen = new Penalty1();
        return pen;
    }

    @Override
    public CloseAccount getCloseAccount() {
        // TODO Auto-generated method stub
        CloseAccount1 ca = new CloseAccount1();
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
