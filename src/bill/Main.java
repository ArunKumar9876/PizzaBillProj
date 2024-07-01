package bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Welcome to pizzaMania------------");
        System.out.println("Which pizza do you want: (1. Veg pizza 2. Non-veg pizza 3. Deluxe veg pizza 4. Deluxe non-veg pizza 5. Special pizza)");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int quantity;

        switch (ch) {
            case 1:
                System.out.println("Enter quantity:");
                quantity = sc.nextInt();
                orderPizzas(true, quantity);
                break;
            case 2:
                System.out.println("Enter quantity:");
                quantity = sc.nextInt();
                orderPizzas(false, quantity);
                break;
            case 3:
                System.out.println("Enter quantity:");
                quantity = sc.nextInt();
                orderDeluxPizzas(true, quantity);
                break;
            case 4:
                System.out.println("Enter quantity:");
                quantity = sc.nextInt();
                orderDeluxPizzas(false, quantity);
                break;
            case 5:
                System.out.println("Enter quantity:");
                quantity = sc.nextInt();
                orderSpecialPizzas(quantity);
                break;
            default:
                System.out.println("Sorry, please enter a valid choice.");
        }
        sc.close();
    }

    private static void orderPizzas(boolean isVeg, int quantity) {
        Pizza pizza = new Pizza(isVeg);
        for (int i = 0; i < quantity; i++) {
            pizza.addExtraToppings();
            pizza.addExtraCheese();
            pizza.takeAway();
        }
        pizza.getBill(quantity);
    }

    private static void orderDeluxPizzas(boolean isVeg, int quantity) {
        DeluxPizza deluxPizza = new DeluxPizza(isVeg, 100, 150); // Adjust extra cheese and extra toppings prices as needed
        for (int i = 0; i < quantity; i++) {
            deluxPizza.addExtraToppings();
            deluxPizza.addExtraCheese();
            deluxPizza.takeAway();
        }
        deluxPizza.getBill(quantity);
    }

    private static void orderSpecialPizzas(int quantity) {
        SpecialPizza specialPizza = new SpecialPizza(true, 50); // Adjust topping price as needed
        for (int i = 0; i < quantity; i++) {
            specialPizza.addToppings();
            specialPizza.addExtraCheese();
            specialPizza.takeAway();
        }
        specialPizza.getBill(quantity);
    }

}
