package com.hibernate.fourstates.FourStatesHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	Configuration config= new Configuration().configure().addAnnotatedClass(Laptop1.class);
        
        ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
         
         SessionFactory sf= config.buildSessionFactory(registry);
         
         Session session=sf.openSession();
         
         session.beginTransaction();  
         
//         Laptop1 l = new Laptop1();
//         l.setId(100);
//         l.setBrand("samsung");
//         l.setPrice(5000);
//         System.out.println(l);            // Transient state
//         
//         session.save(l);              // persist or save state
//         l.setPrice(3000);               // still in persist state
         
           Laptop1 l= (Laptop1) session.load(Laptop1.class, 100); // load will load till database but when we use it it will fetch the data
           Thread.sleep(3000);        //& load is proxy object
           System.out.println(l);
           
       
         session.getTransaction().commit();
//         l.setPrice(2000);                 // detach state
     
     }
}
