package main;

import storageManagerModel.SMModel;
import storageManagerView.SMView;
import storageManagerController.SMController;

public class StorageManagerPortal {

	public static void main(String[] args) {
		
		// add elements
		SMModel m = new SMModel();
		SMView v = new SMView();
		SMController c = new SMController(v,m);
		
		v.setVisible(true);
		

	}

}
