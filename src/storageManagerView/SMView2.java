package storageManagerView;

import java.awt.GridLayout;

import javax.swing.*;

public class SMView2 extends JFrame{
	
	private JTextField tfIncrease = new JTextField(6);
	private JTextField tfDecrease = new JTextField(6);
	private JTextField tfItemId = new JTextField(20);
	private JTextField tfItemNm = new JTextField(20);
	private JLabel ltemp = new JLabel(" ");
    private JLabel lItemId = new JLabel("Item ID");
    private JLabel lIncrease = new JLabel("Increase Amount");
    private JLabel lDecrease = new JLabel("Decrease Amount");
    private JLabel lItemNm = new JLabel("Item Name");
    private JButton bEnterButton = new JButton("Enter");
    private JButton bShowAllButton = new JButton("Show All");
    private JLabel lTest = new JLabel("TEST HERE");
    private String []sOptions = {" ","Increase", "Decrease", "Add", "Remove"};
    private JComboBox cbOptions = new JComboBox(sOptions);

	public SMView2(){

    	this.setTitle("Storage Manager Portal");
        JPanel SMPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 160);
        
        SMPanel.setLayout(new GridLayout(2,5));

        SMPanel.add(bShowAllButton);
        SMPanel.add(lItemNm);
        SMPanel.add(lItemId);
        SMPanel.add(lIncrease);
        SMPanel.add(lDecrease);
        SMPanel.add(cbOptions);
        SMPanel.add(tfItemId);
        SMPanel.add(tfItemNm);
        SMPanel.add(tfIncrease);
        SMPanel.add(tfDecrease);
        
        
        this.add(SMPanel);

    }
	
	public int getIncrease() {
		
		return Integer.parseInt(tfIncrease.getText());
	}
	
	public int getDecrease() {
		
		return Integer.parseInt(tfDecrease.getText());
	}

	public String getItemId() {
		
		return tfItemId.getText();
	}
	
	public String getItemNm() {
		
		return tfItemNm.getText();
	}
	
}
