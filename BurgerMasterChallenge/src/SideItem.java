public class SideItem {

    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public SideItem() {
        this("smallFries", 7);
    }

    public double getPrice() {
        return price;
    }

    public static SideItem getSideItem(int type) {
        return switch (type) {
            case 1 -> new MediumFries();
            case 2 -> new LargeFries();
            default -> new SideItem();
        };
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

class MediumFries extends SideItem {

    public MediumFries() {
        super("MediumFries", 9);
    }

    @Override
    public String toString() {
        return "MediumFries{} " + super.toString();
    }
}

class LargeFries extends SideItem {

    public LargeFries() {
        super("LargeFries", 11.5);
    }

    @Override
    public String toString() {
        return "LargeFries{} " + super.toString();
    }
}


