package login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class login {

    private JFrame frame;
    private JTextField username;
    private JPasswordField password;
    private JFrame LoginSystem;
    
    public static void main(String[] args){
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    login window = new login();
		window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
	
    }
    
   public login() {
       initialize();
   }

private void initialize() {
   
    frame = new JFrame();
    frame.setBounds(300, 300, 500, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel setLabel = new JLabel("Login");
    setLabel.setHorizontalAlignment(SwingConstants.CENTER);
    setLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
    setLabel.setBounds(30, 10, 480, 60);
    frame.getContentPane().add(setLabel);


JLabel usernmlabl = new JLabel("Username");
usernmlabl.setFont(new Font("Tahoma", Font.BOLD, 30));
usernmlabl.setBounds(35, 50, 160, 40);
frame.getContentPane().add(usernmlabl);

JLabel passwdlbl = new JLabel("Password");
passwdlbl.setFont(new Font("Tahoma", Font.BOLD, 30));
passwdlbl.setBounds(40, 120, 160, 40);
frame.getContentPane().add(passwdlbl);


username = new JTextField();
username.setFont(new Font("Tahoma", Font.BOLD, 30));
username.setBounds(195, 55, 200, 22);
frame.getContentPane().add(username);
username.setColumns(10);
    

password = new JPasswordField();
password.setFont(new Font("Tahoma", Font.BOLD, 30));
password.setBounds(195, 140, 200, 22);
frame.getContentPane().add(password);

JButton loginbutton = new JButton("Login");
loginbutton.setBounds(25, 210, 80, 22);
frame.getContentPane().add(loginbutton);
loginbutton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
	
	String txtpassword = password.getText();
	String txtusername = username.getText();
	
	
	/*if (txtpassword.contains( ) && txtusename.contains()){
	//call program to enter
	    //info.main(null)
	}
	
	else {
	    JOptionPane.showMessageDialog(null, "Invalid Login cridentials", "Login invalid", JOptionPane.ERROR_MESSAGE);
	    password.setText(null);
	    username.setText(null);
	}
	  */  
	    
    }
});


JButton Reset = new JButton("Reset");
Reset.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
    username.setText(null);
    password.setText(null);
    
    
    }
});

Reset.setBounds(170, 210, 90, 22);
frame.getContentPane().add(Reset);

JButton Exitit = new JButton("Exit");
Exitit.setFont(new Font("Tahoma", Font.BOLD, 30));
Exitit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {

	LoginSystem = new JFrame("Exit");
	if (JOptionPane.showConfirmDialog(LoginSystem, "Confirm if exit is wanted", "Login Systems",
		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
	    System.exit(0);
	}
    }
});

}
}
