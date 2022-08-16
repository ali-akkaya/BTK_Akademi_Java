package InterfaceExample;

public class OracleClientDal implements IClientDal, IRepository{
    @Override
    public void add() {
        System.out.println("Oracle is added.");
    }
}
