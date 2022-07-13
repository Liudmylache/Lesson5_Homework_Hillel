package products;

public class Cappuccino implements Coffee{
    private final double price = 5.75;
    private final double coffeeBeans = 15;
    private final double syrup = 0;
    public boolean sugar;
    public String milk;
    //milk = 75ml


    public Cappuccino(boolean sugar, String milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public Cappuccino(boolean sugar) {
        this.sugar = sugar;
        this.milk = null;
    }


    /*
    recipe:
    coffeeBeans - 15g
    milk - 75ml
    water - 75ml
    serving - 160ml
     */

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
        return "1x CAPPUCCINO" + '\n' +
                "with " + isMilk() + " milk" + '\n'+
                isSugar() + '\n'+
                "price:  $" + price + '\n' + '\n';
    }

    @Override
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
