package dao;

import pojo.*;

import java.sql.ResultSet;

public interface Waiters {
    //提交退房结果
    void update_Rooms(String HRnumber);
    //更新客房物品信息
    void update_HotelGoods(String RGnumber);

    //查询服务员工资信息
    ResultSet find_Waiter(String HWnumber);
    //查询工作安排
    ResultSet find_WorkArrangement(String WAnumber);
    //查询顾客信息
    ResultSet find_Customer(String Cnumber);
}
