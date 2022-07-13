import products.Americano;
import products.Coffee;
import products.Espresso;
import java.util.*;


public class Display {

    public static void main(String[] args) {

        Americano americano1 = new Americano(true, "Out");
        Americano americano2 = new Americano(false, "Whole");
        Espresso espresso1 = new Espresso(true);
        Check check1 = new Check(1, "Alisa");


        List<Coffee> itemsInOrder = new ArrayList<>();
        itemsInOrder.add(americano1);
        itemsInOrder.add(americano2);
        itemsInOrder.add(espresso1);

        HashMap<Integer, List<Coffee>> orders = new HashMap<>();
        orders.put(check1.orderNumber, itemsInOrder);


        System.out.println(orders);

        System.out.println(getTotalByOrder(itemsInOrder));
    }

    public static double getTotalByOrder(List<Coffee> itemsInOrder) {
        double total = 0;

        for(Coffee coffee : itemsInOrder) {
            total += coffee.getPrice();
        }
        return total;
    }
}