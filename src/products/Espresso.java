package products;

public class Espresso implements Coffee{

    private final double price = 4;
    private final double coffeeBeans = 15;
    private final double syrup = 0;
    private final boolean sugar;
    private final String milk;
    //milk = 0


    public Espresso(boolean sugar, String milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public Espresso(boolean sugar){
        this.sugar = sugar;
        this.milk = null;
    }

    /*
    recipe:
    coffeeBeans - 0
    milk - 0
    water - 30ml
    serving - 50ml
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
        return "1x ESPRESSO" + '\n' +
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
