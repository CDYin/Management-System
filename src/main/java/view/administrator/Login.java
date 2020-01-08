package view.administrator;

import daoimpl.AdministratorsController;
import daoimpl.WaitersController;
import view.waiter.Error;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Wdministrator-Login");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("登录");
        JButton button2 = new JButton("注册");
        button1.setSize(100,40);
        button1.setLocation(80,250);
        button2.setSize(100,40);
        button2.setLocation(220,250);
        frame.add(button1);
        frame.add(button2);

        JLabel j1 = new JLabel("管理员编号：");
        JLabel j2 = new JLabel("密     码：");
        j1.setBounds(70,100,100,20);
        j2.setBounds(70,140,100,20);
        frame.add(j1);
        frame.add(j2);

        final JTextField jtf = new JTextField("请输入您的工作编号",16);
        final JPasswordField jpf = new JPasswordField(16);
        jtf.setBounds(200, 100, 130, 30);
        jpf.setBounds(200,140,130,30);
        frame.add(jtf);
        frame.add(jpf);

        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                ResultSet rs = administratorsController.Verification(jtf.getText(), String.valueOf(jpf.getPassword()));
                try {
                    if (rs.next()) {
                        frame.setVisible(false);
                        new Work(jtf.getText());
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
    }
}
