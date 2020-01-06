package dao;

import pojo.*;

import java.util.List;

public interface Administrators {
    //增加服务员
    void add_Waiter();
    //增加顾客
    void add_Customer();
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
    //删除顾客信息
    void delete_Customer();
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

    //续订酒店
    void RenewalHotel(Customers Cnumber);
    //更新服务员信息
    void update_Waiter(Waiters HWnumber);
    //更新顾客信息
    void update_Customer(Customers Cnumber);
    //更新客房物品信息
    void update_HotelGoods(RoomGoods RGnumber);
    //更新酒店信息
    void update_HotelMessage(HotelMessage HMnumber);
    //更新客房信息
    void update_Rooms(Rooms HRnumber);
    //更新工作安排
    void update_WorkArrangement(WorkArrangement WAnumber);
    //更新入住情况
    void update_LIvingCondition(LivingCondition HRnumber,LivingCondition Cnumber);

    //查询服务员信息
    List<String> find_Waiter(Waiters HWnumber);
    //查询顾客信息
    List<String> find_Customer(Customers Cnumber);
    //查询工作安排
    List<String> find_WorkArrangement(WorkArrangement WAnumber);
    //查询入住情况
    void find_LIvingCondition(LivingCondition HRnumber,LivingCondition Cnumber);
}
