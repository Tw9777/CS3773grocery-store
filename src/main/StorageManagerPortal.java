package main;

import storageManagerModel.SMModel;
import storageManagerView.SMView;
import storageManagerController.SMController;
import storageManagerView.SMView2;

public class StorageManagerPortal {

	public static void main(String[] args) {
		
		// add elements
		SMModel m = new SMModel();
		SMView v = new SMView();
		SMView2 v2 = new SMView2();
		SMController c = new SMController(v, v2, m);
		
		v.setVisible(true);
		
		
		

	}

}
