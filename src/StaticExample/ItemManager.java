package StaticExample;

public class ItemManager {
    public void  add(Item item){
        ItemValidator itemValidator = new ItemValidator();
        if(ItemValidator.isValid(item)){
            System.out.println("Item added to DB: "+ item.name);

        }else {
            System.out.println("Item is not valid.");
        }
    }
}
