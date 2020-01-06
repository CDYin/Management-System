package view.waiter;

import daoimpl.WaitersController;
import pojo.RoomGoods;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Work {
    Work() {
        final JFrame frame = new JFrame();
        frame.setBounds(500,20,1000,1000);
        frame.setTitle("Customer-Login");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("查询");
        JButton button2 = new JButton("编辑");
        JButton button3 = new JButton("删除");
        button1.setSize(100,40);
        button1.setLocation(800,80);
        button2.setSize(100,40);
        button2.setLocation(500,850);
        button3.setSize(100,40);
        button3.setLocation(700,850);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        JLabel jLabel = new JLabel("查询信息:");
        String[] message = {"酒店信息","物品信息","客房信息","工资信息","工作安排","顾客信息"};
        final JComboBox jComboBox = new JComboBox(message);
        jLabel.setBounds(300,80,70,40);
        jComboBox.setBounds(400,80,360,40);
        frame.add(jLabel);
        frame.add(jComboBox);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String content = (String) jComboBox.getSelectedItem();
                assert content != null;
                if (content.equals("酒店信息")){
                    DefaultTableModel model=new DefaultTableModel();
                    WaitersController waitersController = new WaitersController();
                    model.setColumnIdentifiers(new Object[]{"信息编号","顾客评论","节日信息","优惠折扣","餐饮时间","服务时间"});
                    ResultSet rs = waitersController.find_HotelMessage();
                    while(true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                        try {
                            String HMnumber = rs.getString("HMnumber");
                            String Ccomment = rs.getString("Ccomment");
                            String FestivalMessage = rs.getString("FestivalMessage");
                            String Discount = rs.getString("Discount");
                            String DiningTime = rs.getString("DiningTime");
                            String ServiceTime = rs.getString("ServiceTime");
                            model.addRow(new Object[]{HMnumber, Ccomment, FestivalMessage, Discount, DiningTime, ServiceTime});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                            JTable jTable = new JTable(model);
                            JScrollPane jScrollPane = new JScrollPane(jTable);
                            jScrollPane.setBounds(300,260,600,500);
                            frame.add(jScrollPane);
                    }
                }else if (content.equals("物品信息")){
                    DefaultTableModel model=new DefaultTableModel();
                    WaitersController waitersController = new WaitersController();
                    model.setColumnIdentifiers(new Object[]{"物品编号","客房编号","使用数量","损坏情况","备注","更新时间","更新人编号"});
                    ResultSet rs = waitersController.find_HotelGoods();
                    while(true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                        try {
                            String RGnumber = rs.getString("RGnumber");
                            String HRnumber = rs.getString("HRnumber");
                            String UseAmount = rs.getString("UseAmount");
                            String DamageConditions = rs.getString("DamageConditions");
                            String RGMnote = rs.getString("RGMnote");
                            String UpdateTime = rs.getString("UpdateTime");
                            String UpdatePersonNumber = rs.getString("UpdatePersonNumber");
                            model.addRow(new Object[]{RGnumber, HRnumber, UseAmount, DamageConditions, RGMnote,UpdateTime,UpdatePersonNumber});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300,260,600,500);
                        frame.add(jScrollPane);
                    }
                }else if (content.equals("客房信息")){
                    DefaultTableModel model=new DefaultTableModel();
                    WaitersController waitersController = new WaitersController();
                    model.setColumnIdentifiers(new Object[]{"客房编号","客房类型编号","客房设施编号","客房状态","客房价格"});
                    ResultSet rs = waitersController.find_Rooms();
                    while(true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        try {
                            String HRnumber = rs.getString("HRnumber");
                            String HRTnumber = rs.getString("HRTnumber");
                            String HRFnumber = rs.getString("HRFnumber");
                            String HRstate = rs.getString("HRstate");
                            String HRprice = rs.getString("HRprice");
                            model.addRow(new Object[]{HRnumber, HRTnumber, HRFnumber, HRstate, HRprice});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300,260,600,500);
                        frame.add(jScrollPane);
                    }
                }
                else if (content.equals("工资信息")){
                    DefaultTableModel model=new DefaultTableModel();
                    WaitersController waitersController = new WaitersController();
                    Login login = new Login();
                    model.setColumnIdentifiers(new Object[]{"绩效考核结果","工资","负责人员编号","更新时间","更新人编号"});
                    ResultSet rs = waitersController.find_Waiter(login.getHWnumber());
                    while(true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        try {
                            String PerformanceAppraisal = rs.getString("PerformanceAppraisal");
                            String HWsalary = rs.getString("HWsalary");
                            String HAnumber = rs.getString("HAnumber");
                            String UpdateTime = rs.getString("UpdateTime");
                            String UpdatePersonNumber = rs.getString("UpdatePersonNumber");
                            model.addRow(new Object[]{PerformanceAppraisal, HWsalary, HAnumber, UpdateTime, UpdatePersonNumber});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300,260,600,500);
                        frame.add(jScrollPane);
                    }
                }
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Work();
    }
}
