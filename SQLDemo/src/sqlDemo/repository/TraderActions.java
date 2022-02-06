package sqlDemo.repository;

import java.sql.SQLException;

public class TraderActions extends BaseTable implements TableOperation {

    public TraderActions() throws SQLException {
        super("trader_actions");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS " + getTableName() + " (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "trader BIGINT NOT NULL," +
                "share_rate BIGINT NOT NULL," +
                "amount BIGINT NOT NULL)","Table " + getTableName() + " created");
    }

    @Override
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE " +  getTableName() + " " +
                "ADD FOREIGN KEY (trader) " +
                "REFERENCES traders(id)", "Foreign key traders-trader_actions created");
        super.executeSqlStatement("ALTER TABLE " +  getTableName() + " " +
                "ADD FOREIGN KEY (share_rate) " +
                "REFERENCES share_rates(id)", "Foreign key share_rates-trader_actions created");
    }

    @Override
    public void createConstraints() throws SQLException {

    }
}
