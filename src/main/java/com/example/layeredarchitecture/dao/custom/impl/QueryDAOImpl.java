package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {

    @Override
    public boolean joinCustomerNorders(OrderDTO dto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT c.id, c.name, c.address , o.oid, o.date\n" +
                "FROM customer c\n" +
                "         LEFT JOIN orders o\n" +
                "                   ON c.id = o.customerID;");
        stm.setString(1, dto.getCustomerId());
        stm.setString(2, dto.getCustomerName());
        stm.setString(3, dto.getOrderId());
        stm.setString(4, dto.getOrderId());
        stm.setDate(5, Date.valueOf(dto.getOrderDate()));


        return stm.executeQuery().next();
    }
}
