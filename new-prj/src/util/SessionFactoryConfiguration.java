package util;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    public SessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory = configuration.buildSessionFactory();
    }
public static SessionFactoryConfiguration getInstance(){
       if (sessionFactoryConfiguration==null){
            sessionFactoryConfiguration=new SessionFactoryConfiguration();
        }else{
        }
        return sessionFactoryConfiguration;
  /*  return sessionFactoryConfiguration == null ?
            sessionFactoryConfiguration = new SessionFactoryConfiguration()
            : sessionFactoryConfiguration;*/
}
public Session getSession(){
        return sessionFactory.openSession();
}
}
