package DBManagerExampleAbstract;

public class SQLServerDatabaseManager extends DatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data retrieved: SQL Server");
    }
}
