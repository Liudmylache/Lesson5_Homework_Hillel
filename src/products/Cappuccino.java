package products;

public class Cappuccino implements Coffee{
    private final double price = 5.75;
    private final int coffeeBeans = 15;
    private final int syrup = 0;
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
        return "1x CAPPUCCINO" + '\n' +
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
