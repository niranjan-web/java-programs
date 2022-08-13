package com.hibernate.HibernateMappingDemo1;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.CarEntity;
import com.entity.UserEntity;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Configuration config = new Configuration();
            config.configure();
            SessionFactory sessionFactory = config.buildSessionFactory();
            Session session = sessionFactory.openSession();
    
            System.out.println( "Hello World!" );
            
            UserEntity userObj = new UserEntity();
            userObj.setUserId(102);
            userObj.setUserName("conor");
            userObj.setUserAddress("los angelos");
            userObj.setUserMobileNumber(1098754890);
            
            CarEntity carObj = new CarEntity();
            carObj.setBrandName("dodge");
            carObj.setCarColor("red");
            carObj.setLuxury(true);
            carObj.setRegNo(1010);
            
            CarEntity carObj1 = new CarEntity();
            carObj1.setBrandName("buggati");
            carObj1.setCarColor("white");
            carObj1.setLuxury(true);
            carObj1.setRegNo(1000);
            
            CarEntity carObj2 = new CarEntity();
            carObj2.setBrandName("koengisegg");
            carObj2.setCarColor("blue");
            carObj2.setLuxury(true);
            carObj2.setRegNo(1919);
            
            ArrayList<CarEntity> carList = new ArrayList<CarEntity>();
            carList.add(carObj);
            carList.add(carObj1);
            carList.add(carObj2);
            
            userObj.setCarEntityObj(carList);
            
            session.saveOrUpdate(userObj);
            //session.saveOrUpdate(carList);
            session.saveOrUpdate(carObj1);
            session.saveOrUpdate(carObj2);
            session.saveOrUpdate(carObj);
            
            Transaction transaction  = session.beginTransaction();
            transaction.commit();
            
        } catch (HibernateException e) {
            System.out.println("exception occured "+ e);
        }
        
        
    }
}
