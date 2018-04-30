package storageManagerView;


import javax.swing.*;
import java.awt.event.ActionListener;;

public class SMView extends JFrame{

    private JTextField tfUserNm = new JTextField(20);
    private JTextField tfPassWd = new JTextField(20);

    // CONSTRUCTER
    SMView(){

        JPanel finalPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        finalPanel.add(tfUserNm);
        finalPanel.add(tfPassWd);

    }


}