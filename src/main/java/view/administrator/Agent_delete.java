package view.administrator;

import daoimpl.AdministratorsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agent_delete {
    public Agent_delete(){
        final JFrame frame = new JFrame();
        frame.setBounds(500,100,600,600);
        frame.setTitle("Waiters-Work");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("删除服务员信息");
        JButton button2 = new JButton("删除客房物品信息");
        JButton button3 = new JButton("删除酒店信息");
        JButton button4 = new JButton("删除客房信息");
        JButton button5 = new JButton("删除工作安排");
        JButton button6 = new JButton("删除入住情况");
        button1.setBounds(180,150,100,50);
        button2.setBounds(300,150,100,50);
        button3.setBounds(180,250,100,50);
        button4.setBounds(300,250,100,50);
        button5.setBounds(180,350,100,50);
        button6.setBounds(300,350,100,50);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        final JTextField jtf1 = new JTextField("请输入服务员编号",16);
        final JTextField jtf2= new JTextField("请输入客房物品编号",16);
        final JTextField jtf3= new JTextField("请输入酒店编号",16);
        final JTextField jtf4 = new JTextField("请输入客房编号",16);
        final JTextField jtf5 = new JTextField("请输入客房类型编号",16);
        final JTextField jtf6 = new JTextField("请输入客房设施编号",16);
        final JTextField jtf7 = new JTextField("请输入工作编号",16);
        final JTextField jtf8 = new JTextField("请输入服务员编号",16);
        final JTextField jtf9 = new JTextField("请输入入住客房编号",16);
        final JTextField jtf10 = new JTextField("请输入入住客人编号",16);

        jtf1.setBounds(180, 110, 100, 30);
        jtf2.setBounds(300, 110, 100, 30);
        jtf3.setBounds(180, 210, 100, 30);
        jtf4.setBounds(300, 210, 100, 30);
        jtf5.setBounds(420, 210, 100, 30);
        jtf6.setBounds(420, 250, 100, 30);
        jtf7.setBounds(70, 310, 100, 30);
        jtf8.setBounds(180, 310, 100, 30);
        jtf9.setBounds(300, 310, 100, 30);
        jtf10.setBounds(420, 310, 100, 30);
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

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_Waiter(jtf1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_HotelGoods(jtf2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_HotelMessage(jtf3.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_Rooms(jtf4.getText(),jtf5.getToolTipText(),jtf6.getText());
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_WorkArrangement(jtf7.getText(),jtf8.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdministratorsController administratorsController = new AdministratorsController();
                administratorsController.delete_LivingCondition(jtf9.getText(),jtf10.getText());
            }
        });

        frame.setVisible(true);
    }
}
