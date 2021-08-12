package com.christycatlin.employee;

import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeDB {
    void confirmNewAccount(String name, String surName, String phone, String email, String type, double deposit) throws SQLException, IOException;
    void empLogin(int id, String pass) throws SQLException, IOException;
    void empAccountApproval(int id, String pass, String name, String surName, String phone, String email, String type, double deposit) throws SQLException, IOException;
}
