package storageManagerView;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SMView2 extends JFrame{
	
	private JTextField tfIncrease = new JTextField(6);
	private JTextField tfDecrease = new JTextField(6);
	private JTextField tfItemId = new JTextField(20);
	private JTextField tfItemNm = new JTextField(20);
	private JTextField tfItemCt = new JTextField(20);
	private JTextField tfItemPr = new JTextField(20);
	private JLabel ltemp = new JLabel(" ");
    private JLabel lItemId = new JLabel("Item ID");
    private JLabel lItemCt = new JLabel("Item Count");
    private JLabel lItemPr = new JLabel("Item Price");
    private JLabel lIncrease = new JLabel("Increase Amount");
    private JLabel lDecrease = new JLabel("Decrease Amount");
    private JLabel lItemNm = new JLabel("Item Name");
    private JButton bEnterButton = new JButton("Enter");
    private JButton bShowAllButton = new JButton("Show All");
    private String []sOptions = {" ","Increase", "Decrease", "Add", "Remove"};
    private JComboBox cbOptions = new JComboBox(sOptions);
    
    private JPanel SMPanel = new JPanel();

	public SMView2(){

    	this.setTitle("Storage Manager Portal");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 160);
        
        SMPanel.setLayout(new GridLayout(3,7));

        SMPanel.add(bEnterButton);
        SMPanel.add(lItemNm);
        SMPanel.add(lItemId);
        SMPanel.add(lIncrease);
        SMPanel.add(lDecrease);
        SMPanel.add(lItemCt);
        SMPanel.add(lItemPr);

        SMPanel.add(cbOptions);
        //changed
        SMPanel.add(tfItemNm);
        SMPanel.add(tfItemId);
        
        SMPanel.add(tfIncrease);
        SMPanel.add(tfDecrease);
        SMPanel.add(tfItemCt);
        SMPanel.add(tfItemPr);
        
        SMPanel.add(new JLabel(" "));
        SMPanel.add(new JLabel(" "));
        SMPanel.add(new JLabel(" "));
        SMPanel.add(bShowAllButton);
        SMPanel.add(new JLabel(" "));
        SMPanel.add(new JLabel(" "));
        SMPanel.add(new JLabel(" "));
        
        
        this.add(SMPanel);
        

    }
	
	public String getOption() {
		
		return sOptions[cbOptions.getSelectedIndex()];
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
	
	public int getItemCt() {
		
		return Integer.parseInt(tfItemCt.getText());
	}

	public double getItemPr() {
		
		return Double.parseDouble(tfItemPr.getText());
	}
	
    public void addEnterListener(ActionListener listenForEnter) {
    	
    	bEnterButton.addActionListener(listenForEnter);
    }
    
    public void addShowAllListener(ActionListener listenForShowAll) {
    	
    	bShowAllButton.addActionListener(listenForShowAll);
    }
    
    public void displayErrorMessage(String errorMessage) {
    	
    	JOptionPane.showMessageDialog(this, errorMessage);
    }
	
}
