/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.Database.con;
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
         if (db == null) db =new Database();
        //INSERT INTO `products`(`name`, `price`, `quantity`) 
        // VALUES("Fixit Kit", "187,65", "1")
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append("INSERT INTO ");
        sb.append("`"); sb.append(tableName); sb.append("`");
        sb.append("(`name`, `price`, `quantity`)");
        sb.append(" VALUES(");
        sb.append("\""); sb.append(product.getName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(product.getPrice()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(product.getQuantity()); sb.append("\"");
        sb.append(")");
        try {
            //        System.out.println(sb.toString());
            if(con!= null ){
                statement = con.createStatement();
                result = statement.executeUpdate(sb.toString());
            }
            else{
                System.out.println("Connection problems");}
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(result); 
     }
    public int update(int productId){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int update(String name, double price,int quantity){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int update(String name){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int update(double price){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int update1(int quantity){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int delete(int productId){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public List<Product> all(){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public Product getProductById(int id){
                throw new UnsupportedOperationException("Not supported yet.");

    }
}
