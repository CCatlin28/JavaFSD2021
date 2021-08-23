package com.christy.employee;

import java.sql.SQLException;

public interface IDaoEmployee {
	String viewAll() throws SQLException;
	String view(int id) throws SQLException;
	String add(String name, String email, String gender, String country) throws SQLException;
	String update(int id, String name, String email, String gender, String country) throws SQLException;
	String delete(int id) throws SQLException;

}
