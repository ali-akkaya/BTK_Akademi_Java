package DBManagerExampleAbstract;

public class OracleDatabaseManager extends DatabaseManager{

    @Override
    public void getData() {
        System.out.println("Data retrieved: Oracle");
    }
}
