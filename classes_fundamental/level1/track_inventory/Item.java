package classes_fundamental.level1.track_inventory;

public class Item {
	 private String itemCode;
	    private String itemName;
	    private double price;

	    public Item(String itemCode, String itemName, double price) {
	        this.itemCode = itemCode;
	        this.itemName = itemName;
	        this.price = price;
	    }

	    public void displayDetails() {
	        System.out.println("Item Code: " + itemCode);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price: $" + String.format("%.2f", price));
	    }

	    public double calculateTotalCost(int quantity) {
	        return price * quantity;
	    }
}
