public class Product {


    // Constructor Methods
    public Product(int id, String name, String description, double price, int stockAmount){
        _id =id;
        _name =name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;

    }
    public Product(){

    }

    // Attribute or Field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _code;

    public int getId(){
        return _id;
    }
    public void setId(int id){
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getCode() {
        _code = _name.substring(0,1) + _id;
        return _code;
    }

}
