package sqlDemo.repository;

import java.sql.SQLException;

public class Shares extends BaseTable implements TableOperation {

    public Shares() throws SQLException {
        super("shares");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS " + getTableName() + " (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "changeProbability INT NOT NULL DEFAULT 25," +
                "startPrice DECIMAL(15,2) NOT NULL DEFAULT 10," +
                "delta INT NOT NULL DEFAULT 15)","Table " + getTableName() + " created");
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void createConstraints() throws SQLException {

    }
}
