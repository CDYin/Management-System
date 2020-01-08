package view.customer;

import daoimpl.CustomersController;
import daoimpl.WaitersController;
import view.customer.Error;
import view.waiter.Work;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Customer-Login");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("登录");
        JButton button2 = new JButton("注册");
        JButton button3 = new JButton("我是游客");
        button1.setSize(100,40);
        button1.setLocation(20,250);
        button2.setSize(100,40);
        button2.setLocation(140,250);
        button3.setSize(100,40);
        button3.setLocation(260,250);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        JLabel j1 = new JLabel("账号：");
        JLabel j2 = new JLabel("密码：");
        j1.setBounds(100,100,70,20);
        j2.setBounds(100,140,70,20);
        frame.add(j1);
        frame.add(j2);

        final JTextField jtf = new JTextField("请输入您的账号",16);
        final JPasswordField jpf = new JPasswordField(16);
        jtf.setBounds(200, 100, 130, 30);
        jpf.setBounds(200,140,130,30);
        frame.add(jtf);
        frame.add(jpf);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomersController customersController = new CustomersController();
                ResultSet rs = customersController.Verification(jtf.getText(), String.valueOf(jpf.getPassword()));
                try {
                    if (rs.next()) {
                        frame.setVisible(false);
                        new View(jtf.getText());
                    }else {
                        new Error();
                        frame.setVisible(false);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Regist();
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Tourist();
                frame.setVisible(false);
            }
        });
        frame.setVisible(true);
    }
    }
