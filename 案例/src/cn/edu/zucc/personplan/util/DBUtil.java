package cn.edu.zucc.personplan.util;

import java.sql.Connection;

public class DBUtil {
    private static final String jdbcUrl = "jdbc:mysql://121.196.167.21:3306/booklib?useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String dbUser = "root";
    private static final String dbPwd = "vincentDockerMysql2021";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws java.sql.SQLException {
        return java.sql.DriverManager.getConnection(jdbcUrl, dbUser, dbPwd);
    }
}
