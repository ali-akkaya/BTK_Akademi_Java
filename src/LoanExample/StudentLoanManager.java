package LoanExample;

public class StudentLoanManager extends LoanManager{

    @Override
    public double calculate(double amount){
        System.out.println("Loan is calculated.");
        return amount * 1.10;
    }
}
