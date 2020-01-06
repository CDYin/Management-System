package daoimpl;

import dao.Customers;
import dao.General;
import dao.Waiters;
import pojo.RoomGoods;
import pojo.Rooms;
import pojo.WorkArrangement;

import java.sql.ResultSet;

public class WaitersController implements Waiters, General {
    public void update_Rooms(String HRnumber) {

    }

    public void update_HotelGoods(String RGnumber) {

    }

    public ResultSet find_Waiter(String HWnumber) {
        Connectionsql connectionsql = new Connectionsql();
        ResultSet rs = connectionsql.jdbc("select * from HotelWaiter" +
                " where HotelWaiter.HWnumber='"+HWnumber+"' ");
        return rs;
    }

    public ResultSet find_WorkArrangement(String WAnumber) {
        Connectionsql connectionsql = new Connectionsql();
        return null;
    }

    public ResultSet find_Customer(String Cnumber) {
        Connectionsql connectionsql = new Connectionsql();
        return null;
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
