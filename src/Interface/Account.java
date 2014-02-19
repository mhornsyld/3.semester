package Interface;

/**
 *
 * @author Jacob
 */
public interface Account {
    public int getAccountNumber();
    public int getRegistrationNumber();
    public int getInterestRate();
    public int getCustomerNumber();
    public int getBalance();
    public void addFunds(int funds);
    public void addInterests();
}