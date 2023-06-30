/**
 * DebitCard is the child class of BankCard.
 * DebitCard contains 4 attributes, a constructor and some methods.
 * Methods type of this class comprises of user-defined methods, accessor and mutator methods.
 *
 * @author Rishav Karna
 * @version Jan 13, 2023
 */
public class DebitCard extends BankCard
{
    //instance variables with private access modifiers
    private int pinNumber;
    private int withdrawlAmount;
    private String dateOfWithdrawl;
    private boolean  hasWithdrawn;

    /**
     * Constructor for the objects of class DebitCard
     * @param balanceAmount, cardId, bankAccount, clientName, issuerBank, pinNumber are parameter for constructor
     * 
     */
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String clientName, String issuerBank, int pinNumber )
    {
      super(cardId, balanceAmount, bankAccount, issuerBank);//constructor of parent class   
      setClientName(clientName); //setter method of parent class
      
      this.pinNumber = pinNumber; //assigned with parameter value
      
      hasWithdrawn = false; //initialised
    }
    
    //accessor methods 
    
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    
    public int getWithdrawlAmount()
    {
        return this.withdrawlAmount;
    }
    
    public String getDateOfWithdrawl()
    {
        return this.dateOfWithdrawl;
    }
    
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    //mutator method
    /**
     * setter method setWithdrawlAmount
     * to update withdrawlAmount
     * @param withdrawlAmount a parameter for method
     * @return void
     */
    public void setWithdrawlAmount(int withdrawlAmount)
    {
        this.withdrawlAmount = withdrawlAmount;
    }
    
    /**
     * withdraw method used to withdraw and deduct an amount from user's account
     * @param withdrawlAmount,dateOfWithdrawl, pinNumber are parameters of method
     * @return void
     */
    public void withdraw(int withdrawlAmount, String dateOfWithdrawl, int pinNumber)
    {
        if(this.pinNumber == pinNumber) {
            // valid pin number is entered
            if(super.getBalanceAmount() >= withdrawlAmount) {
                //enough balance condition
                this.hasWithdrawn = true;
            }
            else {
                //no enough balance condition
                System.out.println("There is no sufficient balance in your acccount.");
                this.hasWithdrawn = false; 
            }
        }
        else {
            //incorect pin codition
            System.out.println("You entered the wrong pin number.");
            this.hasWithdrawn = false;
        }
        
        if(hasWithdrawn) {
            this.dateOfWithdrawl = dateOfWithdrawl;
            this.withdrawlAmount = withdrawlAmount;
            
            /**
             * setter method of BankCard called
             * value passed as a parameter
             * updates balance amount after wthdrawal process
             */
            setBalanceAmount(getBalanceAmount()-withdrawlAmount);
        }
    }
    
    /**
     * overrided the display method of BankCard
     * display method prints out the debit details of the user
     * @return void
     */
    
    @Override
    public void display()
    {
        System.out.println("====================DEBIT CARD========================");
        super.display(); //method of parent class called
        
        if(hasWithdrawn) {
            //if user has withdrawn 
            System.out.println("Pin number: "+ pinNumber);
            System.out.println("Withdrawn amount: "+ withdrawlAmount);
            System.out.println("Date of withdrawl: "+ dateOfWithdrawl);
        }
        
        // only balance amount is shown with other bank details if there is no transaction
        System.out.println("======================================================");
        System.out.println("");
    }
    
}