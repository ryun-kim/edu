package Exam_01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils{
    private static DbUtils util = new DbUtils();
    private DbUtils(){}
    public static DbUtils getInstance(){
        return util;
    }

    public Connection getCon() throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName (driver);
        Connection conn = DriverManager.getConnection(url, "root", "koreait");
        return conn;
    }
    public void closecon(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            }catch(Exception e) {}
        }
    }
}
