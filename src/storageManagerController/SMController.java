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
	

}
