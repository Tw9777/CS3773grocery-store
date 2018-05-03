package storageManagerController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import storageManagerModel.SMModel;
import storageManagerView.SMView;
import storageManagerView.SMView2;


public class SMController {
	
	private SMView theView;
	private SMView2 theView2;
	private SMModel theModel;
	
	public SMController (SMView theView, SMView2 theView2, SMModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		this.theView2 = theView2;
		
		this.theView.addLoginListener(new SMListener());
		this.theView2.addEnterListener(new SMListener2());
		this.theView2.addShowAllListener(new SMListener3());
	
	}
	
	class SMListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String userName, password;
			try{
				userName = theView.getUserNm();
				password = theView.getPassWd();
				
				if (theModel.logIn(userName, password)){
					System.out.println("Login Successful");
					JOptionPane.showMessageDialog(null, "Login Successful");
					theView.setVisible(false);
					theView2.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
				
			}
			catch(NullPointerException ex){
				System.out.println(ex);
				theView.displayErrorMessage("Cannot have an empty field.");
			}
		}
	}
	
	class SMListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				if(theView2.getOption().equals("Increase")){
					String itemID = theView2.getItemId();
					int itemAmt = theView2.getIncrease();
					
					theModel.incInv(itemID, itemAmt);
				}
				else if (theView2.getOption().equals("Decrease")){
					String itemID = theView2.getItemId();
					int itemAmt = theView2.getDecrease();
					
					theModel.decInv(itemID, itemAmt);
				}
				else if (theView2.getOption().equals("Add")){
					String itemName = theView2.getItemNm();
					String itemID = theView2.getItemId();
					int itemAmt = theView2.getItemCt();
					double itemPrice = theView2.getItemPr();
					
					theModel.addItem(itemName, itemID, itemAmt, itemPrice);
				}
				else if (theView2.getOption().equals("Remove")){
					//public void removeItem(String itemID)
					String itemID = theView2.getItemId();
					
					theModel.removeItem(itemID);
				}
				else{
					JOptionPane.showMessageDialog(null, "Please select an option.");
				}
			}
			catch(NullPointerException ex){
				System.out.println(ex);
				theView2.displayErrorMessage("Cannot have an empty field.");
			}
		}
	}
	
	class SMListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				JOptionPane.showMessageDialog(null,"Item/ID/Amount/Price\n" + theModel.viewInventory(), "Inventory",JOptionPane.INFORMATION_MESSAGE );
			}
			catch(NullPointerException ex){
				theView2.displayErrorMessage("Empty field.");
			}
		}
	}

}
