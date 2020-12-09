/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Product;

/**
 *
 * @author Home
 */
public interface IProductDao {
    
     public int insert(Product product,String tableName);
    public int update(int productId,Product product);
    public int update(String name, double price,Product product);
    public int update(String name);
    public int update(double price);
    public int update1(int quantity);
    public int delete(int productId);
    public List<Product> all();
    public Product getProductById(int id);
}
