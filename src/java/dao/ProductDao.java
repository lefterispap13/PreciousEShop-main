/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.Database.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Product;

/**
 *
 * @author Home
 */
public class ProductDao extends Database implements IProductDao{
    
    private Database db;
     @Override
     public int insert(Product product,String tableName){
         int result=0;
         if (db == null) db =new Database();
        //INSERT INTO `products`(`name`, `price`, `quantity`) 
        // VALUES("Fixit Kit", "187,65", "1")
        
        String query;
        query = "INSERT INTO `"+tableName+"`";
        query += "(`name`, `price`, `quantity`) ";
        query += "VALUES(?,?,?)";
        
//        PreparedStatement ps;
        try {
            prStatement = con.prepareStatement(query);
            prStatement.setString(1, product.getName());
            prStatement.setDouble(2, product.getPrice());
            prStatement.setInt(3, product.getQuantity());
            result=  (prStatement.executeUpdate());
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);     
        }       
        return(result); 
     }
    @Override
    public int update(int productId,Product product){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public int update(String name, double price,Product product){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public int update(String name){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public int update(double price){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public int update1(int quantity){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public int delete(int productId){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public List<Product> all(){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    @Override
    public Product getProductById(int id){
                throw new UnsupportedOperationException("Not supported yet.");

    }
}
