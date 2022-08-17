package StaticExample;

public class DatabaseHelper {



    // Even though we can use such an implementation, it violates SOLID principles.
    // It violates Single Responsibility. It is better to create a separate class for CRUD and Connection.
    public static class CRUD {
        public static void delete(){}

        public static void update(){}
    }

    public static class ConnectionToDatabase {
        public static void createConnection(){}
    }
}
