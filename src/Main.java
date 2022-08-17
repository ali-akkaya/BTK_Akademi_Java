import DBManagerExampleAbstract.DriverManager;
import DBManagerExampleAbstract.SQLServerDatabaseManager;
import GameExampleAbstract.GameCalculator;
import GameExampleAbstract.KidGameCalculator;
import GenericsExample.MyList;
import InterfaceExample.ClientManager;
import InterfaceExample.OracleClientDal;
import JDBCExample.Buyer;
import JDBCExample.DbHelper;
import LoanExample.*;
import LogExample.*;
import RepositoryDesignPatternExample.Client;
import RepositoryDesignPatternExample.Constants;
import StaticExample.Item;
import StaticExample.ItemManager;
import StopwatchExampleThreading.StopwatchThread;
import ThrowExample.AccountManager;
import ThrowExample.BalanceInsufficientException;
import WorkingWithFileExample.FileManager;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {






    }

    // In the below method, you can find code examples from lessons 1 to 10 ("Introduction to Programming" to "Working With Classes" included.)
    public static void codesFromLessonsBetween1to10(){

        System.out.println("Hello world!");
        // Variable examples:
        int integerExample = 10;
        String stringExample = "AliAkkaya";
        char charExample = 'C'; // Double quote is not used when defining a char.
        // Primitive Types: boolean, char, byte, short, int, long, float, double,

        if(stringExample.equals("AliAkkaya")){
            System.out.println("Your is statement worked.");
        } else {
            System.out.println("Your if statement didn't work.");
        }

        char grade = 'm';
        switch (grade){
            case 'A':
                System.out.println("Your note is 4.00");
                break;
            case 'B':
                System.out.println("Your note is 3.00");
                break;
            case 'C':
                System.out.println("Your note is 2.00");
                break;
            case 'D':
                System.out.println("Your note is 1.00");
                break;
            case 'F':
                System.out.println("Your note is 0.00");
                break;
            default:
                System.out.println("Dude WTF! We are asking just grades");

        }


        for (int i = 5; i > 0; i--) {
            System.out.println(i+ " little monkeys jumping on the bed.");
            System.out.println("One fell off and bumped his head ");
            System.out.println("Mama called the doctor and the doctor said");
            System.out.println("\"No more monkeys jumping on the bed!\"\n");
        }

        String[] stringArrayExample = new String[]{"String_1", "String_2","String_3"};

        // Foreach usage in the below.
        for (String stringFromArray: stringArrayExample
        ) {
            System.out.println(stringFromArray);
        }

        // Multi-Dimensional Array
        // First Row then Column
        String[][] mdExample = new String[3][3];
        mdExample[0][0]= "FirstRow FirstColumn";
        mdExample[0][1]= "FirstRow SecondColumn";
        mdExample[0][2]= "FirstRow ThirdColumn";
        mdExample[1][0]= "SecondRow FirstColumn";
        mdExample[1][1]= "SecondRow SecondColumn";
        mdExample[1][2]= "SecondRow ThirdColumn";
        mdExample[2][0]= "ThirdRow FirstColumn";
        mdExample[2][1]= "ThirdRow SecondColumn";
        mdExample[2][2]= "ThirdRow ThirdColumn";




        for (int i = 0; i < mdExample.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < mdExample[i].length; j++) { //this equals to the column in each row.
                System.out.print(mdExample[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }

        // String Examples
        String message = "Today is a cool day.";
        System.out.println(message.length());
        System.out.println("5th element of sentence: "+ message.charAt(4));
        String message_2 = " Let's go out.";
        System.out.println(message.concat(message_2)); // Concat returns another string. This is not an inplace method.
        System.out.println(message.startsWith("Today")); // Returns boolean.
        System.out.println(message.endsWith("month."));
        char[] charArray = new char[10];
        message.getChars(0,10,charArray,0);
        System.out.println(charArray);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println(message.replace(' ', '-')); // Replace returns new string. This is not an inplace method.
        System.out.println(message.substring(11,15)); //Starts with charAt(11), however not includes charAt(15)

        for(String word: message.split(" ")){
            System.out.println(word);
        }
        String different_message = "    Today is a cool day.       ";
        System.out.println(different_message);
        //Trimmed version.
        System.out.println(different_message.trim());
        //TODO Check for .trim() function.


        //Check for prime number
        int primeNumberToCheck = 17;
        if(primeNumberToCheck<2){
            System.out.println("Not a prime number");

        }else {
            int i =2;
            boolean isPrime = true;
            while(i<primeNumberToCheck/2){
                if(primeNumberToCheck%i ==0){
                    isPrime = false;
                    System.out.println("Not a prime number.");

                    break;
                }
                i++;
            }
            if(isPrime)
                System.out.println("Is a prime number.");

        }

        int perfectNumberToCheck = 28;
        int sum =0;
        for (int i = 1; i <= perfectNumberToCheck/2; i++) {
            if (perfectNumberToCheck%i == 0)
                sum += i;
        }
        if(perfectNumberToCheck == sum){
            System.out.println("This is a perfect number");
        }else {
            System.out.println("This is not a perfect number");

        }
        findNumberInArray();

        System.out.println(sumFunction(3, 5,7,8,9,33,45));

        // Classes are reference type
        CustomerManager customerManager = new CustomerManager();

        customerManager.add();
        customerManager.remove();

        // Value Type Example
        // Value Type store everything in Stack. So they are not related to Heap, and they not refer to anything in Heap.
        int number_1 = 10;
        int number_2 = 20;
        number_2 = number_1;
        number_1= 30;
        System.out.println(number_2); // 10

        // Reference Type Example
        // When we write "intArray_2 = intArray_1;", both of the objects refers to same memory created in "int[] intArray_1 = new int[]{1,2,3};".
        // Since we changed intArray_1's first element and intArray_2 also refers to same place. Printed value is 10.

        int[] intArray_1 = new int[]{1,2,3};
        int[] intArray_2 = new int[]{4,5,6};
        intArray_2 = intArray_1;
        intArray_1[0] = 10;
        System.out.println(intArray_2[0]); //10

    }

    // In the below method, you can find code examples from lessons 11 to 14 ("Encapsulation" to "Polymorphism" included.)
    public static  void codesFromLessonsBetween11to14(){

        Product product = new Product(1, "Laptop", "Game Laptop",5000,4);

        /*
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Game Laptop");
        product.setPrice(5000);
        product.setStockAmount(4);
        System.out.println(product.getCode());*/


        // Creating a new class for managing product is related to SOLID principles. Single Responsibility.
        ProductManager productManager = new ProductManager();
        productManager.add(product);

        //------Inheritance Related Examples------

        Customer customer = new Customer();
        Employee employee = new Employee();

        DriverManager customerManager = new DriverManager();
        EmployeeManager employeeManager = new EmployeeManager();


        // Even though we asked for LoanManager, since EducationLoanManager is inherited from LoanManager method works without error.
        LoanUI loanUI = new LoanUI();
        loanUI.showCalculatedLoan(new EducationLoanManager());

        //------Polymorphism Related Example------
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log message for email.");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};
        for (BaseLogger logger: loggers
        ) {
            logger.log("Log message.");

        }

        TemporaryManager temporaryManager = new TemporaryManager(new DatabaseLogger());
        temporaryManager.add();

        LoanManager[] loanManagers = new LoanManager[]{new EducationLoanManager(), new AgricultureLoanManager(), new StudentLoanManager()};

        for (LoanManager loanManager: loanManagers
        ) {
            System.out.println(loanManager.calculate(1000));

        }
    }

    // In the below method, you can find code examples from lessons 15 to 18 ("Abstract Classes" to "Packages" included.)
    public static void codesFromLessonsBetween15to18(){
        //------Abstract Class Example------
        GameCalculator gameCalculator = new KidGameCalculator();

        GameCalculator gameCalculator1 = new GameCalculator() {
            @Override
            public void calculate() {
                System.out.println("This override done in the main.");
            }
        };
        gameCalculator.calculate();
        gameCalculator1.calculate();


        // Abstract classes are helper for SOLID principle Open/Close.
        // We shouldn't change anything form the current version of the project while adding new features.

        DriverManager driverManager = new DriverManager();
        driverManager._databaseManager = new SQLServerDatabaseManager();
        driverManager.getCustomer();

        //TODO Learn difference between Interface and abstract classes.
        //------Interface Example------
        // You can pass either OracleClientDal or MySQLClientDal in the below initialization.
        // If you add any other class such as SQLServer you fan first implement from interface IclientDal,
        // Then you can pass it directly to the below initialization.
        ClientManager clientManager = new ClientManager(new OracleClientDal());
        clientManager.add();

        //------Composition Inner Class Example------
        ItemManager itemManager = new ItemManager();
        Item item = new Item();
        item.name = "Mouse";
        item.price = 10;
        itemManager.add(item);

        //------ Built-In Package Examples------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Merhaba "+name);
    }

    // In the below method, you can find code examples from lesson 19 (Collections)
    public static void codesFromLesson19(){
        //------ Collections Examples ------
        ArrayList arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add("Ankara");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        arrayList.set(0,100);
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.add(15);
        arrayList.add(1.445);
        arrayList.add("İzmir");
        for (Object i:arrayList
        ) {
            System.out.println(i);
        }
        // Type-safe ArrayList
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Ankara");
        stringArrayList.add("Adana");
        stringArrayList.add("İstabul");

        stringArrayList.remove("İstanbul");

        Collections.sort(stringArrayList);

        for (String string: stringArrayList
        ) {
            System.out.println(string);
        }

        // ArrayList with classes.
        Person person = new Person();
        person._id=1;
        person._firstName = "Ali";
        person._lastName = "Akkaya";
        person._age = 21;

        Person person2 = new Person();
        person2._id=2;
        person2._firstName = "Hale";
        person2._lastName = "Tat";
        person2._age = 20;

        Person person3 = new Person();
        person3._id=3;
        person3._firstName = "Muhammet";
        person3._lastName = "Akkaya";
        person3._age = 35;

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person);
        personArrayList.add(person2);
        personArrayList.add(person3);
        for (Person human:  personArrayList
        ) {
            System.out.println(human._firstName);

        }
        personArrayList.remove(person3);
        System.out.println("\nArrayList After Removing:\n");

        for (Person human:  personArrayList
        ) {
            System.out.println(human._firstName);

        }

        //------HASHMAP------ aka.Dictionary
        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");

        System.out.println(dictionary);
        System.out.println(dictionary.get("table"));
        dictionary.remove("table");

        for (String item: dictionary.keySet()
        ) {
            System.out.println(item);
        }
    }

    // In the below method, you can find code examples from lesson 20 (Exception Handling)
    public static void codesFromLesson20(){
        //------Exception Handling------

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (Exception exception){
            System.out.println("Error occured");
            System.out.println(exception);
        }finally {
            System.out.println("This code block runs everytime");
        }
        //TODO Check Exception Hierarchy in Java
        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Logged in to DB:"+exception);
        }
        finally {
            System.out.println("This code block runs everytime");
        }

        // Read from file example.
        int total =0;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader= new BufferedReader(new FileReader("src/ExceptionHandlingExampleFileReading/numbers.txt"));
            String line =null;
            // .readLine() method also need IO Exception in the main method. Or we can catch IOException in try catch.
            while (true){
                try {
                    if (!((line = bufferedReader.readLine())!=null)) break;
                } catch (IOException e) {
                    System.out.println(e);
                }
                total += Integer.valueOf(line);

            }
            System.out.println("Toplam: "+total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            // Here we need to throw IO Exception in main method. Or we can add try-catch block for closing bufferReader.
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap = " +accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Hesap = " +accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = " +accountManager.getBalance());
        try {
            accountManager.withdraw(20);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = " +accountManager.getBalance());

    }

    // In the below method, you can find code examples from lessons 21 to 23 ("Working With Files" to "Threading" included.)
    public static void codesFromLessonsBetween21to23(){
        //------Working With Files------
        FileManager fileManager = new FileManager();
        //Instead of creating an object we can call these methods directly via class name.
        FileManager.readFile();

        fileManager.createFile();
        fileManager.getFileInfo();
        fileManager.readFile();
        //fileManager.writeFile();
        fileManager.writeFile2();
        fileManager.readFile();

        //------Generics------
        MyList<String> stringMyList = new MyList<String>();
        stringMyList.add("Ankara");
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(5);

        //Generic Method example in Constants class with constant method.
        Constants  constants = new Constants();
        constants.constants(new Client());

        //------Threads------

        StopwatchThread stopwatchThread1 = new StopwatchThread("thread1");
        StopwatchThread stopwatchThread2 = new StopwatchThread("thread2");
        StopwatchThread stopwatchThread3 = new StopwatchThread("thread3");

        stopwatchThread1.start();
        stopwatchThread2.start();
        stopwatchThread3.start();
    }

    // In the below method, you can find code examples from lesson 24 (JDBC)
    public static void codesFromLesson24(){

        // Read Example
        readSQL();

        // Insert Example
        insertSQL();

        // Update Example
        updateSQL();

        // Delete Example
        deleteSQL();
    }
    public static  void findNumberInArray(){
        int[] numbers = new int[]{1,3,5,7,45,67};
        int numberToCheck = 7;
        boolean isIn = false;

        for (int number:numbers
             ) {
            if(number == numberToCheck)
                isIn=true;

        }
        if(isIn){
            System.out.println("Number is in the list.");
        }else {
            System.out.println("Number is not in the list.");
        }




    }


    public static int sumFunction(int... numbers){
        // int... allow us to use dynamic number of arguments in our function. It is known as variable arguments
            int sum = 0;
        for (int number: numbers
             ) {
            sum+= number;
        }
        return sum;
    }


    public static  void readSQL(){

        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            System.out.println("DB connection is created.");
            statement = connection.createStatement();

            // Select Example
            resultSet = statement.executeQuery("select * from customers");
            ArrayList<Buyer> buyersArrayList = new ArrayList<Buyer>();

            while (resultSet.next()){
                buyersArrayList.add(new Buyer(
                        resultSet.getString("customerNumber"),
                        resultSet.getString("customerName"),
                        resultSet.getString("contactFirstName"),
                        resultSet.getString("contactLastName"),
                        resultSet.getString("phone")));

                System.out.println(resultSet.getString("customerName"));
            }
            System.out.println(buyersArrayList.size());
        }catch (SQLException exception){
            exception.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                dbHelper.showErrorMessage(e);
            }
        }
    }
    public static  void insertSQL(){

        Connection connection =null;
        PreparedStatement preparedStatement = null;
        DbHelper dbHelper = new DbHelper();
        try {
            connection = dbHelper.getConnection();
            String sqlQuery = "INSERT INTO `classicmodels`.`productlines`\n" +
                    "(`productLine`," +
                    "`textDescription`," +
                    "`htmlDescription`," +
                    "`image`)" +
                    "VALUES" +
                    "(?," +
                    "?," +
                    "null," +
                    "null);";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"In University"); // For the first question mark
            preparedStatement.setString(2,"Now we are in your university."); // For the second question mark

            int result = preparedStatement.executeUpdate(); // returns how many row affected.
            System.out.println("Record is added to DB" + result+ "row afffected.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static  void updateSQL(){

        Connection connection =null;
        PreparedStatement preparedStatement = null;
        DbHelper dbHelper = new DbHelper();

        try {
            connection = dbHelper.getConnection();
            String sqlQuery = "UPDATE productlines SET textDescription = ? WHERE productLine = 'In Home'";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"We will be in your home sooner you think");

            int result = preparedStatement.executeUpdate(); // returns how many row affected.
            System.out.println("Record is updated to DB" + result+ "row afffected.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void deleteSQL(){

        Connection connection =null;
        PreparedStatement preparedStatement = null;
        DbHelper dbHelper = new DbHelper();

        try {
            connection = dbHelper.getConnection();
            String sqlQuery = "DELETE FROM productlines  WHERE productLine = ?";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"In University");
            int result = preparedStatement.executeUpdate(); // returns how many row affected.
            System.out.println("Record is updated to DB" + result+ " row afffected.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

}