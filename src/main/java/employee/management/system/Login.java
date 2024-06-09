package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

  JTextField tfusername, tfpwd;

    Login (){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Admin Login");
        heading.setBounds(170, 25, 800, 400);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel username = new JLabel("Username");
        username.setBounds(120, 150, 800, 400);
        username.setFont(new Font ("arial", Font.PLAIN, 20));
        username.setForeground(Color.WHITE);
        add(username);

        tfusername = new JTextField();
        tfusername.setBounds(290, 337, 100, 30);
        tfusername.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfusername);

        JLabel pwd = new JLabel("Password");
        pwd.setBounds(120, 212, 800, 400);
        pwd.setFont(new Font ("arial", Font.PLAIN, 20));
        pwd.setForeground(Color.WHITE);
        add(pwd);

        tfpwd = new JTextField();
        tfpwd.setBounds(290, 400, 100, 30);
        tfpwd.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfpwd);

        JButton button = new JButton("Login");
            button.setBounds(270, 600, 80, 30);
            button.setBackground(Color.gray);
            button.setForeground(Color.BLACK);
            button.setBorder(null);
            button.addActionListener(this);
            add(button);

            setSize(600, 800);
            setLocation(750, 180);
            setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
      try {
        String username = tfusername.getText();
        String pwd = tfpwd.getText();

        Conn c = new Conn();

        String query = "Select * from login where username = '" + username + "' and password = '" + pwd + "'";
        ResultSet rs = c.s.executeQuery(query);

        if(rs.next()){
          setVisible(false);
          new Home();
          

        }
        else{
          JOptionPane.showMessageDialog(null, "Invalid username or password");
          //setVisible(false);
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
