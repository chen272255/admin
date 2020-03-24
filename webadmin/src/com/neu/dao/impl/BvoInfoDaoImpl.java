package com.neu.dao.impl;

import com.neu.dao.BvoInfoDao;
import com.neu.util.DbUtil;

import java.sql.*;

public class BvoInfoDaoImpl implements BvoInfoDao {
    @Override
    public int addInfo(String sql) {
        Connection con = DbUtil.getCon();
        PreparedStatement state = null;
        int num = 0;
        try {
            state = con.prepareStatement(sql);
            num = state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeDbSource(con,state);
        }
        return num;
    }
}
