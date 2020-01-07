package view.customer;

import javax.swing.*;

public class Error {
    Error(){
        JFrame frame = new JFrame();
        frame.setBounds(700,300,200,200);
        frame.setTitle("Customer-Error");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel j1 = new JLabel("编号不存在或密码错误");
        j1.setBounds(20,60,150,20);
        frame.add(j1);

        frame.setVisible(true);
    }

}
