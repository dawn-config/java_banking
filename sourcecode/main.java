package sourcecode;
import java.util.*;

import sourcecode.Account.*; 
import sourcecode.AbstractFactory.Account_Factory;
class driver{


  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
} 

  public static void account1menu(Account1 ac){
    String choice;
    int p;
    int y;
    int a;
    int x;
    int d;
    int w;
    Scanner s = new Scanner(System.in);
    while(true){

      clearScreen();
      System.out.println("-------------------------------------------");
      System.out.println("ACCOUNT-1");
      System.out.println("MENU OF OPERATIONS");
      System.out.println("0. open(int pin, int id, int balance)");
      System.out.println("1. pin(int pin)");
      System.out.println("2. deposit(int deposit)");
      System.out.println("3. withdraw(int withdrawl)");
      System.out.println("4. balance()");
      System.out.println("5. login(int id)");
      System.out.println("6. logout()");
      System.out.println("7. lock(int pin)");
      System.out.println("8. unlock(int pin)");
      System.out.println("q. Quit the demo program");
      System.out.println("-------------------------------------------");

      choice = s.nextLine();

      switch (choice) {
        case "0": //open
          clearScreen();
          System.out.println("Operation: open(int pin, int id, int balance)");
          System.out.print("\tEnter pin : ");
          //read input value for p here
          p = s.nextInt();
          System.out.print("\tEnter user id : ");
          //read input value for y here
          y = s.nextInt();
          System.out.print("\tEnter balance : ");   
          //read input value for a here                                   
          a = s.nextInt();
          ac.open(p, y, a);
          break;


        case "1": //pin
          clearScreen();
          System.out.println("Operation: pin(int pin)");
          System.out.print("\tEnter your pin : ");          
          x = s.nextInt();
          ac.pin(x);
          break;


        case "2": //deposit
          clearScreen();
          System.out.println("Operation: deposit(int deposit_amount)");
          System.out.print("\tEnter your deposit amount : "); 
          d = s.nextInt();
          ac.deposit(d);
          break;


        case "3": //withdraw
          clearScreen();
          System.out.println("Operation: withdraw(int withdrawl_amount)");
          System.out.print("\tEnter your withdrawl amount : "); 
          w = s.nextInt();
          ac.withdraw(w);
          break;


        case "4": //balance
          clearScreen();
          System.out.println("Operation: balance()");
          ac.balance();
          break;


        case "5": //login
          clearScreen();
          System.out.println("Operation: login(int id)");
          System.out.print("\tEnter your user id : "); 
          y = s.nextInt();
          ac.login(y);

          break;


        case "6": //logout
          clearScreen();
          System.out.println("Operation: logout()");
          ac.logout();

          break;


        case "7": //lock
          clearScreen();
          System.out.println("Operation: lock(int pin)");
          System.out.print("\tEnter your pin : "); 
          x = s.nextInt();
          ac.lock(x);
          break;
          
          
        case "8": //unlock
          clearScreen();
          System.out.println("Operation: unlock(int pin)");
          System.out.print("\tEnter your pin : "); 
          x = s.nextInt();
          ac.unlock(x);
          break;

        case "q": //quit program
          s.close();
          return;

        default:
          break;       
      }
    }
  }



  public static void account2menu(Account2 ac){

    String choice;
    int p;
    int y;
    float a;
    int x;
    float d;
    float w;
    Scanner s = new Scanner(System.in);
    while(true){

      clearScreen();
      System.out.println("-------------------------------------------");
      System.out.println("ACCOUNT-2");
      System.out.println("MENU OF OPERATIONS");
      System.out.println("0. OPEN(int pin, int id, float balance");
      System.out.println("1. PIN(int pin)");
      System.out.println("2. DEPOSIT(float deposit)");
      System.out.println("3. WITHDRAW(float withdrawl)");
      System.out.println("4. BALANCE()");
      System.out.println("5. LOGIN(int id)");
      System.out.println("6. LOGOUT()");
      System.out.println("7. suspend()");
      System.out.println("8. activate()");
      System.out.println("9. close()");
      System.out.println("q. Quit the demo program");
      System.out.println("-------------------------------------------");
 
      choice = s.nextLine();

      switch (choice) {
        case "0": //OPEN
          clearScreen();
          System.out.println("Operation: OPEN(int pin, int id, float balance)");
          System.out.print("\tEnter pin : ");
          //read input value for p here
          p = s.nextInt();
          System.out.print("\tEnter user id : ");
          //read input value for y here
          y = s.nextInt();
          System.out.print("\tEnter balance : ");   
          //read input value for a here                                   
          a = s.nextFloat();
          ac.OPEN(p, y, a);
          break;


        case "1": //PIN
          clearScreen();
          System.out.println("Operation: PIN(int pin)");
          System.out.print("\tEnter your pin : ");          
          x = s.nextInt();
          ac.PIN(x);
          break;


        case "2": //DEPOSIT
          clearScreen();
          System.out.println("Operation: DEPOSIT(float deposit_amount)");
          System.out.print("\tEnter your deposit amount : "); 
          d = s.nextFloat();
          ac.DEPOSIT(d);
          break;


        case "3": //WITHDRAW
          clearScreen();
          System.out.println("Operation: WITHDRAW(float withdrawl_amount)");
          System.out.print("\tEnter your withdrawl amount : "); 
          w = s.nextFloat();
          ac.WITHDRAW(w);
          break;


        case "4": //BALANCE
          clearScreen();
          System.out.println("Operation: BALANCE()");
          ac.BALANCE();
          break;


        case "5": //LOGIN
          clearScreen();
          System.out.println("Operation: LOGIN(int id)");
          System.out.print("\tEnter your user id : "); 
          y = s.nextInt();
          ac.LOGIN(y);

          break;


        case "6": //LOGOUT
          clearScreen();
          System.out.println("Operation: LOGOUT()");
          ac.LOGOUT();

          break;


        case "7": //suspend
          clearScreen();
          System.out.println("Operation: suspend()"); 
          ac.suspend();
          break;
          
          
        case "8": //activate
          clearScreen();
          System.out.println("Operation: activate()"); 
          ac.activate();
          break;

        case "9": //close
          clearScreen();
          System.out.println("Operation: close()");
          ac.close();
          break;
        
        case "q": //quit program
          s.close();
          return;

        default:
          break;
        
      }
    }
  }


  public static void main(String[] args) {
    
    Scanner S = new Scanner(System.console().reader()); 
    int choice = 0; 
    while (choice > 2 || choice < 1 ) {
      clearScreen();
      System.out.println("Please Select account type [1 or 2]. To exit select Zero : ");
      System.out.print("\t> ");
      choice = S.nextInt();
      S.nextLine();

      if (choice ==0){
        S.close();
        return ;
      }
    }
    //create account of user selected type
    Account_Factory AF = new Account_Factory();
    Account myaccount = AF.getAccount(choice);
    S.close();
    if (choice == 1 ) {
      account1menu((Account1)myaccount);
    }
    else{
      account2menu((Account2)myaccount);
    }
    return;



  } 
}