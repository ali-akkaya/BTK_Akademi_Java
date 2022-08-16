package ThrowExample;

public class BalanceInsufficientException extends Exception{
    String _message;
    public BalanceInsufficientException(String message){
        _message =message;
    }
    public String getMessage(){
        return _message;
    }
}
