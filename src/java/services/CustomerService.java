/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CustomerDao;
import java.util.List;
import models.Customer;

/**
 *
 * @author Home
 */
public class CustomerService implements ICustomerService{
    CustomerDao customerDao;
    // CustomerDaoMSSQL customerDaoMSSql;
    
    public int insert(Customer customer){
        if (customerDao == null) customerDao= new CustomerDao();
        return (customerDao.insert(customer,"customers"));
    }
    @Override
    public int update(int customerId){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int update(String firstName, String LastName){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int update(String email){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int delete(int customerId){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public List<Customer> all(){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public Customer getCustomerById(int id){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
