/**
 * CreditCard is the parent class.
 * CreditCard contains 6 attributes, a constructor and some methods.
 * Methods type of this class comprises of user-defined methods, accessor and mutator methods.
 *
 * @author Rishav Karna
 * @version Jan 13, 2023
 */
public class CreditCard extends BankCard
{
    //instance variables with private access modifers
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    /**
     * Constructor for the objects of class DebitCard
     * @param balanceAmount, cardId, bankAccount, clientName, issuerBank, pinNumber are parameter for constructor
     *
     */
    public CreditCard (int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super(cardId, balanceAmount, bankAccount, issuerBank); //called contructor of parent class
        setClientName(clientName); //called setter method of parent class
        
        //assigned with parameter values
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate =  expirationDate;
        
        isGranted = false; //initialised
    }
    
    //accessor methods
    
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    //mutator method
    
    /**
     * a mutator method to set the credit limit
     * updates the credit limit
     * @param creditLimit and gracePeriod are the parameters for the method
     * @return void
     * 
     */
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        
        if(creditLimit <= 2.5 * getBalanceAmount()) {
            //credit limit is less than or equal to 2.5 times the balance amount
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true; //credit granted
        }
        else {
            //credit denied
            System.out.println("Sorry, you do not have sufficient balance for the required credit amount. Credit limit cannot be issued.");
        }
    }
    
    /**
     * cancelCreditCard method cancels the credit card
     * @return void
     */
    public void cancelCreditCard()
    {
        // set to  zero
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    /**
     * overrided the display method of BankCard
     * display method prints out the credit details of the user
     * @return void
     */
    @Override
    public void display()
    {
        System.out.println("====================Credit CARD========================");
        
        super.display(); //method of parent class called
        
        System.out.println("CVC number: " + cvcNumber);
        System.out.println("Interest rate: "+ interestRate);
        System.out.println("Expiry date: " + expirationDate);
        
        if(isGranted) {
            //credit granted condition
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        }
        else {
            //credit denied condition   
            System.out.println("Your credit limit is not issued yet!");
        }
        System.out.println("======================================================");
        System.out.println("");
    }
}