package dao;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;

public class CustomerDao {
    public void saveUser(Customer customer) {
        Transaction transaction=null;
        try(Session session= SessionFactoryConfiguration.getInstance().getSession()){
transaction= session.beginTransaction();
session.save(customer);
transaction.commit();
        }catch (Exception e) {
            if (transaction!=null){
                transaction.rollback();
            }
        }
    }
}
