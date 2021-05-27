package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {
    private String host, dbName;
    private int port;

    private String user, password;

    private Connection conn = null;

    MyDB(String host, int port, String dbName) {
        this.host = host;
        this.port = port;
        this. dbName = dbName;
    }


    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void connect() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        try {
            conn = DriverManager.getConnection(
                    jdbcString, connectionProps
            );
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: " + jdbcString);
            System.out.println("Komunikat błędu: " + e.getMessage());
            conn = null;
        }
        System.out.println("Connected to database " + dbName);
    }

    public Connection getConnection() throws SQLException {
        if(conn == null)
            connect();
        return conn;
    }

    public void closeConnection() {
        if (conn != null) {
            try{
                conn.close();
            } catch (SQLException e) {
                System.out.println("Błąd przy zamykaniu połączenia bazodanowego: " + e.getMessage());
            }
            conn = null;
        }
    }

 }
