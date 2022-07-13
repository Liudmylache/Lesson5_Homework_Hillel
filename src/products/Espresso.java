package products;

public class Espresso implements Coffee{

    private final double price = 4;
    private final int coffeeBeans = 15;
    private final int syrup = 0;
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


    public Boolean isSugar(){
        return sugar;
    }

    public String printSugar(){
        if (isSugar()){
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
                printSugar() + '\n'+
                "price:  $" + price + '\n' + '\n';
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    @Override
    public int getSyrup() {
        return this.syrup;
    }
}
