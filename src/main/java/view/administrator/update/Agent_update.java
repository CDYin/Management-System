package view.administrator.update;

import daoimpl.AdministratorsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agent_update {
    public Agent_update(){
        final JFrame frame = new JFrame();
        frame.setBounds(500,100,600,600);
        frame.setTitle("Agent_update");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("更新服务员信息");
        JButton button2 = new JButton("更新顾客信息");
        JButton button3 = new JButton("更新客房物品信息");
        JButton button4 = new JButton("更新酒店信息");
        JButton button5 = new JButton("更新客房信息");
        JButton button6 = new JButton("更新工作安排");
        JButton button7 = new JButton("更新工作安排");
        button1.setBounds(180,150,100,50);
        button2.setBounds(300,150,100,50);
        button3.setBounds(180,250,100,50);
        button4.setBounds(300,250,100,50);
        button5.setBounds(180,350,100,50);
        button6.setBounds(300,350,100,50);
        button7.setBounds(180,450,100,50);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);

        final JTextField jtf1 = new JTextField("请输入服务员编号",16);
        final JTextField jtf2= new JTextField("请输入顾客编号",16);
        final JTextField jtf3= new JTextField("请输入物品编号",16);
        final JTextField jtf4 = new JTextField("请输入酒店编号",16);
        final JTextField jtf5 = new JTextField("请输入客房编号",16);
        final JTextField jtf6 = new JTextField("请输入工作编号",16);
        final JTextField jtf7 = new JTextField("请输入客房编号",16);
        final JTextField jtf8 = new JTextField("请输入房间编号",16);
        jtf1.setBounds(180, 110, 100, 30);
        jtf2.setBounds(300, 110, 100, 30);
        jtf3.setBounds(180, 210, 100, 30);
        jtf4.setBounds(300, 210, 100, 30);
        jtf5.setBounds(420, 210, 100, 30);
        jtf6.setBounds(420, 250, 100, 30);
        jtf7.setBounds(70, 310, 100, 30);
        jtf8.setBounds(180, 310, 100, 30);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jtf3);
        frame.add(jtf4);
        frame.add(jtf5);
        frame.add(jtf6);
        frame.add(jtf7);
        frame.add(jtf8);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_waiter(jtf1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_customer(jtf2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_hotelgood(jtf3.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_hotelMessage(jtf4.getText());
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_Rooms(jtf5.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_workarrangement(jtf6.getText());
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new update_livingcondition(jtf7.getText(),jtf8.getText());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Agent_update();
    }
}
