import java.text.SimpleDateFormat;
import java.util.Date;

public class Check {
    int orderNumber;
    String guestName;

    public Check(int orderNumber, String guestName) {
        this.orderNumber = orderNumber;
        this.guestName = guestName;
    }

    public void printCheck(){
        System.out.println("ORDER # " + orderNumber + '\n' + "Guest's name: " + guestName);
        System.out.println(getCurrentData());
        System.out.println();
    }

    public String getCurrentData(){
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return (formatter.format(date));
    }

    //public double totalOrderSum();

    @Override
    public String toString() {
        return "ORDER # " + orderNumber + '\n' + "Guest's name: " + guestName + '\n';
    }
}
