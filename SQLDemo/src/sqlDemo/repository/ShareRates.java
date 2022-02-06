package sqlDemo.repository;

import java.sql.SQLException;

public class ShareRates extends BaseTable implements TableOperation {

    public ShareRates() throws SQLException {
        super("share_rates");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS " + getTableName() + " (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operDate DATETIME NOT NULL," +
                "share BIGINT NOT NULL," +
                "rate DECIMAL(15,2) NOT NULL)","Table " + getTableName() + " created");
    }

    @Override
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE " +  getTableName() + " " +
                "ADD FOREIGN KEY (share) " +
                "REFERENCES shares(id)", "Foreign key shares-share_rates created");
    }

    @Override
    public void createConstraints() throws SQLException {

    }
}
