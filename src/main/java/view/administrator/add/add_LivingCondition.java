package view.administrator.add;

import daoimpl.AdministratorsController;
import daoimpl.WaitersController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_LivingCondition {
    add_LivingCondition(){
        final JFrame frame = new JFrame();
        frame.setBounds(600,200,700,700);
        frame.setTitle("add_LivingCondition");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel j1 = new JLabel("入住客房编号");
        JLabel j2 = new JLabel("入住客户编号");
        JLabel j3 = new JLabel("入住人数");
        JLabel j4 = new JLabel("入住时间");
        JLabel j5 = new JLabel("离店时间");
        JLabel j6 = new JLabel("客户评价");
        JLabel j7 = new JLabel("备注");
        JLabel j8 = new JLabel("更新时间");
        JLabel j9 = new JLabel("更新人编号");
        j1.setBounds(150,50,100,20);
        j2.setBounds(400,50,100,20);
        j3.setBounds(150,100,100,20);
        j4.setBounds(400,100,100,20);
        j5.setBounds(150,150,100,20);
        j6.setBounds(400,150,100,20);
        j7.setBounds(150,200,100,20);
        j8.setBounds(400,200,100,20);
        j9.setBounds(150,250,100,20);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(j4);
        frame.add(j5);
        frame.add(j6);
        frame.add(j7);
        frame.add(j8);
        frame.add(j9);

        final JTextField jtf1 = new JTextField();
        final JTextField jtf2 = new JTextField();
        final JTextField jtf3 = new JTextField();
        final JTextField jtf4 = new JTextField();
        final JTextField jtf5 = new JTextField();
        final JTextField jtf6 = new JTextField();
        final JTextField jtf7 = new JTextField();
        final JTextField jtf8 = new JTextField();
        final JTextField jtf9 = new JTextField();
        jtf1.setBounds(250, 50, 130, 30);
        jtf2.setBounds(500, 50, 130, 30);
        jtf3.setBounds(250, 100, 130, 30);
        jtf4.setBounds(500, 100, 130, 30);
        jtf5.setBounds(250, 150, 130, 30);
        jtf6.setBounds(500, 150, 130, 30);
        jtf7.setBounds(250, 200, 130, 30);
        jtf8.setBounds(500, 200, 130, 30);
        jtf9.setBounds(250, 250, 130, 30);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jtf3);
        frame.add(jtf4);
        frame.add(jtf5);
        frame.add(jtf6);
        frame.add(jtf7);
        frame.add(jtf8);
        frame.add(jtf9);

        JButton button1 = new JButton("完成");
        JButton button2 = new JButton("取消");
        button1.setSize(100,40);
        button1.setLocation(250,500);
        button2.setSize(100,40);
        button2.setLocation(500,500);
        frame.add(button1);
        frame.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.add_LIvingCondition(jtf1.getText(),jtf2.getText(),jtf3.getText(),jtf4.getText(),jtf5.getText(),
                        jtf6.getText(), jtf7.getText(),jtf8.getText(),jtf9.getText());
                frame.setVisible(false);
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
