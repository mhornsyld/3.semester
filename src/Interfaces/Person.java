package Interfaces;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Jacob
 */
public interface Person {
    public int getSocialSecurityNumber();
    public String getFullName();
    public String getTitle();
    public String getPhoneNumber();
    public String getEmail();
    public String getAddress();
    public boolean isEmployee();
    public BigDecimal getSalary();
    public Date getDateOfEmployment();
}