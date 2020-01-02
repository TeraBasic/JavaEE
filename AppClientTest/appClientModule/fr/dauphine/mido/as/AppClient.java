package fr.dauphine.mido.as;

import java.sql.*;


public class AppClient {

    //private final static String _SELECT1 = "SELECT * FROM new_table";
    static final String USER = "root";
    static final String PASS = "12345678";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        StringBuffer resultStringBuffer;
                
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);            
            stmt = conn.createStatement();   
            
            // sql 
            String _SELECT1 = "SELECT * FROM new_table";
            rs = stmt.executeQuery(_SELECT1);                        
            resultStringBuffer = new StringBuffer("Résultat :\n");
            while (rs.next()) {
                resultStringBuffer.append(rs.getString(1));
                resultStringBuffer.append("=");
                resultStringBuffer.append(rs.getString(2));
                resultStringBuffer.append("\n");
            }
            System.out.println(resultStringBuffer.toString());
		} catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (Exception e2) {
                System.out.println("resultSet à null");
            }
            try {
                stmt.close();
            } catch (Exception e2) {
                System.out.println("stmt à null");
            }
            try {
                conn.close();
            } catch (Exception e2) {
                System.out.println("conn à null");
            }
        }

    }

}