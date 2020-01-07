package view.customer;

import daoimpl.CustomersController;
import daoimpl.WaitersController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agent_update_DepartTime {
    Agent_update_DepartTime(final String account){
        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Agent_update_DepartTime");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("完成");
        button1.setSize(100,40);
        button1.setLocation(150,300);
        frame.add(button1);

        final JTextField jtf1 = new JTextField("请输入离店时间",16);
        jtf1.setBounds(50, 100, 200, 30);
        frame.add(jtf1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomersController customersController = new CustomersController();
                customersController.update_Customer(account,jtf1.getText());
                frame.setVisible(false);
            }
        });

        frame.setVisible(true);
    }

}
