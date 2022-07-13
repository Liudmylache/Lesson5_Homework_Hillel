import products.Coffee;
import java.util.List;

public class Merchant {
    public static int getTotalCoffeeBeansByOrder(List<Coffee> itemsInOrder) {
        int total = 0;

        for (Coffee coffee : itemsInOrder) {
            total += coffee.getCoffeeBeans();
        }
        return total;
    }

    public static int getTotalSyrupByOrder(List<Coffee> itemsInOrder) {
        int total = 0;

        for (Coffee coffee : itemsInOrder) {
            total += coffee.getSyrup();
        }
        return total;
    }

    public static int getTotalSugarByOrder(List<Coffee> itemsInOrder) {
        int total = 0;

        for (Coffee coffee : itemsInOrder) {
            if (coffee.isSugar()) {
                total++;
            }
        } return total;
    }

    public void printMerchantInfo(List<Coffee> itemsInOrder){
        System.out.println("A MERCHANT RECEIPT");
        System.out.println("Total coffeeBeans used (g): " + getTotalCoffeeBeansByOrder(itemsInOrder));
        System.out.println("Total syrup used (ml): " + getTotalSyrupByOrder(itemsInOrder));
        System.out.println("Total sugar used (packs): " + getTotalSugarByOrder(itemsInOrder));
    }
}
