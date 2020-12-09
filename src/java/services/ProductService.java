/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.Product;
import dao.ProductDao;

/**
 *
 * @author Home
 */
public class ProductService {
    ProductDao productDao;
    
    public int insert(Product product){
        
         if (productDao == null) productDao= new ProductDao();
         int result = (productDao.insert(product,"products"));
         return result;
    }
    public int update(int productId,Product product){
                throw new UnsupportedOperationException("Not supported yet.");

    }
    public int update(String name, double price,Product product){
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
