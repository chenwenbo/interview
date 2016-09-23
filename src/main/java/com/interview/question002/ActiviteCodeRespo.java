package com.interview.question002;

import java.sql.*;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/9/23.
 */
public class ActiviteCodeRespo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/activite";

    static final String USER = "root";
    static final String PASS = "root";

    public void saveActiviteCodes(Iterator<String> activiteCodes, String activiteName) throws SQLException, ClassNotFoundException {
        String sql = "insert into activite_code(code,name) values(?,?)";
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement stmt = conn.prepareStatement(sql)
            )
        {
            Class.forName(JDBC_DRIVER);
            while (activiteCodes.hasNext()) {
                String activiteCode = activiteCodes.next();
                stmt.setString(1,activiteCode);
                stmt.setString(2,activiteName);
                stmt.executeUpdate();
            }
        }
    }
}
