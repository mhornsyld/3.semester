package Interfaces;

import java.math.BigDecimal;

/**
 *
 * @author Jacob
 */
public interface Account {
    public int getAccountNumber();
    public int getRegistrationNumber();
    public void setRegistrationNumber(int registrationNumber);
    public BigDecimal getInterestRate();
    public void setInterestRate(BigDecimal interestRate);
    public int getCustomerNumber();
    public BigDecimal getBalance();
    public void addFunds(BigDecimal funds);
    public void transferFunds(BigDecimal funds, Account account);
    public BigDecimal cashOut(BigDecimal amount);
    public void addInterests();
}