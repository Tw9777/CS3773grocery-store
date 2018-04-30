package main;

import storageManagerModel.SMModel;

public class StorageManagerPortal {

	public static void main(String[] args) {
		
		SMModel m = new SMModel();

		if (m.logIn("User", "12345"))
			System.out.println("Login Successful!!");
		else
			System.out.println("Login Failed");

	}

}
