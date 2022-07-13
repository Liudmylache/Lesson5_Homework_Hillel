import products.*;
import java.util.*;


public class Display {

    public static void main(String[] args) {

        Check check1 = new Check(1, "Alisa");
        Merchant merchant = new Merchant();

        Americano americano1 = new Americano(true, "Out");
        Americano americano2 = new Americano(false, "Whole");
        Espresso espresso1 = new Espresso(true);
        Latte latte1 = new Latte(false,"Whole");
        IcedCoffee icedCoffee1 = new IcedCoffee(true);

        List<Coffee> itemsInOrder = new ArrayList<>();
        itemsInOrder.add(americano1);
        itemsInOrder.add(americano2);
        itemsInOrder.add(espresso1);
        itemsInOrder.add(latte1);
        itemsInOrder.add(icedCoffee1);

        HashMap<Integer, List<Coffee>> orders = new HashMap<>();
        orders.put(check1.orderNumber, itemsInOrder);

        check1.printCheckTop();
        System.out.println(orders);
        check1.printCheckButton(itemsInOrder);
        System.out.println("_____________________________________");
        merchant.printMerchantInfo(itemsInOrder);
    }

}