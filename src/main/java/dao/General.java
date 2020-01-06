package dao;

import pojo.*;

import java.sql.ResultSet;

public interface General {
    //查询酒店信息
    ResultSet find_HotelMessage();
    //查询客房物品信息
    ResultSet find_HotelGoods();
    //查询客房信息
    ResultSet find_Rooms();
}
