package main;

import storageManagerModel.SMModel;
import storageManagerView.SMView;

public class StorageManagerPortal {

	public static void main(String[] args) {
		
		SMModel m = new SMModel();
		SMView s = new SMView();

		if (m.logIn("User", "12345")) {
			System.out.println("Login Successful!!");
			s.setVisible(true);
		}
		else
			System.out.println("Login Failed");

	}

}
