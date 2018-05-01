package storageManagerModel;

public class Item {
	private String itemName;
	private String itemID;
	private int itemAmt;
	private double itemPrice;
	
	public Item() {

		this.itemName = "Item";
		this.itemID = "12345";
		this.itemAmt = 0;
		this.itemPrice = 0.00;
		
	}
	void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	void setItemID(String itemID) {
		this.itemID = itemID;
	}
	
	void setItemAmt(int itemAmt) {
		this.itemAmt = itemAmt;
	}
	
	void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	String getItemName() {
		return itemName;
	}
	
	String getItemID() {
		return itemID;
	}
	
	int getItemAmt() {
		return itemAmt;
	}
	
	Double getItemPrice() {
		return itemPrice;
	}
	

}
