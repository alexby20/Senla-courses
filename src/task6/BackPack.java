package task6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackPack {

    private int maxWeight;

    private int currentWeight = 0;

    private int currentCost = 0;

    private List<Item> itemsInBackPack;

    public BackPack(int maxWeight) {
        this.maxWeight = maxWeight;
        itemsInBackPack = new ArrayList<>();
    }

    public void putItems(List<Item> items) {
        items.sort(Collections.reverseOrder());

        for (Item item : items) {
            if (maxWeight - currentWeight > item.weight) {
                putItem(item);
            }
        }
    }

    private void putItem(Item item) {
        itemsInBackPack.add(item);
        currentWeight += item.weight;
        currentCost += item.cost;
    }

    public void info() {
        System.out.println("Cost of backpack " + this.currentCost +
                " Total weight " + this.currentWeight +
                " Maximum weight " + this.maxWeight +
                " Number of items " + itemsInBackPack.size() + "\n" +
                "Items in backpack: " + itemsInBackPack);
    }

}
