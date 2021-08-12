package accounts;

public class Accounts {
    private int acctId;
    private int custID;
    private String acctType;
    private double balance;

    public Accounts(int acctId, int custID, String acctType, double balance){
        this.acctId = acctId;
        this.custID = custID;
        this.acctType = acctType;
        this.balance = balance;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    @Override
    public String toString(){
        return "Account Number: " + acctId + " is a "
                + acctType + " Account belonging to Customer ID: "
                + custID + " with a balance of $" +balance;
    }
}
