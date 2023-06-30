/**
 * BankCard is the parent class.
 * BankCard contains 5 attributes, a constructor and some methods.
 * Methods type of this class comprises of user-defined methods, accessor and mutator methods.
 *
 * @author Rishav Karna
 * @version Jan 13, 2023
 */
public class BankCard 
{
    //instance variables with private access modifiers
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    /**
     *  Constructor for the objects of class BankCard 
     *  @param cardID, balanceAmount, bankAccount, issuerBank are parameter for constructor
     *  
     */
    public BankCard(int cardId, double balanceAmount, String bankAccount, String issuerBank)
    {
        clientName = ""; //initialise clientName
        
        //assigning with parameter values
        // this keyword used to instance variable
        this.cardId = cardId;
        this.balanceAmount = balanceAmount;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    
    //accessor methods 
    
    public int getCardId()
    {
        return this.cardId;
    }
    
    public String getClientName()
    {
        return this.clientName;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    //accessor methods
    /**
     * setter method setClientName
     * to update clientName
     * 
     * @param clientName a paramter for method
     * @return void
     */
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    /**
     * setter method setBalanceAmount
     * to update balance amount
     * @param balanceAmount a paramter for method
     * @return void
     */
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    /**
     * display method prints out the bank details of the user
     * @return void
     */
    public void display()
    {
        
        if(clientName.equals("")) {
            // clientname is empty
            System.out.println("Client name not found!");
            System.out.println("Client name is mandatory to access details.");
        }
        else {
            // client name is available
            System.out.println("Card ID: "+ cardId);
            System.out.println("Client name: "+ clientName);
            System.out.println("Issuer bank: "+ issuerBank);
            System.out.println("Bank account: "+ bankAccount);
            System.out.println("Balance amount: "+ balanceAmount);
        }
       
    }
    
}