public class Burger {

    private String type;
    private double price;
    private int toppings;

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
        this.toppings = 0;
    }


    public Burger() {
        this("Hamburger", 0);
        this.price = 6;
    }

    public double getPrice() {
        return price;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public static Burger getBurger(int type) {
        return switch (type) {
            case 1 -> new Cheeseburger();
            case 2 -> new JalapenoBurger();
            case 3 -> new DeluxeBurger();
            default -> new Burger();
        };
    }

    public void addToppings(int toppingType) {
        switch (toppingType) {
            case 1 -> this.price += 2;   //extra cheese
            case 2 -> this.price += 4;   //extra meat
            case 3 -> this.price += 2.75;    //extra bacon
            default -> this.price += 1;  //extra sauce
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}

class Cheeseburger extends Burger {


    public Cheeseburger() {
        super("Cheeseburger", 8);
    }

    @Override
    public String toString() {
        return "Cheeseburger{} " + super.toString();
    }
}

class JalapenoBurger extends Burger {


    public JalapenoBurger() {
        super("JalapenoBurger", 7);
    }

    @Override
    public String toString() {
        return "JalapenoBurger{} " + super.toString();
    }
}

class DeluxeBurger extends Burger {


    public DeluxeBurger() {
        super("DeluxeBurger", 10);
    }

    @Override
    public String toString() {
        return "DeluxeBurger{} " + super.toString();
    }
}

