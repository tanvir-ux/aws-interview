import java.util.List;
import java.util.ArrayList;

public class CDType {
    private List<Packing> items = new ArrayList<Packing>();

    public void addItems(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for(Packing packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.println("CD Name: " + packing.pack());
            System.out.println("Price: "  + packing.price());
        }
    }
}