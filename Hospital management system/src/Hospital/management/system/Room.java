package Hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {

    JTable table;

    Room(){

        JPanel panel =  new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Loginn.png"));
        Image image = i1.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(630,3,200,200);
        panel.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
        Image image1 = i11.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(600,200,200,200);
        panel.add(label1);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(90,156,163));
        panel.add(table);

        try{

            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));



        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label2 = new JLabel("Room NO");
        label2.setBounds(12,15,80,15);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(new Color(27,146,196));
        panel.add(label2);

        JLabel label3 = new JLabel("Availability");
        label3.setBounds(125,15,80,15);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(new Color(27,146,196));
        panel.add(label3);

        JLabel label4 = new JLabel("Price");
        label4.setBounds(260,15,80,15);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(new Color(27,146,196));
        panel.add(label4);

        JLabel label5 = new JLabel("Bad Type");
        label5.setBounds(390,15,80,15);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(new Color(27,146,196));
        panel.add(label5);

        JButton back = new JButton("Back");
        back.setBounds(200,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });




        setSize(900,600);
        setLayout(null);
        setLocation(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Room();
    }
}
