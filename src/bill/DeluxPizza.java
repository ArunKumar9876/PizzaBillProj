package bill;

public class DeluxPizza extends Pizza {
	
	private int extraCheesePrice;
	private int extraToppingsPrice;
	
	public DeluxPizza(boolean veg, int extraCheesePrice, int extraToppingsPrice) {
		super(veg);
		this.extraCheesePrice = extraCheesePrice;
		this.extraToppingsPrice = extraToppingsPrice;
	}
	
	public void addExtraCheese() {
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		this.price += extraToppingsPrice;
	}
}
