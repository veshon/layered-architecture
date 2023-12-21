package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface QueryDAO {

    boolean joinCustomerNorders(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
