package view.waiter;

import daoimpl.WaitersController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Agent_delete {
    Agent_delete() {
        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Agent_delete");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("完成");
        button1.setSize(100,40);
        button1.setLocation(150,200);
        frame.add(button1);

        final JTextField jtf = new JTextField("请输入您要删除的客户编号",16);
        jtf.setBounds(50, 100, 200, 30);
        frame.add(jtf);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WaitersController waitersController = new WaitersController();
                waitersController.delete_Customer(jtf.getText());
                frame.setVisible(false);
            }
        });

        frame.setVisible(true);
    }
}
