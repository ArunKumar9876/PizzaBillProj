package bill;

public class SpecialPizza extends Pizza {
    
    private int toppingPrice;

    public SpecialPizza(boolean veg, int toppingPrice) {
        super(veg);
        this.toppingPrice = toppingPrice;
    }

    public void addToppings() {
        System.out.println("Add your favorite toppings (each topping costs " + toppingPrice + "):");
        // For simplicity, let's assume the user enters the number of toppings
        System.out.println("Enter the number of toppings:");
        int numToppings = in.nextInt();
        // Add the total cost of toppings to the price
        this.price += numToppings * toppingPrice;
    }
}
