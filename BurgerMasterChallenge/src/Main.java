import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String welcome = """
                 ____  _ _ _ _       ____                           \s
                | __ )(_) | ( )___  | __ ) _   _ _ __ __ _  ___ _ __\s
                |  _ \\| | | |// __| |  _ \\| | | | '__/ _` |/ _ \\ '__|
                | |_) | | | | \\__ \\ | |_) | |_| | | | (_| |  __/ |  \s
                |____/|_|_|_| |___/ |____/ \\__,_|_|  \\__, |\\___|_|  \s
                                                     |___/          \s
                
                """;
        System.out.print(welcome);
        order();
    }

    public static void order() {

        Meal meal = new Meal();
        double totalCost = 0;
        System.out.println("Welcome to our BurgerHouse, what's on Your mind today?");
        System.out.print("Do You want to order our classic set (Hamburger, small Water (0.3l) and Small Fries) for" +
                " 18zl? " +
                "Type [y/n]: ");
        Scanner s = new Scanner(System.in);
        if ("y".contains(s.nextLine().toLowerCase())) {
            totalCost = 18;
            meal.makeOrderClassic();
        } else {
            System.out.print("Do You want to eat a burger? Type [y/n]: ");
            if ("Yy".contains(s.nextLine())) {
                Burger currentBurger = meal.makeOrderBurger();
                System.out.print("Do You want to add any toppings? Type [y/n]: ");
                if ("Yy".contains(s.nextLine())) {
                    System.out.print("How many toppings do You want to add? Type 1,2 or 3 (for not Deluxe Burger): ");
                    int k = Integer.parseInt(s.nextLine());

                    if (currentBurger.getClass().getSimpleName().equals("DeluxeBurger")) {
                        if (k > 2) System.out.println("You can add max 2 toppings for that burger.");
                        k = Math.min(k, 2);
                    } else {
                        if (k > 3) System.out.println("You can add max 2 toppings for that burger.");
                        k = Math.min(k, 3);
                    }
                    currentBurger.setToppings(k);
                    while (k != 0) {
                        System.out.printf("Type: %n" +
                                "[1] for Extra cheese - 2zl%n" +
                                "[2] for Extra meat - 4zl%n" +
                                "[3] for Extra bacon - 2.75zl%n" +
                                "or any other number for Extra Sauce - 1zl: ");
                        currentBurger.addToppings(Integer.parseInt(s.nextLine()));
                        k--;
                    }
                }
                totalCost += currentBurger.getPrice();
                System.out.printf("Great! Your current total cost is: %.2f zl.%n", totalCost);
                System.out.println("-".repeat(25));
                System.out.println(currentBurger);
                System.out.println("-".repeat(25));
            }
            System.out.println("Okay, so next step!");


            System.out.print("Do You want anything to drink? Type [y/n]: ");
            if ("Yy".contains(s.nextLine())) {
                Drink currentDrink = meal.makeOrderDrink();

                System.out.print("Do You want to change volume of a drink? Type [y/n]: ");
                if ("Yy".contains(s.nextLine())) {
                    System.out.print("Type '0.5' for 0.5l (extra 2.5zl), '0.7' for 0.7l (extra 5zl) or" +
                            "any other character if You want to stay with 0.3l drink: ");
                    currentDrink.changeSize(s.nextLine());
                }
                totalCost += currentDrink.getPrice();
                System.out.printf("Great! Your current total cost is: %.2f zl.%n", totalCost);
                System.out.println("-".repeat(25));
                System.out.println(currentDrink);
                System.out.println("-".repeat(25));
            }

            System.out.println("Okay, so next step!");


            System.out.print("Do You want to add any SideItem? Type[y/n]: ");
            if ("Yy".contains(s.nextLine())) {
                SideItem currentSideItem = meal.makeOrderSideItem();
                totalCost += currentSideItem.getPrice();
                System.out.printf("Great! Your current total cost is: %.2f zl.%n", totalCost);
                System.out.println("-".repeat(25));
                System.out.println(currentSideItem);
                System.out.println("-".repeat(25));
            }

        }
        if (totalCost != 0.0) {
            System.out.printf("Your order will be prepared in a few minutes. You can pay Your total cost: " +
                    "%.2f zl at the paying station nearby. Thank You very much and have a great Meal%n", totalCost);
            System.out.printf("Your receipt for exact items is above.%n%n%n%n");
        }

        System.out.print("Do You want to make another order? Type [y/n]: ");
        if ("Yy".contains(s.nextLine())) {
            order();
        } else {
            System.out.println("Goodbye and see You next time");
        }

    }


}
