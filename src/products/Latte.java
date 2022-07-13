package products;

public class Latte implements Coffee{
    private final double price = 6;
    private final double coffeeBeans = 16;
    private final double syrup = 0;
    public boolean sugar;
    public String milk;

    public Latte(boolean sugar, String milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public Latte(boolean sugar) {
        this.sugar = sugar;
    }

     /*
    recipe:
    espresso- 50ml
    milk - 100ml
    water - 0
    syrup - 5ml
    serving - 240ml
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
        return "1x LATTE" + '\n' +
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
