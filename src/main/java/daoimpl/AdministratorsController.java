package daoimpl;

import dao.Administrators;
import dao.Customers;
import dao.Waiters;
import pojo.*;

import java.util.List;

public class AdministratorsController implements Administrators {

    public void add_Waiter(String HWnumber, String HWpassword, String HWname, String HWgender, String HWage, String PoliticalOutlook, String HWIDnumber, String HWphone, String EntryDate, String HWsalary, String HAnumber, String HRnumber) {
        Connectionsql connectionsql = new Connectionsql();
        connectionsql.jdbc("insert into HotelWaiter values('"+HWnumber+"','"+HWpassword+"','"+HWname+"','"+HWgender+"','"+HWage+"','"+PoliticalOutlook+"','"+HWIDnumber+"','"+HWphone+"',null,'"+EntryDate+"',null,'"+HWsalary+"','"+HAnumber+"','"+HRnumber+"',null,null)");
    }

    public void add_HotelGoods() {

    }

    public void add_HotelMessage() {

    }

    public void add_Rooms() {

    }

    public void add_WorkArrangement() {

    }

    public void add_LIvingCondition() {

    }

    public void delete_Waiter() {

    }

    public void delete_HotelGoods() {

    }

    public void delete_HotelMessage() {

    }

    public void delete_Rooms() {

    }

    public void delete_WorkArrangement() {

    }

    public void delete_LIvingCondition() {

    }

    public void RenewalHotel(Customers Cnumber) {

    }

    public void update_Waiter(Waiters HWnumber) {

    }

    public void update_Customer(Customers Cnumber) {

    }

    public void update_HotelGoods(RoomGoods RGnumber) {

    }

    public void update_HotelMessage(HotelMessage HMnumber) {

    }

    public void update_Rooms(Rooms HRnumber) {

    }

    public void update_WorkArrangement(WorkArrangement WAnumber) {

    }

    public void update_LIvingCondition(LivingCondition HRnumber, LivingCondition Cnumber) {

    }

    public List<String> find_Waiter(Waiters HWnumber) {
        return null;
    }

    public List<String> find_Customer(Customers Cnumber) {
        return null;
    }

    public List<String> find_WorkArrangement(WorkArrangement WAnumber) {
        return null;
    }

    public void find_LIvingCondition(LivingCondition HRnumber, LivingCondition Cnumber) {

    }
}
