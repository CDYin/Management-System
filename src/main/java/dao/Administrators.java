package dao;


import java.sql.ResultSet;

public interface Administrators {
    //增加管理员
    void add_Administrators(String HAnumber,String HApassword,String HAname,String HAgender,String HAage,String PoliticalOutlook,String HAIDnumber,String HAphone,String EntryDate,String UpdateTime,String UpdatePersonNumber);
    //增加服务员
    void add_Waiter(String HWnumber,String HWpassword,String HWname,String HWgender,String HWage,String PoliticalOutlook,String HWIDnumber,String HWphone,String EntryDate,String HWsalary,String HAnumber,String HRnumber);
    //增加客房物品
    void add_HotelGoods(String RGnumber,String RGname,String RGlocation,String RGamount,String RGstoragelocation,String RGnote,String UpdateTime,String UpdatePersonNumber);
    //增加酒店信息
    void add_HotelMessage(String HMnumber,String Ccomment,String Cevaluate,String FestivalMessage,String Discount,String DiningTime,String ServiceTime,String HAnumber,String UpdateTime);
    //增加客房信息
    void add_Rooms(String HRnumber,String HRTnumber,String HRFnumber,String HRstate,String HRprice,String HWnumber,String UpdateTime,String UpdatePersonNumber);
    //发布工作安排
    void add_WorkArrangement(String WAnumber,String HWnumber,String WAarrangement,String Finish,String WAnote,String HAnumber,String UpdateTime,String UpdatePersonNumber);
    //增加入住情况
    void add_LIvingCondition(String HRnumber,String Cnumber,String CheckNumber,String CheckTime,String DepartureTime,String Evaluate,String LCnote,String UpdateTime,String UpdatePersonNumber);

    //删除服务员信息
    void delete_Waiter(String account);
    //删除客房物品信息
    void delete_HotelGoods(String RGnumber);
    //删除酒店信息
    void delete_HotelMessage(String HMnumber);
    //删除客房信息
    void delete_Rooms(String HRnumber,String HRTnumber,String HRFnumber);
    //删除工作安排
    void delete_WorkArrangement(String WAnumber,String HWnumber);
    //删除入住情况
    void delete_LivingCondition(String HRnumber,String Cnumber);

    //更新服务员信息
    void update_Waiter(String HWnumber, String HWpassword, String HWname, String HWgender, String HWage, String PoliticalOutlook, String HWIDnumber, String HWphone, String EntryDate, String HWsalary, String HAnumber, String HRnumber);
    //更新顾客信息
    void update_Customer(String Cnumber,String Caccount,String Cpassword,String Cname,String Cgender,String CIDnumber,String Cphone,String HRnumber,String ExpectedOccupancyDays,String ExpectedCheckTime,String ExpectedDepartureTime,String BreakfastService,String MorningCallService,String Deposit,String HotelExpense);
    //更新客房物品信息
    void update_HotelGoods(String RGnumber,String RGname,String RGlocation,String RGamount,String RGstoragelocation,String RGnote,String UpdateTime,String UpdatePersonNumber);
    //更新酒店信息
    void update_HotelMessage(String HMnumber,String Ccomment,String Cevaluate,String FestivalMessage,String Discount,String DiningTime,String ServiceTime,String HAnumber,String UpdateTime);
    //更新客房信息
    void update_Rooms(String HRnumber, String HRTnumber, String HRFnumber, String HRstate, String HRprice, String HWnumber, String UpdateTime, String UpdatePersonNumber);
    //更新工作安排
    void update_WorkArrangement(String WAnumber,String HWnumber,String WAarrangement,String Finish,String WAnote,String HAnumber,String UpdateTime,String UpdatePersonNumber);
    //更新入住情况
    void update_LIvingCondition(String HRnumber,String Cnumber,String CheckNumber,String CheckTime,String DepartureTime,String Evaluate,String LCnote,String UpdateTime,String UpdatePersonNumber);

    //查询服务员信息
    ResultSet find_Waiter();
    //查询顾客信息
    ResultSet find_Customer();
    //查询工作安排
    ResultSet find_WorkArrangement();
    //查询入住情况
    ResultSet find_LIvingCondition();
}
