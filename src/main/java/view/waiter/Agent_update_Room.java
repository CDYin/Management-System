package view.waiter;

import daoimpl.WaitersController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agent_update_Room {
    Agent_update_Room(){
        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Agent_update_Room");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("完成");
        button1.setSize(100,40);
        button1.setLocation(150,300);
        frame.add(button1);

        final JTextField jtf1 = new JTextField("请输入您要编辑的客房编号",16);
        final JTextField jtf2 = new JTextField("请输入客房当前状态",16);
        jtf1.setBounds(50, 100, 200, 30);
        jtf2.setBounds(50, 200, 200, 30);
        frame.add(jtf1);
        frame.add(jtf2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WaitersController waitersController = new WaitersController();
                waitersController.update_Rooms(jtf1.getText(),jtf2.getText());
            }
        });

        frame.setVisible(true);
    }

}
