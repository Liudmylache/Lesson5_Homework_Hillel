import products.Coffee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Check {
    int orderNumber;
    String guestName;

    public Check(int orderNumber, String guestName) {
        this.orderNumber = orderNumber;
        this.guestName = guestName;
    }

    public void printCheckTop(){
        System.out.println("ORDER # " + orderNumber + '\n' + "Guest's name: " + guestName);
        System.out.println(getCurrentData());
        System.out.println();
    }
    public void printCheckButton(List<Coffee> itemsInOrder){
        System.out.println( "TOTAL: $"+ getTotalByOrder(itemsInOrder) + '\n');
        System.out.println("Thank you for visiting our caffe!");
    }

    public String getCurrentData(){
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return (formatter.format(date));
    }

    public static double getTotalByOrder(List<Coffee> itemsInOrder) {
        double total = 0;

        for(Coffee coffee : itemsInOrder) {
            total += coffee.getPrice();
        }
        return total;
    }


    @Override
    public String toString() {
        return "ORDER # " + orderNumber + '\n' + "Guest's name: " + guestName + '\n';
    }
}
