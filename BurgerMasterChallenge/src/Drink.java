public class Drink {

    private String type;
    private String volume;
    private double price;

    public Drink(String type, double price) {
        this.type = type;
        this.volume = "0.3";
        this.price = price;
    }

    public Drink() {
        this("Water", 5);
    }

    public static Drink getDrink(int type) {
        return switch (type) {
            case 1 -> new Cola();
            case 2 -> new IceTea();
            case 3 -> new Sprite();
            default -> new Drink();
        };
    }

    public void changeSize(String volume) {
        switch (volume) {
            case "0.5" -> this.price += 2.5;
            case "0.7" -> this.price = 5;
            default -> this.price = price;
        }

        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", volume='" + volume + '\'' +
                ", price=" + price +
                '}';
    }
}

class Cola extends Drink {

    public Cola() {
        super("Cola", 7);
    }

    @Override
    public String toString() {
        return "Cola{} " + super.toString();
    }
}

class IceTea extends Drink {


    public IceTea() {
        super("IceTea", 6);
    }

    @Override
    public String toString() {
        return "IceTea{} " + super.toString();
    }
}


class Sprite extends Drink {


    public Sprite() {
        super("Sprite", 6.5);
    }

    @Override
    public String toString() {
        return "Sprite{} " + super.toString();
    }
}



