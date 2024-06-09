package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame implements ActionListener{

    Splash(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(300, 100, 800, 400);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);

        

            JButton button = new JButton("NEXT");
            button.setBounds(530, 400, 80, 30);
            button.setBackground(Color.gray);
            button.setForeground(Color.BLACK);
            button.setBorder(null);
            button.addActionListener(this);
            add(button);

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Splash();
    }
   

    
}
