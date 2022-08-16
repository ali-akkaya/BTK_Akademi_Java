package StaticExample;

public class ItemValidator {

    static {
        System.out.println("Static constructor method run.");
    }
    public static boolean isValid(Item item){
        if(item.price>0 && !item.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static class InnerClass{
        public static void delete() {

        }
    }
}
