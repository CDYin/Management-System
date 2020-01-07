package daoimpl;

import dao.General;
import dao.Waiters;

import java.sql.ResultSet;

public class WaitersController implements Waiters, General {
    public void update_Rooms(String HRnumber,String HRstate) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc("update HotelRooms set HRstate = '"+HRstate+"' where HRnumber = '"+HRnumber+"'");
    }

    public void update_HotelGoods(String RGnumber,String HRnumber,String UseAmount,String DamageConditions,String RGMnote,String UpdateTime,String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc("insert into RoomGoodsMessage values('"+RGnumber+"','"+HRnumber+"','"+UseAmount+"','"+DamageConditions+"','"+RGMnote+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void add_Customer(String Cnumber, String Caccount, String Cpassword, String Cname, String Cgender, String CIDnumber, String Cphone, String HRnumber, String ExpectedOccupancyDays, String ExpectedCheckTime, String ExpectedDepartureTime, String BreakfastService, String MorningCallService, String Deposit, String HotelExpense) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc("insert into Customer values('"+Cnumber+"','"+Caccount+"','"+Cpassword+"','"+Cname+"','"+Cgender+"','"+CIDnumber+"','"+Cphone+"','"+HRnumber+"','"+ExpectedOccupancyDays+"','"+ExpectedCheckTime+"','"+ExpectedDepartureTime+"','"+BreakfastService+"','"+MorningCallService+"','"+Deposit+"','"+HotelExpense+"',null,null)");
    }

    public ResultSet find_Waiter(String HWnumber) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from HotelWaiter where HWnumber='"+HWnumber+"'");
        return rs;
    }

    public ResultSet find_WorkArrangement(String WAnumber) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from WorkArrangement where HWnumber='"+WAnumber+"'");
        return rs;
    }

    public ResultSet find_Customer() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from Customer");
        return rs;
    }

    public void delete_Customer(String Cnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc("delete from Customer where Cnumber = '"+Cnumber+"'");
    }

    public ResultSet Verification(String account, String password) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select HWsalary from HotelWaiter where HWnumber = '"+account+"' and HWpassword = '"+password+"'");
        return rs;
    }

    public ResultSet find_HotelMessage() {
        Connectionsql connectionsql = new Connectionsql();
        return connectionsql.jdbc("select * from HotelMessage");
    }

    public ResultSet find_HotelGoods() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from RoomGoodsMessage");
        return rs;
    }

    public ResultSet find_Rooms() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from HotelRooms");
        return rs;
    }
}
