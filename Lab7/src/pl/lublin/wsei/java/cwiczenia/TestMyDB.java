package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.SQLException;

public class TestMyDB {
    public static void main(String[] args) throws SQLException {
        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("root");
        Connection conn = db.getConnection();
        if(conn != null) {
            System.out.println("Połączenie z bazą danych nawiązane");
        }
        db.closeConnection();
        System.out.println("Połączenie z bazą danych zakończone");
    }
}
