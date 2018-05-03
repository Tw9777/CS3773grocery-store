package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import storageManagerModel.SMModel;

public class testCases {

	SMModel m = new SMModel();
	
	@Test
	public void testViewInventory()
	{
		String result = m.viewInventory();
		assertEquals("Apple 0001 5 1.00\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\n",result);
	}

	public void testAddItem()
	{
		m.addItem("Orange", "0006", 5, 1.00);
		assertEquals("Apple 0001 5 1.00\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\nOrange 0006 5 1.00",m.viewInventory());
	}
	
	public void testRemoveItem()
	{
		m.removeItem("0006");
		assertEquals("Apple 0001 5 1.00\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\n",m.viewInventory());
	}
	
	public void testIncInv()
	{
		m.incInv("0001", 5);
		assertEquals("Apple 0001 10 1.00\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\n",m.viewInventory());
	}
	
	public void testDecInv()
	{
		m.decInv("0001", 5);
		assertEquals("Apple 0001 5 1.00\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\n",m.viewInventory());
	}
	
	public void testUpdatePrice()
	{
		m.updatePrice("0001", 1.25);
		assertEquals("Apple 0001 5 1.25\nBanana 0002 3 1.50\nKiwi 0003 7 2.00\nMelon 0004 6 1.75\nFig 0005 1 0.50\n",m.viewInventory());
	}
}
