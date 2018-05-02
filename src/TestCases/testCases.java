package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import storageManagerModel.SMModel;

public class testCases {

	SMModel m = new SMModel();
	
	@Test
	public void testViewInventory ()
	{
		String result = m.viewInventory();
		assertEquals("Apple 0001 5 1.00\nBanana 0002 3 1.50\n",result);
	}
	
}
