package storageManagerController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import storageManagerModel.SMModel;
import storageManagerView.SMView;


public class SMController {
	
	private SMView theView;
	private SMModel theModel;
	
	public SMController (SMView theView, SMModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		
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
				}
				else{
					System.out.println("Login Failed");
				}
				
			}
			catch(NullPointerException ex){
				System.out.println(ex);
				theView.displayErrorMessage("Cannot have an empty field.");
			}
		}
	}
	

}
