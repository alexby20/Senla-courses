package task6;



public class Item implements Comparable<Item> {

    int cost;

    int weight;

    public Item(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getWeightCost() {
        return (double) cost / weight;
    }

    @Override
    public int compareTo(Item item) {
        double thisWeightCost = this.getWeightCost();
        double itemWeightCost = item.getWeightCost();

        if (thisWeightCost > itemWeightCost) {
            return 1;
        } else if (thisWeightCost == itemWeightCost) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", cw=" + getWeightCost() +
                '}';
    }

}


