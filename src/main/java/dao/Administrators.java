package dao;


import java.sql.ResultSet;
import java.util.List;

public interface Administrators {
    //增加服务员
    void add_Waiter(String HWnumber,String HWpassword,String HWname,String HWgender,String HWage,String PoliticalOutlook,String HWIDnumber,String HWphone,String EntryDate,String HWsalary,String HAnumber,String HRnumber);
    //增加客房物品
    void add_HotelGoods();
    //增加酒店信息
    void add_HotelMessage();
    //增加客房信息
    void add_Rooms();
    //发布工作安排
    void add_WorkArrangement();
    //增加入住情况
    void add_LIvingCondition();

    //删除服务员信息
    void delete_Waiter();
    //删除客房物品信息
    void delete_HotelGoods();
    //删除酒店信息
    void delete_HotelMessage();
    //删除客房信息
    void delete_Rooms();
    //删除工作安排
    void delete_WorkArrangement();
    //删除入住情况
    void delete_LIvingCondition();

    //更新服务员信息
    void update_Waiter(String HWnumber);
    //更新顾客信息
    void update_Customer(String Cnumber);
    //更新客房物品信息
    void update_HotelGoods(String RGnumber);
    //更新酒店信息
    void update_HotelMessage(String HMnumber);
    //更新客房信息
    void update_Rooms(String HRnumber);
    //更新工作安排
    void update_WorkArrangement(String WAnumber);
    //更新入住情况
    void update_LIvingCondition(String HRnumber,String Cnumber);

    //查询服务员信息
    ResultSet find_Waiter(String HWnumber);
    //查询顾客信息
    ResultSet find_Customer(String Cnumber);
    //查询工作安排
    ResultSet find_WorkArrangement(String WAnumber);
    //查询入住情况
    ResultSet find_LIvingCondition(String HRnumber,String Cnumber);
}
