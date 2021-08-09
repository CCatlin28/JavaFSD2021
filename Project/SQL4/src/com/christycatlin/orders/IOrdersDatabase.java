package com.christycatlin.orders;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IOrdersDatabase {
    void addOrder(double ordNum, double purchAmt, Date date, double custID, double salesID) throws SQLException;
    void updateOrder(Orders orders) throws SQLException;
    void deleteOrder(double ordNum) throws SQLException;
    List<Orders> getOrders() throws SQLException;
    List<Orders> orderByID(double ordNum) throws SQLException;
}
