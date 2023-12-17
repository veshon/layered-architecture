package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
     ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;

     boolean deleteItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

     boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

     boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

     boolean exsistItem(String code) throws SQLException, ClassNotFoundException ;

     String generateID() throws SQLException, ClassNotFoundException ;

     boolean existItemCode(String code) throws SQLException, ClassNotFoundException ;

     ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;
}
