import java.util.Scanner;

public class Meal {

    public void makeOrderClassic() {

        Scanner s = new Scanner(System.in);
        Burger hamburger = new Burger();
        Drink water = new Drink();
        SideItem smallFries = new SideItem();
        System.out.println("-".repeat(50));
        System.out.println(hamburger);
        System.out.println(water);
        System.out.println(smallFries);
        System.out.println("-".repeat(50));
    }

    public Burger makeOrderBurger() {

        Scanner s = new Scanner(System.in);
        System.out.printf("Perfect! Let's start with the burger.%nYou can add max 3 toppings to Cheeseburger,%n" +
                "JalapenoBurger and Hamburger, and 2 (for free) to Deluxe Burger");
        System.out.println("Type [1] for CheeseBurger (8zl), [2] for JalapenoBurger (7zl)," +
                "[3] for Deluxe Burger (10zl) or any other number for Hamburger (6zl): ");
        return Burger.getBurger(Integer.parseInt(s.nextLine()));
    }

    public Drink makeOrderDrink() {
        Scanner s = new Scanner(System.in);
        System.out.println("Perfect! All prices are for 0.3l. Type [1] for Coca Cola (7zl), [2] for IceTea (6zl), " +
                "[3] for Sprite (6.5zl) or any other number for Water (5zl): ");
        return Drink.getDrink(Integer.parseInt(s.nextLine()));
    }

    public SideItem makeOrderSideItem() {
        Scanner s = new Scanner(System.in);
        System.out.print("Perfect! Type [1] for Medium Fries (9zl), [2] for Large Fries (11.5zl) or " +
                "any other number for Small Fries (7zl): ");
        return SideItem.getSideItem(Integer.parseInt(s.nextLine()));
    }

}





