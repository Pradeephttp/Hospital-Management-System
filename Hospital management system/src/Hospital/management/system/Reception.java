package Hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Reception  extends JFrame {

    Reception(){

        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(5,160,1900,850);
        Panel.setBackground(new Color(109,164,170));
        add(Panel);

        JPanel Panel1 = new JPanel();
        Panel1.setLayout(null);
        Panel1.setBounds(5,5,1900,150);
        Panel1.setBackground(new Color(109,164,170));
        add(Panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dr.png"));
        Image image = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1300,0,250,250);
        Panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/amb.png"));
        Image image1 = i11.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000,50,300,100);
        Panel1.add(label1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/docc.png"));
        Image image2 = i111.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i222 = new ImageIcon(image2);
        JLabel label11 = new JLabel(i222);
        label11.setBounds(1450,25,400,120);
        Panel1.add(label11);



        JButton btn1 = new JButton("Add New patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(246,251,118));
        Panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new new_patient();

            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30,58,200,30);
        btn2.setBackground(new Color(246,251,118));
        Panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();

            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30,100,200,30);
        btn3.setBackground(new Color(246,251,118));
        Panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();

            }
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(246,251,118));
        Panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();

            }
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(270,58,200,30);
        btn5.setBackground(new Color(246,251,118));
        Panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new All_patients_info();

            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270,100,200,30);
        btn6.setBackground(new Color(246,251,118));
        Panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_discharge();

            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510,15,200,30);
        btn7.setBackground(new Color(246,251,118));
        Panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new update_patient();

            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510,58,200,30);
        btn8.setBackground(new Color(246,251,118));
        Panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();

            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510,100,200,30);
        btn9.setBackground(new Color(246,251,118));
        Panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new search_room();

            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750,15,200,30);
        btn10.setBackground(new Color(246,251,118));
        Panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();

            }
        });

        setSize(1950,1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Reception();

    }
}
