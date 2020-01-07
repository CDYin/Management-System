package dao;


import java.sql.ResultSet;

public interface Waiters {
    //提交退房结果
    void update_Rooms(String HRnumber,String HRstate);
    //更新客房物品信息
    void update_HotelGoods(String RGnumber,String HRnumber,String UseAmount,String DamageConditions,String RGMnote,String UpdateTime,String UpdatePersonNumber);

    //增加顾客
    void add_Customer(String Cnumber,String Caccount,String Cpassword,String Cname,String Cgender,String CIDnumber,String Cphone,String HRnumber,String ExpectedOccupancyDays,String ExpectedCheckTime,String ExpectedDepartureTime,String BreakfastService,String MorningCallService,String Deposit,String HotelExpense);

    //查询服务员工资信息
    ResultSet find_Waiter(String HWnumber);
    //查询工作安排
    ResultSet find_WorkArrangement(String WAnumber);
    //查询顾客信息
    ResultSet find_Customer();

    //删除顾客信息
    void delete_Customer(String Cnumber);
}
