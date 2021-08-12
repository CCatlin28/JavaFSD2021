package transactions;

import java.sql.SQLException;
import java.util.List;

public interface ITransactionDB {
    void viewAll() throws SQLException;
    List<Transactions> viewCust(int custID) throws SQLException;
    List<Transactions> viewAcct(int acctNum) throws SQLException;
    void logDeposit(int custID, int acctNum, double start, double deposit, double end) throws SQLException;
    void logWithdraw(int custID, int acctNum, double start, double withdraw, double end) throws SQLException;

}
