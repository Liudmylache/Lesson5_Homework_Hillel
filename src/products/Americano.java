package products;

public class Americano implements Coffee{
    private final double price = 4.75;
    private final double coffeeBeans = 16;
    private final double syrup = 0;
    private final boolean sugar;
    private final String milk;

    public Americano(boolean sugar, String milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public Americano(boolean sugar) {
        this.sugar = sugar;
        this.milk = null;
    }

    public double showCoffeeBeansUsed(){
        return coffeeBeans;
    }

    public String isSugar(){
        if (true == sugar){
            return "with sugar";
        } return "with no sugar";
    }

    public String isMilk(){
        if (milk == null){
            return "no";
        } return milk;
    }

    @Override
    public String toString() {
        return "1x AMERICANO" + '\n' +
                "with " + isMilk() + " milk" + '\n'+
                isSugar() + '\n'+
                "price:  $" + price + '\n' + '\n';
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double getCoffeeBeans() {
        return this.coffeeBeans;
    }

    @Override
    public double getSyrup() {
        return this.syrup;
    }
}
