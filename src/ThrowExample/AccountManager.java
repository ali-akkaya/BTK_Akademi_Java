package ThrowExample;

public class AccountManager {
    private double _balance;
    public void deposit(double amount){
        _balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficientException {
        if(_balance>=amount){
            _balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficientException("Insufficient Balance");
        }
    }

    public double getBalance() {
        return _balance;
    }
}
