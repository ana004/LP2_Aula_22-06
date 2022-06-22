package inOutPutData;

public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountRecord(int acct, String first, String last, double bal) {
        setAccount(acct);
        setfirstName(first);
        setlastName(last);
        setbalance(bal);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int acct) {
        this.account = acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }
}