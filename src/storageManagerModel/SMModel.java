package storageManagerModel;

import java.util.*;



public class SMModel {
	
	private String userNm;
	private String passWd;
	private ArrayList <Item> stock = new ArrayList <Item>(); 
	
	
	public SMModel() {

		this.userNm = "admin";
		this.passWd = "12345";
		Item temp = new Item();
		temp.setItemName("Apple");
		temp.setItemID("0001");
		temp.setItemAmt(5);
		temp.setItemPrice(1.00);
		stock.add(temp);
		Item temp2 = new Item();
		temp2.setItemName("Banana");
		temp2.setItemID("0002");
		temp2.setItemAmt(3);
		temp2.setItemPrice(1.50);
		stock.add(temp2);
	}
	
	public SMModel(String userNm, String passWd) {

		this.userNm = userNm;
		this.passWd = passWd;
	}
		
	public boolean logIn(String userNm, String passWd) {
		
		return (userNm.equals(this.userNm)) && (passWd.equals(this.passWd));
	}
	
	//Create new item instance and add it to the Array List
	public void addItem(String itemName, String itemID, int itemAmt, double itemPrice) {
		
		Item temp = new Item();
		temp.setItemName(itemName);
		temp.setItemID(itemID);
		temp.setItemAmt(itemAmt);
		temp.setItemPrice(itemPrice);
		stock.add(temp);
	
	}
	
	//Increase item Inventory using itemId
	public void incInv (String itemID, int itemAmt)
	{
		for (int i=0; i < stock.size(); i++)
		{	
			if (itemID.equals(stock.get(i).getItemID()))
			{
				stock.get(i).setItemAmt((stock.get(i).getItemAmt() + itemAmt));
			}
	
		}
	}
	
	//Decrease item Inventory using itemId
	public void decInv (String itemID, int itemAmt)
	{
		for (int i=0; i < stock.size(); i++)
		{	
			if (itemID.equals(stock.get(i).getItemID()))
			{
				stock.get(i).setItemAmt((stock.get(i).getItemAmt() - itemAmt));
				if (stock.get(i).getItemAmt() < 0)
				{
					stock.get(i).setItemAmt(0);
				}
			}
		}
	}
	
	//Remove item using the item ID
	public void removeItem(String itemID)
	{
		for(int i =0; i <stock.size(); i++)
		{
			if (itemID.equals(stock.get(i).getItemID()))
			{
				stock.remove(i);
			}
		}
	}

	//Update an items Price
	public void updatePrice(String itemID,double itemPrice)
	{
		for(int i =0; i <stock.size(); i++)
		{
			if (itemID.equals(stock.get(i).getItemID()))
			{
				stock.get(i).setItemPrice(itemPrice);
			}
		}
	}

	//View the inventory
	public String viewInventory ()
	{
		String inventory = "";
		for(int i =0; i <stock.size(); i++)
		{
			String result = String.format("%.2f", stock.get(i).getItemPrice());
			inventory = inventory + stock.get(i).getItemName() + " " + stock.get(i).getItemID() + " "
					              + stock.get(i).getItemAmt() + " " + result + "\n";
		}
		return inventory;
	}
	
}
