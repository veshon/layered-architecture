package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;

     boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

     boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

     public void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

     String genarateId() throws SQLException, ClassNotFoundException;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

     boolean existCustomerId(String id) throws SQLException, ClassNotFoundException ;

     //TableView<Object> cmbCustomerId(TableView<Object> cmbCustomerId) throws SQLException, ClassNotFoundException ;
}
