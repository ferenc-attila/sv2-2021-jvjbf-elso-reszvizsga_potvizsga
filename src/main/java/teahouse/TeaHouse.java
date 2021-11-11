package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeaHouse {

    private final String name;
    private List<Tea> teas = new ArrayList<>(Arrays.asList(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA), new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA)));
    private LocalTime openTime;
    private LocalTime closeTime;

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void addTea (Tea tea) {
        teas.add(tea);
    }

    public double getAveragePrice () {
        double sumOfPrices = 0;
        for (Tea tea : teas) {
            sumOfPrices += tea.getPrice();
        }
        return sumOfPrices / teas.size();
    }

    public void setActionPrices (Sort sort, int percent) {
        for (Tea tea : teas) {
            if (sort.equals(tea.getSort())) {
                tea.setPrice(actionPrice(tea, percent));
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    private int actionPrice(Tea tea, int percent) {
        return (int) (tea.getPrice() * (100d - percent) / 100d);
    }
}
