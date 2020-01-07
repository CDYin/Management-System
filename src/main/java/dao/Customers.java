package dao;

public interface Customers {
    //更新顾客信息(餐饮，叫早，续订)
    void update_Customer(String Cnumber,String DepartTime);
    //增加顾客
    void add_Customer(String Cnumber,String Caccount,String Cpassword,String Cname,String Cgender,String CIDnumber,String Cphone,String HRnumber,String ExpectedOccupancyDays,String ExpectedCheckTime,String ExpectedDepartureTime,String BreakfastService,String MorningCallService,String Deposit,String HotelExpense);
}
