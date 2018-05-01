package storageManagerView;


import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class SMView extends JFrame{

    private JTextField tfUserNm = new JTextField(20);
    private JTextField tfPassWd = new JTextField(20);
    private JLabel lUserNm = new JLabel("Username");
    private JLabel lPassWd = new JLabel("Password");
    private JButton bLoginButton = new JButton("Enter");
    

    public SMView(){

    	this.setTitle("Storage Manager Portal");
        JPanel SMPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 200);
        
        SMPanel.setLayout(new GridLayout(5,1));

        SMPanel.add(lUserNm);
        SMPanel.add(tfUserNm);
        SMPanel.add(lPassWd);
        SMPanel.add(tfPassWd);
        SMPanel.add(bLoginButton);
        
        this.add(SMPanel);

    }
    
    public String getUserNm() {
    	
    	return tfUserNm.getText();
    }
    
    public String getPassWd() {
    	
    	return tfPassWd.getText();
    }
    
    public void addLoginListener(ActionListener listenForLogin) {
    	
    	bLoginButton.addActionListener(listenForLogin);
    }
    
    public void displayErrorMessage(String errorMessage) {
    	
    	JOptionPane.showMessageDialog(this, errorMessage);
    }

}