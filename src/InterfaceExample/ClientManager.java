package InterfaceExample;

public class ClientManager {

    private IClientDal _clientDal;

    public ClientManager(IClientDal clientDal){
        _clientDal = clientDal;
    }
    //Operational codes written in here.Check the input, input types etc.
    public void add(){
        _clientDal.add();

    }
}
