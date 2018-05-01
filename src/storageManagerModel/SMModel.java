package storageManagerModel;
import java.util.*;


public class SMModel {
	
	private String userNm;
	private String passWd;
	private ArrayList <Item> stock = new ArrayList <Item>(); 
	
	
	public SMModel() {

		this.userNm = "User";
		this.passWd = "12345";
	}
	
	public SMModel(String userNm, String passWd) {

		this.userNm = userNm;
		this.passWd = passWd;
	}
		
	public boolean logIn(String userNm, String passWd) {
		
		return (userNm == this.userNm) && (passWd == this.passWd);
	}
	
	//Create new item instance and add it to the Array List
	public void addItem(String itemName, String itemID, int itemAmt, Double itemPrice) {
		
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
			if (itemID ==  stock.get(i).getItemID())
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
			if (itemID ==  stock.get(i).getItemID())
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
			if (itemID == stock.get(i).getItemID())
			{
				stock.remove(i);
			}
		}
	}




}
