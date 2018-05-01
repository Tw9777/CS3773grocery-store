package main;

import storageManagerModel.SMModel;
import storageManagerView.SMView;
import storageManagerController.SMController;

public class StorageManagerPortal {

	public static void main(String[] args) {
		
		SMModel m = new SMModel();
		SMView v = new SMView();
		SMController c = new SMController(v,m);

		if (m.logIn("User", "12345")) {
			System.out.println("Login Successful!!");
			v.setVisible(true);
		}
		else
			System.out.println("Login Failed");

	}

}
