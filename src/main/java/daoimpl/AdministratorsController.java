package daoimpl;

import dao.Administrators;
import dao.General;


import java.sql.ResultSet;


public class AdministratorsController implements Administrators, General {

    public void add_Administrators(String HAnumber, String HApassword, String HAname, String HAgender, String HAage, String PoliticalOutlook, String HAIDnumber, String HAphone, String EntryDate, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into HotelAdministrators values('"+HAnumber+"','"+HApassword+"','"+HAname+"','"+HAgender+"','"+HAage+"','"+PoliticalOutlook+"','"+HAIDnumber+"','"+HAphone+"','"+EntryDate+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void add_Waiter(String HWnumber, String HWpassword, String HWname, String HWgender, String HWage, String PoliticalOutlook, String HWIDnumber, String HWphone, String EntryDate, String HWsalary, String HAnumber, String HRnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into HotelWaiter values('"+HWnumber+"','"+HWpassword+"','"+HWname+"','"+HWgender+"','"+HWage+"','"+PoliticalOutlook+"','"+HWIDnumber+"','"+HWphone+"',null,'"+EntryDate+"',null,'"+HWsalary+"','"+HAnumber+"','"+HRnumber+"',null,null)");
    }

    public void add_HotelGoods(String RGnumber, String RGname, String RGlocation, String RGamount, String RGstoragelocation, String RGnote, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into RoomGoods values('"+RGnumber+"','"+RGname+"','"+RGlocation+"','"+RGamount+"','"+RGstoragelocation+"','"+RGnote+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void add_HotelMessage(String HMnumber, String Ccomment, String Cevaluate, String FestivalMessage, String Discount, String DiningTime, String ServiceTime, String HAnumber, String UpdateTime) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into HotelMessage values('"+HMnumber+"','"+Ccomment+"','"+Cevaluate+"','"+FestivalMessage+"','"+Discount+"','"+DiningTime+"','"+ServiceTime+"','"+HAnumber+"','"+UpdateTime+"')");
    }

    public void add_Rooms(String HRnumber, String HRTnumber, String HRFnumber, String HRstate, String HRprice, String HWnumber, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into HotelRooms values('"+HRnumber+"','"+HRTnumber+"','"+HRFnumber+"','"+HRstate+"','"+HRprice+"','"+HWnumber+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void add_WorkArrangement(String WAnumber, String HWnumber, String WAarrangement, String Finish, String WAnote, String HAnumber, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into WorkArrangement values('"+WAnumber+"','"+HWnumber+"','"+WAarrangement+"','"+Finish+"','"+WAnote+"','"+HAnumber+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void add_LIvingCondition(String HRnumber, String Cnumber, String CheckNumber, String CheckTime, String DepartureTime, String Evaluate, String LCnote, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("insert into LivingCondition values('"+HRnumber+"','"+Cnumber+"','"+CheckNumber+"','"+CheckTime+"','"+DepartureTime+"','"+Evaluate+"','"+LCnote+"','"+UpdateTime+"','"+UpdatePersonNumber+"')");
    }

    public void delete_Waiter(String account) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from HotelWaiter where HWnumber = '"+account+"'");
    }

    public void delete_HotelGoods(String RGnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from RoomGoods where RGnumber = '"+RGnumber+"'");
    }

    public void delete_HotelMessage(String HMnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from HotelMessage where HMnumber = '"+HMnumber+"'");
    }

    public void delete_Rooms(String HRnumber,String HRTnumber,String HRFnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from HotelRooms where HRnumber = '"+HRnumber+"' and HRTnumber = '"+HRTnumber+"' and HRFnumber = '"+HRFnumber+"'");
    }

    public void delete_WorkArrangement(String WAnumber, String HWnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from WorkArrangement where WAnumber = '"+WAnumber+"' and HWnumber = '"+HWnumber+"'");
    }

    public void delete_LivingCondition(String HRnumber, String Cnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("delete from LivingCondition where HRnumber = '"+HRnumber+"' and Cnumber = '"+Cnumber+"'");
    }

    public void update_Waiter(String HWnumber, String HWpassword, String HWname, String HWgender, String HWage, String PoliticalOutlook, String HWIDnumber, String HWphone, String EntryDate, String HWsalary, String HAnumber, String HRnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update HotelWaiter set HWpassword = '"+HWpassword+"',HWname = '"+HWname+"',HWgender = '"+HWgender+"',HWage = '"+HWage+"',PoliticalOutlook = '"+PoliticalOutlook+"',HWIDnumber = '"+HWIDnumber+"',HWphone = '"+HWphone+"',EntryDate = '"+EntryDate+"',HWsalary = '"+HWsalary+"',HAnumber = '"+HAnumber+"',HRnumber = '"+HRnumber+"' where HWnumber = '"+HWnumber+"'");
    }

    public void update_Customer(String Cnumber,String Caccount,String Cpassword,String Cname,String Cgender,String CIDnumber,String Cphone,String HRnumber,String ExpectedOccupancyDays,String ExpectedCheckTime,String ExpectedDepartureTime,String BreakfastService,String MorningCallService,String Deposit,String HotelExpense) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update Customer set Caccount = '"+Caccount+"',Cpassword = '"+Cpassword+"',Cname = '"+Cname+"',Cgender = '"+Cgender+"',CIDnumber = '"+CIDnumber+"',Cphone = '"+Cphone+"',HRnumber = '"+HRnumber+"',ExpectedOccupancyDays = '"+ExpectedOccupancyDays+"',ExpectedCheckTime = '"+ExpectedCheckTime+"',ExpectedDepartureTime = '"+ExpectedDepartureTime+"',BreakfastService = '"+BreakfastService+"',MorningCallService = '"+MorningCallService+"',Deposit = '"+Deposit+"',HotelExpense = '"+HotelExpense+"' where Cnumber = '"+Cnumber+"'");
    }

    public void update_HotelGoods(String RGnumber,String RGname,String RGlocation,String RGamount,String RGstoragelocation,String RGnote,String UpdateTime,String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update RoomGoods set RGname = '"+RGname+"',RGlocation = '"+RGlocation+"',RGamount = '"+RGamount+"',RGstoragelocation = '"+RGstoragelocation+"',RGnote = '"+RGnote+"',UpdateTime = '"+UpdateTime+"',UpdatePersonNumber = '"+UpdatePersonNumber+"' where RGnumber = '"+RGnumber+"'");
    }

    public void update_HotelMessage(String HMnumber,String Ccomment,String Cevaluate,String FestivalMessage,String Discount,String DiningTime,String ServiceTime,String HAnumber,String UpdateTime) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update HotelMessage set Ccomment = '"+Ccomment+"',Cevaluate = '"+Cevaluate+"',FestivalMessage = '"+FestivalMessage+"',Discount = '"+Discount+"',DiningTime = '"+DiningTime+"',ServiceTime = '"+ServiceTime+"',HAnumber = '"+HAnumber+"',UpdateTime = '"+UpdateTime+"' where HMnumber = '"+HMnumber+"'");
    }

    public void update_Rooms(String HRnumber, String HRTnumber, String HRFnumber, String HRstate, String HRprice, String HWnumber, String UpdateTime, String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update HotelRooms set HRTnumber = '"+HRTnumber+"',HRFnumber = '"+HRFnumber+"',HRstate = '"+HRstate+"',HRprice = '"+HRprice+"',HWnumber = '"+HWnumber+"',UpdateTime = '"+UpdateTime+"',UpdatePersonNumber = '"+UpdatePersonNumber+"' where HRnumber = '"+HRnumber+"'");
    }

    public void update_WorkArrangement(String WAnumber,String HWnumber,String WAarrangement,String Finish,String WAnote,String HAnumber,String UpdateTime,String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update WorkArrangement set HWnumber = '"+HWnumber+"',WAarrangement = '"+WAarrangement+"',Finish = '"+Finish+"',WAnote = '"+WAnote+"',HAnumber = '"+HAnumber+"',UpdateTime = '"+UpdateTime+"',UpdatePersonNumber = '"+UpdatePersonNumber+"' where WAnumber = '"+WAnumber+"'");
    }

    public void update_LIvingCondition(String HRnumber,String Cnumber,String CheckNumber,String CheckTime,String DepartureTime,String Evaluate,String LCnote,String UpdateTime,String UpdatePersonNumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc1("update LivingCondition set CheckNumber = '"+CheckNumber+"',CheckTime = '"+CheckTime+"',DepartureTime = '"+DepartureTime+"',Evaluate = '"+Evaluate+"',LCnote = '"+LCnote+"',UpdateTime = '"+UpdateTime+"',UpdatePersonNumber = '"+UpdatePersonNumber+"' where HRnumber = '"+HRnumber+"' and Cnumber = '"+Cnumber+"'");
    }

    public ResultSet find_Waiter() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from HotelWaiter");
        return rs;
    }

    public ResultSet find_Customer() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from Customer");
        return rs;
    }

    public ResultSet find_WorkArrangement() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from WorkArrangement");
        return rs;
    }

    public ResultSet find_LIvingCondition() {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from LivingCondition");
        return rs;
    }

    public ResultSet Verification(String account, String password) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from HotelAdministrators where HAnumber = '"+account+"' and HApassword = '"+password+"'");
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
