package task6;


	import java.util.ArrayList;
	import java.util.List;

	public class Main {

	    public static void main(String[] args) {
	        BackPack backPack = new BackPack(25);
	        List<Item> items = getItems();

	        backPack.putItems(items);
	        backPack.info();
	    }

	    private static List<Item> getItems() {
	        Item i0 = new Item(2, 15);
	        Item i1 = new Item(10, 4);
	        Item i2 = new Item(15, 6);
	        Item i3 = new Item(18, 3);
	        Item i4 = new Item(5, 2);

	        Item i5 = new Item(1, 5);
	        Item i6 = new Item(9, 3);
	        Item i7 = new Item(7, 2);
	        Item i8 = new Item(27, 11);
	        Item i9 = new Item(23, 8);

	        Item i10 = new Item(13, 7);
	        Item i11 = new Item(33, 25);
	        Item i12 = new Item(21, 14);
	        Item i13 = new Item(2, 1);
	        Item i14 = new Item(50, 25);
	        Item i15 = new Item(1, 1);

	        List<Item> items = new ArrayList<>();

	        items.add(i0);
	        items.add(i1);
	        items.add(i2);
	        items.add(i3);
	        items.add(i4);

	        items.add(i5);
	        items.add(i6);
	        items.add(i7);
	        items.add(i8);
	        items.add(i9);

	        items.add(i10);
	        items.add(i11);
	        items.add(i12);
	        items.add(i13);
	        items.add(i14);
	        items.add(i15);

	        return items;
	    }

	}


