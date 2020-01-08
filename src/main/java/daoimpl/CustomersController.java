package daoimpl;

import dao.Customers;
import dao.General;

import java.sql.ResultSet;

public class CustomersController implements Customers, General {
    public void update_Customer(String Cnumber,String DepartTime) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update Customer set ExpectedDepartureTime = '"+DepartTime+"' where Caccount = '"+Cnumber+"'");
    }

    public void add_Customer(String Cnumber, String Caccount, String Cpassword, String Cname, String Cgender, String CIDnumber, String Cphone, String HRnumber, String ExpectedOccupancyDays, String ExpectedCheckTime, String ExpectedDepartureTime, String BreakfastService, String MorningCallService, String Deposit, String HotelExpense) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into Customer values('"+Cnumber+"','"+Caccount+"','"+Cpassword+"','"+Cname+"','"+Cgender+"','"+CIDnumber+"','"+Cphone+"','"+HRnumber+"','"+ExpectedOccupancyDays+"','"+ExpectedCheckTime+"','"+ExpectedDepartureTime+"','"+BreakfastService+"','"+MorningCallService+"','"+Deposit+"','"+HotelExpense+"',null,null)");
    }

    public ResultSet Verification(String account, String password) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from Customer where Caccount = '"+account+"' and Cpassword = '"+password+"'");
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
