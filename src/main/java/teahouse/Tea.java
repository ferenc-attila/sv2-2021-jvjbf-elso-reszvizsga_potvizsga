package teahouse;

public class Tea {

    private final String name;
    private int price;
    private final Sort sort;

    public Tea(String name, int price, Sort sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + sort.getAdditionalInfo() +  " (" + price + ")";
    }



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Sort getSort() {
        return sort;
    }
}
