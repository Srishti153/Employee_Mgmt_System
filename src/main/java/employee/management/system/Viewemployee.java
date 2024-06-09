package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import net.proteanit.sql.DbUtils;

public class Viewemployee extends JFrame implements ActionListener{

    JTable table;
    Choice cempid;

    JButton search, print, update, back;

    Viewemployee(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        JLabel heading = new JLabel("Employee List");
        heading.setBounds(500, 40, 450, 30);
        heading.setFont(new Font ("arial", Font.PLAIN, 30));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel searchlbl = new JLabel("Search by Employee ID:");
        searchlbl.setBounds(20, 110, 250, 20);
        searchlbl.setFont(new Font ("arial", Font.BOLD, 15));
        searchlbl.setForeground(Color.WHITE);
        add(searchlbl);

        cempid = new Choice();
        cempid.setBounds(280, 110, 150, 30);
        cempid.setFont(new Font ("arial", Font.PLAIN, 15));
        cempid.setBackground(Color.GRAY);
        cempid.setForeground(Color.BLACK);
        add(cempid);

        search = new JButton("Search");
        search.setBounds(20, 180, 200, 30);
        search.setBackground(Color.gray);
        search.setForeground(Color.BLACK);
        search.setBorder(null);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(240, 180, 200, 30);
        print.setBackground(Color.gray);
        print.setForeground(Color.BLACK);
        print.setBorder(null);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(460, 180, 200, 30);
        update.setBackground(Color.gray);
        update.setForeground(Color.BLACK);
        update.setBorder(null);
        update.addActionListener(this);
        add(update);

        back = new JButton("Go Back");
        back.setBounds(680, 180, 200, 30);
        back.setBackground(Color.gray);
        back.setForeground(Color.BLACK);
        back.setBorder(null);
        back.addActionListener(this);
        add(back);

        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                cempid.add(rs.getString("eid"));               
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }


        JScrollPane jsp = new JScrollPane(table);
        jsp.setAlignmentY(400);
        jsp.setBounds(0, 250, 1200, 800);
        add(jsp);

        

        setSize(1200, 800);
        setLocation(400, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Viewemployee();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==search){
            String query = "select * from employee where eid = '"+cempid.getSelectedItem()+"'";
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==print){
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==update){
            setVisible(false);
            new Updateemployee(cempid.getSelectedItem());
        }
        else{
            setVisible(false);
            new Home();
        }
        
    }
}
