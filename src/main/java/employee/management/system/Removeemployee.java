package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Removeemployee extends JFrame implements ActionListener{

    Choice cempid;
    JLabel lblname, lblphone, lblemail;
    JButton deletebutton, backbutton;
    Removeemployee(){   

        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Remove Employees");
        heading.setBounds(410, 0, 800, 200);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(150, 300, 200, 30);
        empID.setFont(new Font ("arial", Font.PLAIN, 20));
        empID.setForeground(Color.WHITE);
        add(empID);

        cempid = new Choice();
        cempid.setBounds(370, 300, 200, 30);
        cempid.setFont(new Font ("arial", Font.PLAIN, 15));
        cempid.setBackground(Color.GRAY);
        cempid.setForeground(Color.BLACK);
        add(cempid);

        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                cempid.add(rs.getString("eid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel name = new JLabel("Employee name");
        name.setBounds(620, 300, 200, 30);
        name.setFont(new Font ("arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        add(name);

        lblname = new JLabel();
        lblname.setBounds(840, 300, 200, 30);
        lblname.setFont(new Font ("arial", Font.PLAIN, 20));
        lblname.setForeground(Color.WHITE);
        add(lblname);

        JLabel phone = new JLabel("Mobile No");
        phone.setBounds(150, 350, 200, 30);
        phone.setFont(new Font ("arial", Font.PLAIN, 20));
        phone.setForeground(Color.WHITE);
       add(phone);

        lblphone = new JLabel();
        lblphone.setBounds(370, 350, 200, 30);
        lblphone.setFont(new Font ("arial", Font.PLAIN, 20));
        lblphone.setForeground(Color.WHITE);
        add(lblphone);

        JLabel email = new JLabel("Email ID");
        email.setBounds(620, 350, 200, 30);
        email.setFont(new Font ("arial", Font.PLAIN, 20));
        email.setForeground(Color.WHITE);
        add(email);

        lblemail = new JLabel();
        lblemail.setBounds(840, 350, 200, 30);
        lblemail.setFont(new Font ("arial", Font.PLAIN, 20));
        lblemail.setForeground(Color.WHITE);
        add(lblemail);

        deletebutton = new JButton("Delete Employee");
        deletebutton.setBounds(230, 700, 200, 30);
        deletebutton.setBackground(Color.gray);
        deletebutton.setForeground(Color.BLACK);
        deletebutton.setBorder(null);
        deletebutton.addActionListener(this);
        add(deletebutton);

        backbutton = new JButton("Go Back");
        backbutton.setBounds(700, 700, 200, 30);
        backbutton.setBackground(Color.gray);
        backbutton.setForeground(Color.BLACK);
        backbutton.setBorder(null);
        backbutton.addActionListener(this);
        add(backbutton);

        cempid.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from employee where eid = '" +cempid.getSelectedItem()+ "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("mobile"));
                        lblemail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }  
            }
            
        });

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Removeemployee();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==deletebutton){
            try {
                Conn c = new Conn();
                String query = "delete from employee where eid = '" +cempid.getSelectedItem()+ "'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee deleted successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new Home();
        }
    }
}
