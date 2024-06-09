package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Updateemployee extends JFrame implements ActionListener{

  JLabel JLBLempID;
  JTextField tfaddress, tfphone, tfemail, tfdesignation, tfsalary, tfeducation;
  JButton updatebutton, backbutton;
  String empid;

  Updateemployee(String empid){
        this.empid = empid;
         getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Update Employee");
        heading.setBounds(410, 0, 800, 400);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(150, 300, 200, 30);
        empID.setFont(new Font ("arial", Font.PLAIN, 20));
        empID.setForeground(Color.WHITE);
        add(empID);

        JLBLempID = new JLabel("");
        JLBLempID.setBounds(370, 300, 200, 30);
        JLBLempID.setFont(new Font ("arial", Font.PLAIN, 20));
        JLBLempID.setForeground(Color.WHITE);
        add(JLBLempID);

        JLabel name = new JLabel("Employee name");
        name.setBounds(620, 300, 200, 30);
        name.setFont(new Font ("arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        add(name);

        JLabel lblname = new JLabel();
        lblname.setBounds(840, 300, 200, 30);
        lblname.setFont(new Font ("arial", Font.PLAIN, 20));
        lblname.setForeground(Color.WHITE);
        add(lblname);

        JLabel fname = new JLabel("Father's name");
        fname.setBounds(150, 350, 200, 30);
        fname.setFont(new Font ("arial", Font.PLAIN, 20));
        fname.setForeground(Color.WHITE);
        add(fname);

        JLabel lblfname = new JLabel();
        lblfname.setBounds(370, 350, 200, 30);
        lblfname.setFont(new Font ("arial", Font.PLAIN, 20));
        lblfname.setForeground(Color.WHITE);
        add(lblfname);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(620, 350, 200, 30);
        dob.setFont(new Font ("arial", Font.PLAIN, 20));
        dob.setForeground(Color.WHITE);
        add(dob);

       JLabel lbldob = new JLabel();
       lbldob.setBounds(840, 350, 200, 30);
       lbldob.setForeground(Color.WHITE);
       add(lbldob);

       JLabel LBLgender = new JLabel("Gender");
       LBLgender.setBounds(150, 400, 200, 30);
       LBLgender.setFont(new Font ("arial", Font.PLAIN, 20));
       LBLgender.setForeground(Color.WHITE);
        add(LBLgender);

        JLabel lblgender = new JLabel();
        lblgender.setBounds(370, 400, 200, 30);
        lblgender.setFont(new Font ("arial", Font.PLAIN, 20));
        lblgender.setForeground(Color.WHITE);
        add(lblgender);

       JLabel address = new JLabel("Address");
        address.setBounds(620, 400, 200, 30);
        address.setFont(new Font ("arial", Font.PLAIN, 20));
        address.setForeground(Color.WHITE);
        add(address);

        tfaddress = new JTextField();
        tfaddress.setBounds(840, 400, 200, 30);
        tfaddress.setFont(new Font ("arial", Font.PLAIN, 20));
        //tfaddress.setForeground(Color.WHITE);
        add(tfaddress);
        
        JLabel phone = new JLabel("Mobile No");
        phone.setBounds(150, 450, 200, 30);
        phone.setFont(new Font ("arial", Font.PLAIN, 20));
        phone.setForeground(Color.WHITE);
       add(phone);

        tfphone = new JTextField();
        tfphone.setBounds(370, 450, 200, 30);
        tfphone.setFont(new Font ("arial", Font.PLAIN, 20));
        //tfphone.setForeground(Color.WHITE);
        add(tfphone);

        JLabel email = new JLabel("Email ID");
        email.setBounds(620, 450, 200, 30);
        email.setFont(new Font ("arial", Font.PLAIN, 20));
        email.setForeground(Color.WHITE);
        add(email);

        tfemail = new JTextField();
        tfemail.setBounds(840, 450, 200, 30);
        tfemail.setFont(new Font ("arial", Font.PLAIN, 20));
        //tfemail.setForeground(Color.WHITE);
        add(tfemail);

        JLabel aadhar = new JLabel("Aadhar No");
        aadhar.setBounds(150, 500, 200, 30);
        aadhar.setFont(new Font ("arial", Font.PLAIN, 20));
        aadhar.setForeground(Color.WHITE);
        add(aadhar);

        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(370, 500, 200, 30);
        lblaadhar.setFont(new Font ("arial", Font.PLAIN, 20));
        lblaadhar.setForeground(Color.WHITE);
        add(lblaadhar);

        JLabel education = new JLabel("Highest Education");
        education.setBounds(620, 500, 200, 30);
        education.setFont(new Font ("arial", Font.PLAIN, 20));
        education.setForeground(Color.WHITE);
       add(education);

       tfeducation = new JTextField();
       tfeducation.setBounds(840, 500, 200, 30);
       tfeducation.setFont(new Font ("arial", Font.PLAIN, 20));
       //tfeducation.setForeground(Color.WHITE);
        add(tfeducation);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(150, 550, 200, 30);
        designation.setFont(new Font ("arial", Font.PLAIN, 20));
        designation.setForeground(Color.WHITE);
        add(designation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(370, 550, 200, 30);
        tfdesignation.setFont(new Font ("arial", Font.PLAIN, 20));
        //tfdesignation.setForeground(Color.WHITE);
        add(tfdesignation);

       JLabel salary = new JLabel("Salary");
       salary.setBounds(620, 550, 200, 30);
       salary.setFont(new Font ("arial", Font.PLAIN, 20));
       salary.setForeground(Color.WHITE);
       add(salary);

        tfsalary = new JTextField();
        tfsalary.setBounds(840, 550, 200, 30);
        tfsalary.setFont(new Font ("arial", Font.PLAIN, 20));
        //tfsalary.setForeground(Color.WHITE);
        add(tfsalary);

        try {
            Conn c = new Conn();
            String query = "select * from employee where eid = '" +empid+ "'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                JLBLempID.setText(rs.getString("eid"));
                lblname.setText(rs.getString("name"));
                lblfname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                lblgender.setText(rs.getString("gender"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("mobile"));
                tfemail.setText(rs.getString("email"));
                lblaadhar.setText(rs.getString("aadhar"));
                tfeducation.setText(rs.getString("education"));
                tfdesignation.setText(rs.getString("designation"));
                tfsalary.setText(rs.getString("salary"));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        updatebutton = new JButton("Update Details");
        updatebutton.setBounds(230, 700, 200, 30);
        updatebutton.setBackground(Color.gray);
        updatebutton.setForeground(Color.BLACK);
        updatebutton.setBorder(null);
        updatebutton.addActionListener(this);
            add(updatebutton);

            backbutton = new JButton("Go Back");
            backbutton.setBounds(700, 700, 200, 30);
            backbutton.setBackground(Color.gray);
            backbutton.setForeground(Color.BLACK);
            backbutton.setBorder(null);
            backbutton.addActionListener(this);
            add(backbutton);

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Updateemployee("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==updatebutton){
          String eid = JLBLempID.getText();
          String address = tfaddress.getText();
          String phone = tfphone.getText();
          String email = tfemail.getText();
          String designation = tfdesignation.getText();
          String salary = tfsalary.getText();
          String education = tfeducation.getText();

          try {
            Conn c = new Conn();
            String query = "update employee set address = '"+address+"',mobile = '"+phone+"',email = '"+email+"',education = '"+education+"',designation = '"+designation+"',salary = '"+salary+"' where eid = '"+empid+"'";
            c.s.executeUpdate(query);
          // System.out.println(query);
            JOptionPane.showMessageDialog(null, "Details updated successfully");
            setVisible(false);
            new Home();
          } 
          catch (Exception e) {
            e.printStackTrace();
          }

        }
        else{
          setVisible(false);
          new Home();
        }
    }
}
