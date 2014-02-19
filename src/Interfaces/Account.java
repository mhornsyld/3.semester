package Interfaces;

import java.math.BigDecimal;

/**
 *
 * @author Jacob
 */
public interface Account {
    public int getAccountNumber();
    public int getRegistrationNumber();
    public BigDecimal getInterestRate();
    public int getCustomerNumber();
    public BigDecimal getBalance();
    public void addFunds(BigDecimal funds);
    public void transferFunds(BigDecimal funds, Account account);
    public BigDecimal cashOut(BigDecimal amount);
    public void addInterests();
}