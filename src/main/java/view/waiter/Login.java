package view.waiter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{
    private String HWnumber;
    private char[] Password;

    public String getHWnumber() {
        return HWnumber;
    }

    public void setHWnumber(String HWnumber) {
        this.HWnumber = HWnumber;
    }

    public char[] getPassword() {
        return Password;
    }

    public void setPassword(char[] password) {
        Password = password;
    }

    public static void main(String[] args) {

        final JFrame frame = new JFrame();
        frame.setBounds(700,300,400,400);
        frame.setTitle("Customer-Login");
        frame.setLayout(null);

        JButton button1 = new JButton("登录");
        JButton button2 = new JButton("注册");
        button1.setSize(100,40);
        button1.setLocation(80,250);
        button2.setSize(100,40);
        button2.setLocation(220,250);
        frame.add(button1);
        frame.add(button2);

        JLabel j1 = new JLabel("员工编号：");
        JLabel j2 = new JLabel("密     码：");
        j1.setBounds(100,100,70,20);
        j2.setBounds(100,140,70,20);
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
                Login login = new Login();
                login.setHWnumber(jtf.getText());
                login.setPassword(jpf.getPassword());
                System.out.println(login.getHWnumber());
                System.out.println(login.getPassword());
                frame.setVisible(false);
                new Work();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
