package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;

    Home(){

        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(300, 70, 800, 400);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);


        view = new JButton("View Employees");
        view.setBounds(350, 400, 200, 30);
        view.setBackground(Color.gray);
        view.setForeground(Color.BLACK);
        view.setBorder(null);
        view.addActionListener(this);
        add(view);

        add = new JButton("Add Employees");
        add.setBounds(650, 400, 200, 30);
        add.setBackground(Color.gray);
        add.setForeground(Color.BLACK);
        add.setBorder(null);
        add.addActionListener(this);
        add(add);

        update = new JButton("Update Employees");
        update.setBounds(350, 550, 200, 30);
        update.setBackground(Color.gray);
        update.setForeground(Color.BLACK);
        update.setBorder(null);
        update.addActionListener(this);
        add(update);

        remove = new JButton("Remove Employees");
        remove.setBounds(650, 550, 200, 30);
        remove.setBackground(Color.gray);
        remove.setForeground(Color.BLACK);
        remove.setBorder(null);
        remove.addActionListener(this);
        add(remove);

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Home();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==view){
            setVisible(false);
            new Viewemployee();
        }
        else if(ae.getSource()==add){
            setVisible(false);
            new Addemployee();
        }
        else if(ae.getSource()==update){
            setVisible(false);
            new Viewemployee();
        }
        else{
            setVisible(false);
            new Removeemployee();
        }
    }
}
