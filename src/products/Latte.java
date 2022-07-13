package products;

public class Latte implements Coffee{
    private final double price = 6;
    private final int coffeeBeans = 15;
    private final int syrup = 20;
    public boolean sugar;
    public String milk;

    public Latte(boolean sugar, String milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public Latte(boolean sugar) {
        this.sugar = sugar;
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
        return "1x LATTE" + '\n' +
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
