package JDBCExample;

public class Buyer {
        private String _customerNumber;
    private String _customerName;
    private String _contactFirstName;
    private String _contactLastName;
    private String _phone;


    public Buyer(String _customerNumber, String _customerName, String _contactFirstName, String _contactLastName, String _phone) {
        this._customerNumber = _customerNumber;
        this._customerName = _customerName;
        this._contactFirstName = _contactFirstName;
        this._contactLastName = _contactLastName;
        this._phone = _phone;
    }
}
