package view.customer;

import daoimpl.AdministratorsController;
import daoimpl.CustomersController;
import daoimpl.WaitersController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regist {
    Regist() {
        final JFrame frame = new JFrame();
        frame.setBounds(600, 200, 700, 700);
        frame.setTitle("Customer-Regist");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel j1 = new JLabel("客户编号");
        JLabel j2 = new JLabel("账号");
        JLabel j3 = new JLabel("密码");
        JLabel j4 = new JLabel("姓名");
        JLabel j5 = new JLabel("性别");
        JLabel j6 = new JLabel("身份证号");
        JLabel j7 = new JLabel("联系电话");
        JLabel j8 = new JLabel("入住客房编号");
        JLabel j9 = new JLabel("预计入住天数");
        JLabel j10 = new JLabel("预计入住时间");
        JLabel j11 = new JLabel("预计离店时间");
        JLabel j12 = new JLabel("早餐服务");
        JLabel j13 = new JLabel("叫早服务");
        JLabel j14 = new JLabel("押金金额");
        JLabel j15 = new JLabel("住宿费");
        j1.setBounds(150, 50, 100, 20);
        j2.setBounds(400, 50, 100, 20);
        j3.setBounds(150, 100, 100, 20);
        j4.setBounds(400, 100, 100, 20);
        j5.setBounds(150, 150, 100, 20);
        j6.setBounds(400, 150, 100, 20);
        j7.setBounds(150, 200, 100, 20);
        j8.setBounds(400, 200, 100, 20);
        j9.setBounds(150, 250, 100, 20);
        j10.setBounds(400, 250, 100, 20);
        j11.setBounds(150, 300, 100, 20);
        j12.setBounds(400, 300, 100, 20);
        j13.setBounds(150, 350, 100, 20);
        j14.setBounds(400, 350, 100, 20);
        j15.setBounds(150, 400, 100, 20);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(j4);
        frame.add(j5);
        frame.add(j6);
        frame.add(j7);
        frame.add(j8);
        frame.add(j9);
        frame.add(j10);
        frame.add(j11);
        frame.add(j12);
        frame.add(j13);
        frame.add(j14);
        frame.add(j15);

        final JTextField jtf1 = new JTextField();
        final JTextField jtf2 = new JTextField();
        final JTextField jtf3 = new JTextField();
        final JTextField jtf4 = new JTextField();
        final JTextField jtf5 = new JTextField();
        final JTextField jtf6 = new JTextField();
        final JTextField jtf7 = new JTextField();
        final JTextField jtf8 = new JTextField();
        final JTextField jtf9 = new JTextField();
        final JTextField jtf10 = new JTextField();
        final JTextField jtf11 = new JTextField();
        final JTextField jtf12 = new JTextField();
        final JTextField jtf13 = new JTextField();
        final JTextField jtf14 = new JTextField();
        final JTextField jtf15 = new JTextField();
        jtf1.setBounds(250, 50, 130, 30);
        jtf2.setBounds(500, 50, 130, 30);
        jtf3.setBounds(250, 100, 130, 30);
        jtf4.setBounds(500, 100, 130, 30);
        jtf5.setBounds(250, 150, 130, 30);
        jtf6.setBounds(500, 150, 130, 30);
        jtf7.setBounds(250, 200, 130, 30);
        jtf8.setBounds(500, 200, 130, 30);
        jtf9.setBounds(250, 250, 130, 30);
        jtf10.setBounds(500, 250, 130, 30);
        jtf11.setBounds(250, 300, 130, 30);
        jtf12.setBounds(500, 300, 130, 30);
        jtf13.setBounds(250, 350, 130, 30);
        jtf14.setBounds(500, 350, 130, 30);
        jtf15.setBounds(250, 400, 130, 30);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jtf3);
        frame.add(jtf4);
        frame.add(jtf5);
        frame.add(jtf6);
        frame.add(jtf7);
        frame.add(jtf8);
        frame.add(jtf9);
        frame.add(jtf10);
        frame.add(jtf11);
        frame.add(jtf12);
        frame.add(jtf13);
        frame.add(jtf14);
        frame.add(jtf15);

        JButton button1 = new JButton("完成");
        JButton button2 = new JButton("取消");
        button1.setSize(100, 40);
        button1.setLocation(250, 500);
        button2.setSize(100, 40);
        button2.setLocation(500, 500);
        frame.add(button1);
        frame.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomersController customersController = new CustomersController();
                customersController.add_Customer(jtf1.getText(), jtf2.getText(), jtf3.getText(), jtf4.getText(), jtf5.getText(),
                        jtf6.getText(), jtf7.getText(), jtf8.getText(), jtf9.getText(), jtf10.getText(),
                        jtf11.getText(), jtf12.getText(), jtf13.getText(), jtf14.getText(), jtf15.getText());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

        frame.setVisible(true);
    }
}
