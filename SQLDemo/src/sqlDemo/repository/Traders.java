package sqlDemo.repository;

import java.sql.SQLException;

public class Traders extends BaseTable implements TableOperation {

    public Traders() throws SQLException {
        super("traders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS " + getTableName() + " (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operation INT NOT NULL," +
                "freqTick INT NOT NULL," +
                "cash DECIMAL (15,2) NOT NULL DEFAULT 1000," +
                "tradingMethod INT NOT NULL," +
                "changeProbability INT NOT NULL DEFAULT 50," +
                "about VARCHAR(255) NULL)","Table " + getTableName() + " created");
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void createConstraints() throws SQLException {

    }
}
