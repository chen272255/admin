package com.neu.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbUtil {
	//关闭资源
		public static void closeDbSource(AutoCloseable...close){
			for (AutoCloseable c : close) {
				try {
					c.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	public static Connection getCon(){
		ComboPooledDataSource com = new ComboPooledDataSource("mysql-config");
		try {
			return com.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
