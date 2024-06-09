package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Addemployee extends JFrame implements ActionListener{

  Random rm = new Random();
  int num = rm.nextInt(999999);

  JLabel JLBLempID;
  JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfaadhar, tfdesignation, tfsalary;
  JDateChooser cdob;
  JComboBox cbgender, cbeducation;
  JButton addbutton, backbutton;

    Addemployee(){
         getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Add New Employee");
        heading.setBounds(410, 0, 800, 400);
        heading.setFont(new Font ("arial", Font.PLAIN, 40));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(150, 300, 200, 30);
        empID.setFont(new Font ("arial", Font.PLAIN, 20));
        empID.setForeground(Color.WHITE);
        add(empID);

        JLBLempID = new JLabel("" + num);
        JLBLempID.setBounds(370, 300, 200, 30);
        JLBLempID.setFont(new Font ("arial", Font.PLAIN, 20));
        JLBLempID.setForeground(Color.WHITE);
        add(JLBLempID);

        JLabel name = new JLabel("Employee name");
        name.setBounds(620, 300, 200, 30);
        name.setFont(new Font ("arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(840, 300, 200, 30);
        tfname.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfname);

        JLabel fname = new JLabel("Father's name");
        fname.setBounds(150, 350, 200, 30);
        fname.setFont(new Font ("arial", Font.PLAIN, 20));
        fname.setForeground(Color.WHITE);
        add(fname);

        tffname = new JTextField();
        tffname.setBounds(370, 350, 200, 30);
        tffname.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tffname);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(620, 350, 200, 30);
        dob.setFont(new Font ("arial", Font.PLAIN, 20));
        dob.setForeground(Color.WHITE);
        add(dob);

       cdob = new JDateChooser();
       cdob.setBounds(840, 350, 200, 30);
       cdob.setForeground(Color.WHITE);
       add(cdob);

       JLabel LBLgender = new JLabel("Gender");
       LBLgender.setBounds(150, 400, 200, 30);
       LBLgender.setFont(new Font ("arial", Font.PLAIN, 20));
       LBLgender.setForeground(Color.WHITE);
        add(LBLgender);

        String gender[] = {"Male", "Female", "Other", "Prefer not to say"};
        cbgender = new JComboBox<>(gender);
        cbgender.setBounds(370, 400, 200, 30);
        cbgender.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(cbgender);

       JLabel address = new JLabel("Address");
        address.setBounds(620, 400, 200, 30);
        address.setFont(new Font ("arial", Font.PLAIN, 20));
        address.setForeground(Color.WHITE);
        add(address);

        tfaddress = new JTextField();
        tfaddress.setBounds(840, 400, 200, 30);
        tfaddress.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfaddress);
        
        JLabel phone = new JLabel("Mobile No");
        phone.setBounds(150, 450, 200, 30);
        phone.setFont(new Font ("arial", Font.PLAIN, 20));
        phone.setForeground(Color.WHITE);
       add(phone);

        tfphone = new JTextField();
        tfphone.setBounds(370, 450, 200, 30);
        tfphone.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfphone);

        JLabel email = new JLabel("Email ID");
        email.setBounds(620, 450, 200, 30);
        email.setFont(new Font ("arial", Font.PLAIN, 20));
        email.setForeground(Color.WHITE);
        add(email);

        tfemail = new JTextField();
        tfemail.setBounds(840, 450, 200, 30);
        tfemail.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfemail);

        JLabel aadhar = new JLabel("Aadhar No");
        aadhar.setBounds(150, 500, 200, 30);
        aadhar.setFont(new Font ("arial", Font.PLAIN, 20));
        aadhar.setForeground(Color.WHITE);
        add(aadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(370, 500, 200, 30);
        tfaadhar.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfaadhar);

        JLabel education = new JLabel("Highest Education");
        education.setBounds(620, 500, 200, 30);
        education.setFont(new Font ("arial", Font.PLAIN, 20));
        education.setForeground(Color.WHITE);
       add(education);

       String courses[] = {"BBA", "BCA", "BA", "BSC", "BCOM", "BTECH", "MBA", "MCA", "MA", "MSC", "MCOM", "MTECH", "PHD"};
        cbeducation = new JComboBox<>(courses);
        cbeducation.setBounds(840, 500, 200, 30);
        cbeducation.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(cbeducation);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(150, 550, 200, 30);
        designation.setFont(new Font ("arial", Font.PLAIN, 20));
        designation.setForeground(Color.WHITE);
        add(designation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(370, 550, 200, 30);
        tfdesignation.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfdesignation);

       JLabel salary = new JLabel("Salary");
       salary.setBounds(620, 550, 200, 30);
       salary.setFont(new Font ("arial", Font.PLAIN, 20));
       salary.setForeground(Color.WHITE);
       add(salary);

        tfsalary = new JTextField();
        tfsalary.setBounds(840, 550, 200, 30);
        tfsalary.setFont(new Font ("arial", Font.PLAIN, 20));
      //  tfusername.setForeground(Color.WHITE);
        add(tfsalary);

        

        addbutton = new JButton("Add Details");
        addbutton.setBounds(230, 700, 200, 30);
        addbutton.setBackground(Color.gray);
        addbutton.setForeground(Color.BLACK);
        addbutton.setBorder(null);
        addbutton.addActionListener(this);
            add(addbutton);

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
        new Addemployee();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==addbutton){
          String eid = JLBLempID.getText();
          String name = tfname.getText();
          String fname = tffname.getText();
          String address = tfaddress.getText();
          String phone = tfphone.getText();
          String email = tfemail.getText();
          String aadhar = tfaadhar.getText();
          String designation = tfdesignation.getText();
          String salary = tfsalary.getText();
          //String cdobs = cdob.getComponents().toString();
          String dob = ((JTextField) cdob.getDateEditor().getUiComponent()).getText();
          String gender = cbgender.getSelectedItem().toString();
          String education = cbeducation.getSelectedItem().toString();

          try {
            Conn c = new Conn();
            String query = "insert into employee values('"+eid+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+address+"', '"+phone+"', '"+email+"', '"+aadhar+"', '"+education+"', '"+designation+"', '"+salary+"')";
           c.s.executeUpdate(query);
          // System.out.println(query);
            JOptionPane.showMessageDialog(null, "Details added successfully");
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
