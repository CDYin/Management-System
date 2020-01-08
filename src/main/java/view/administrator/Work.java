package view.administrator;

import daoimpl.AdministratorsController;
import daoimpl.WaitersController;
import view.administrator.add.Agent_add;
import view.administrator.update.Agent_update;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Work {
    Work(String account){
        final JFrame frame = new JFrame();
        frame.setBounds(500,20,1000,1000);
        frame.setTitle("Waiters-Work");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("查询");
        JButton button2 = new JButton("添加");
        JButton button3 = new JButton("编辑");
        JButton button4 = new JButton("删除");
        button1.setSize(100,40);
        button1.setLocation(800,80);
        button2.setSize(100,40);
        button2.setLocation(300,850);
        button3.setSize(100,40);
        button3.setLocation(420,850);
        button4.setSize(100,40);
        button4.setLocation(540,850);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        JLabel jLabel = new JLabel("查询信息:");
        String[] message = {"酒店信息","物品信息","客房信息","服务员信息","顾客信息","工作安排","入住情况"};
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
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"信息编号","顾客评论","节日信息","优惠折扣","餐饮时间","服务时间"});
                    ResultSet rs = administratorsController.find_HotelMessage();
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
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"物品编号","客房编号","使用数量","损坏情况","备注","更新时间","更新人编号"});
                    ResultSet rs = administratorsController.find_HotelGoods();
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
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"客房编号","客房类型编号","客房设施编号","客房状态","客房价格"});
                    ResultSet rs = administratorsController.find_Rooms();
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
                }else if (content.equals("服务员信息")) {
                    DefaultTableModel model = new DefaultTableModel();
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"服务员编号", "姓名", "性别", "年龄", "政治面貌", "身份证号","联系电话",});
                    ResultSet rs = administratorsController.find_Waiter();
                    while (true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                        try {
                            String HWnumber = rs.getString("HWnumber");
                            String HWname = rs.getString("HWname");
                            String HWgender = rs.getString("HWgender");
                            String HWage = rs.getString("HWage");
                            String PoliticalOutlook = rs.getString("PoliticalOutlook");
                            String HWIDnumber = rs.getString("HWIDnumber");
                            String HWphone = rs.getString("HWphone");
                            model.addRow(new Object[]{HWnumber, HWname, HWgender, HWage, PoliticalOutlook, HWIDnumber,HWphone});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300, 260, 600, 500);
                        frame.add(jScrollPane);
                    }
                } else if (content.equals("顾客信息")) {
                    DefaultTableModel model = new DefaultTableModel();
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"客户编号", "姓名", "性别", "身份证号", "联系电话", "入住客房编号", "早餐","叫早","押金","住宿费"});
                    ResultSet rs = administratorsController.find_Customer();
                    while (true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                        try {
                            String Cnumber = rs.getString("Cnumber");
                            String Cname = rs.getString("Cname");
                            String Cgender = rs.getString("Cgender");
                            String CIDnumber = rs.getString("CIDnumber");
                            String Cphone = rs.getString("Cphone");
                            String HRnumber = rs.getString("HRnumber");
                            String BreakfastService = rs.getString("BreakfastService");
                            String MorningCallService = rs.getString("MorningCallService");
                            String Deposit = rs.getString("Deposit");
                            String HotelExpense = rs.getString("HotelExpense");
                            model.addRow(new Object[]{Cnumber, Cname, Cgender, CIDnumber, Cphone, HRnumber, BreakfastService,MorningCallService,Deposit,HotelExpense});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300, 260, 600, 500);
                        frame.add(jScrollPane);
                    }
                } else if (content.equals("工作安排")) {
                    DefaultTableModel model = new DefaultTableModel();
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"工作编号", "员工编号", "每日工作安排", "是否完成", "备注"});
                    ResultSet rs = administratorsController.find_WorkArrangement();
                    while (true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        try {
                            String WAnumber = rs.getString("WAnumber");
                            String HWnumber = rs.getString("HWnumber");
                            String WAarrangement = rs.getString("WAarrangement");
                            String Finish = rs.getString("Finish");
                            String WAnote = rs.getString("WAnote");
                            model.addRow(new Object[]{WAnumber, HWnumber, WAarrangement, Finish, WAnote});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300, 260, 600, 500);
                        frame.add(jScrollPane);
                    }
                } else if (content.equals("入住情况")) {
                    DefaultTableModel model = new DefaultTableModel();
                    AdministratorsController administratorsController = new AdministratorsController();
                    model.setColumnIdentifiers(new Object[]{"入住客房编号", "入住客户编号", "入住人数", "入住时间", "离店时间","客户评价"});
                    ResultSet rs = administratorsController.find_LIvingCondition();
                    while (true) {
                        try {
                            if (!rs.next()) break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        try {
                            String HRnumber = rs.getString("HRnumber");
                            String Cnumber = rs.getString("Cnumber");
                            String CheckNumber = rs.getString("CheckNumber");
                            String CheckTime = rs.getString("CheckTime");
                            String DepartureTime = rs.getString("DepartureTime");
                            String Evaluate = rs.getString("Evaluate");
                            model.addRow(new Object[]{HRnumber, Cnumber, CheckNumber, CheckTime, DepartureTime,Evaluate});
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JTable jTable = new JTable(model);
                        JScrollPane jScrollPane = new JScrollPane(jTable);
                        jScrollPane.setBounds(300, 260, 600, 500);
                        frame.add(jScrollPane);
                    }
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Agent_add();
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Agent_update();
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Agent_delete();
            }
        });
        frame.setVisible(true);
    }

}
