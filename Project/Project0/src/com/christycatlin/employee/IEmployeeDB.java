package com.christycatlin.employee;

import java.sql.SQLException;

public interface IEmployeeDB {
    void confirmNewAccount(String name, String surName, String phone, String email, String type, double deposit) throws SQLException;
    void empLogin(int id, String pass) throws SQLException;
    void empAccountApproval(int id, String pass, String name, String surName, String phone, String email, String type, double deposit) throws SQLException;
}
