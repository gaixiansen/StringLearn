package com.github.jdbc.login.service;

import com.github.jdbc.entity.User;
import com.github.jdbc.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DoLogin {

    public static User findUser(String  name, String password){
        User user = null;
        try {
            Connection conn = DBUtils.getConnection();
            String sql = "select * from user where name=? and passwd=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setBirthday(rs.getDate("birthday"));
                user.setPassword(rs.getString("passwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
