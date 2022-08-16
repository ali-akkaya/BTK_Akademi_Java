package InterfaceExample;

public class MySQLClientDal implements IClientDal {

    @Override
    public void add() {
        System.out.println("MySQL is added.");
    }
}
