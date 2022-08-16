package LogExample;

public class TemporaryManager {

    private BaseLogger _logger;

    public TemporaryManager(BaseLogger logger){
        _logger =logger;
    }

    public void add(){
        System.out.println("Information Added.");
        _logger.log("Log message from TemporaryManager");
    }
}
