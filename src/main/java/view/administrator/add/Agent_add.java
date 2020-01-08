package view.administrator.add;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agent_add {
    public Agent_add(){
        final JFrame frame = new JFrame();
        frame.setBounds(500,100,600,600);
        frame.setTitle("Agent_add");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("增加服务员");
        JButton button2 = new JButton("增加客房物品");
        JButton button3 = new JButton("增加酒店信息");
        JButton button4 = new JButton("增加客房信息");
        JButton button5 = new JButton("发布工作安排");
        JButton button6 = new JButton("增加入住情况");
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

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_Waiters();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_RoomGoods();
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_HotelMessage();
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_RoomMessage();
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_WorkArrangement();
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new add_LivingCondition();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Agent_add();
    }
}
