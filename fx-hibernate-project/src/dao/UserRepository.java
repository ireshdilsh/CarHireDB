package dao;

import entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;

public class UserRepository {

    public void saveUser(UserEntity entity) {

        Transaction transaction=null;
        try(Session session= SessionFactoryConfiguration.getInstance().getSession()){
            transaction= session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){}
            else{transaction.rollback();}

        }
    }
}
