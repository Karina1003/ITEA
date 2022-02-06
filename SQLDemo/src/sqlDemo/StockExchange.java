package sqlDemo;

import sqlDemo.repository.ShareRates;
import sqlDemo.repository.Shares;
import sqlDemo.repository.TraderActions;
import sqlDemo.repository.Traders;

import java.sql.*;

public class StockExchange {
//    public static final String DB_URL = "jdbc:h2:/SQLDemo/db/stockExchange"; //absolute path C:/Users/karin/IdeaProjects/SQLDemo/db/stockExchange
//    public static final String DB_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/stockExchange"; //absolute path C:/Users/karin/IdeaProjects/SQLDemo/db/stockExchange
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private Shares shares;
    private ShareRates shareRates;
    private Traders traders;
    private TraderActions traderActions;

    public StockExchange() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);
        this.shares = new Shares();
        this.shareRates = new ShareRates();
        this.traders = new Traders();
        this.traderActions = new TraderActions();
    }

    public static void main(String[] args) {
        try {
            StockExchange stockExchange = new StockExchange();
            stockExchange.createTable();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL error");
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,"root","2063DMTkp7548");
    }

    private void createTable() throws SQLException {
        shares.createTable();
        shareRates.createTable();
        traders.createTable();
        traderActions.createTable();
        shareRates.createForeignKeys();
        traderActions.createForeignKeys();
    }
}
