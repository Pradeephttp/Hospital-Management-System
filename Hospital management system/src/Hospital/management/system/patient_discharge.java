package Hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class patient_discharge extends JFrame {
    patient_discharge(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel label =new JLabel("CHECK-OUT");
        label.setBounds(100,20,150,20);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel label2 = new JLabel("Customer ID");
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setBounds(30,80,150,20);
        label2.setForeground(Color.white);
        panel.add(label2);

        Choice choice = new Choice();
        choice.setBounds(200,80,150,25);
        panel.add(choice);

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from patient_info");
            while (resultSet.next()){
                choice.add(resultSet.getString("Number"));
            }
        }catch (Exception e){
            e.printStackTrace();

        }




        JLabel label3 = new JLabel("Room Number");
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setBounds(30,130,150,20);
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel RNo = new JLabel("");
        RNo.setFont(new Font("Tahoma",Font.BOLD,14));
        RNo.setBounds(200,130,150,20);
        RNo.setForeground(Color.white);
        panel.add(RNo);

        JLabel label4 = new JLabel("IN Time");
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setBounds(30,180,150,20);
        label4.setForeground(Color.white);
        panel.add(label4);


        JLabel INTime = new JLabel("");
        INTime.setFont(new Font("Tahoma",Font.BOLD,14));
        INTime.setBounds(200,180,250,20);
        INTime.setForeground(Color.white);
        panel.add(INTime);

        JLabel label5 = new JLabel("OUT TIME");
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setBounds(30,230,150,20);
        label5.setForeground(Color.white);
        panel.add(label5);

        Date date = new Date();

        JLabel OUTTime = new JLabel(""+date);
        OUTTime.setFont(new Font("Tahoma",Font.BOLD,14));
        OUTTime.setBounds(200,230,250,20);
        OUTTime.setForeground(Color.white);
        panel.add(OUTTime);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(30,300,120,30);
        discharge.setBackground(Color.black);
        discharge.setForeground(Color.white);
        panel.add(discharge);
        discharge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try{
                    c.statement.executeUpdate("delete  from patient_Info where number = '"+choice.getSelectedItem()+"'");
                    c.statement.executeUpdate("update room set Availability = 'Availble' where Room_no = '"+RNo.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }


            }
        });

        JButton Check = new JButton("Check");
        Check.setBounds(170,300,120,30);
        Check.setBackground(Color.black);
        Check.setForeground(Color.white);
        panel.add(Check);
        Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try {
                    ResultSet resultSet = c.statement.executeQuery("select * from patient_Info where number = '"+choice.getSelectedItem()+"'");
                    while (resultSet.next()){
                        RNo.setText(resultSet.getString("Room_Numbe"));
                        INTime.setText(resultSet.getString("Time"));

                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton Back = new JButton("Back");
        Back.setBounds(300,300,120,30);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });







        setUndecorated(true);
        setSize(800,400);
        setLocation(400,250);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new patient_discharge();
    }
}


