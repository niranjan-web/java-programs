package com.hibernate.HibernateMappingDemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

@Deprecated
public class App {
    public static void main(String[] args) {
        try {
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();

            /*
             * ProjectEntity projectObj1 = new ProjectEntity(); projectObj1.setProjectId(1);
             * projectObj1.setProjectName("java");
             * 
             * ProjectEntity projectObj2 = new ProjectEntity(); projectObj2.setProjectId(2);
             * projectObj2.setProjectName("kotlin");
             * 
             * ProjectEntity projectObj3 = new ProjectEntity(); projectObj3.setProjectId(3);
             * projectObj3.setProjectName("perl");
             * 
             * ProjectEntity projectObj4 = new ProjectEntity(); projectObj4.setProjectId(4);
             * projectObj4.setProjectName("c++");
             * 
             * ProjectEntity projectObj5 = new ProjectEntity(); projectObj5.setProjectId(5);
             * projectObj5.setProjectName("assembly");
             * 
             * ArrayList<ProjectEntity> projectList = new ArrayList<>();
             * projectList.add(projectObj1); projectList.add(projectObj2);
             * projectList.add(projectObj3); projectList.add(projectObj4);
             * projectList.add(projectObj5);
             * 
             * EmployeeEntity employeeObj1 = new EmployeeEntity();//transient state
             * employeeObj1.setEmployeeId(101); employeeObj1.setEmployeeName("mark");
             * 
             * EmployeeEntity employeeObj2 = new EmployeeEntity();
             * employeeObj2.setEmployeeId(102); employeeObj2.setEmployeeName("jeff");
             * 
             * EmployeeEntity employeeObj3 = new EmployeeEntity();
             * employeeObj3.setEmployeeId(103); employeeObj3.setEmployeeName("mark");
             * 
             * EmployeeEntity employeeObj4 = new EmployeeEntity();
             * employeeObj4.setEmployeeId(104); employeeObj4.setEmployeeName("jake");
             * 
             * EmployeeEntity employeeObj5 = new EmployeeEntity();
             * employeeObj5.setEmployeeId(105); employeeObj5.setEmployeeName("logan");
             * 
             * ArrayList<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
             * employeeList.add(employeeObj1); employeeList.add(employeeObj2);
             * employeeList.add(employeeObj3); employeeList.add(employeeObj4);
             * employeeList.add(employeeObj5);
             * 
             * employeeObj1.setProject(projectList); employeeObj2.setProject(projectList);
             * employeeObj3.setProject(projectList); employeeObj4.setProject(projectList);
             * employeeObj5.setProject(projectList);
             * 
             * projectObj1.setEmployee(employeeList); projectObj2.setEmployee(employeeList);
             * projectObj3.setEmployee(employeeList); projectObj4.setEmployee(employeeList);
             * projectObj5.setEmployee(employeeList);
             * 
             * session.saveOrUpdate(employeeObj1);//persistent state
             * session.saveOrUpdate(employeeObj2); session.saveOrUpdate(employeeObj3);
             * session.saveOrUpdate(employeeObj4); session.saveOrUpdate(employeeObj5);
             * 
             * session.saveOrUpdate(projectObj1); session.saveOrUpdate(projectObj2);
             * session.saveOrUpdate(projectObj3); session.saveOrUpdate(projectObj4);
             * session.saveOrUpdate(projectObj5);
             */

//            EmployeeEntity obj = session.load(EmployeeEntity.class, 1);
//            System.out.println(obj);

            try {
                Transaction transaction = session.beginTransaction();

                /*
                 * System.out.println("enter employee id"); Scanner scan = new
                 * Scanner(System.in); Scanner scan1 = new Scanner(System.in);
                 * 
                 * int empId = scan.nextInt(); String name = scan1.nextLine();
                 * 
                 * // String hql =
                 * "Select employeeName from EmployeeEntity where employeeId =:id"; String hql =
                 * "update EmployeeEntity set employeeName =:name where employeeId =:id"; Query
                 * qObj = session.createQuery(hql); qObj.setParameter("name", name);
                 * qObj.setParameter("id", empId);
                 */

                Criteria cObj = session.createCriteria(EmployeeEntity.class);
                // cObj.add(Restrictions.gt("employeeId", 102));
                // cObj.addOrder(Order.desc("employeeName"));
                cObj.setProjection(Projections.property("employeeId"));

                /*
                 * int status = qObj.executeUpdate(); System.out.println(status);
                 */

                List<Object> list = cObj.list();

                for (Object listObj : list) {
                    System.out.println(listObj);
                }
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }

            session.close();// detached state
            // session.remove( transaction ); removed state
            System.out.println("success");
        } catch (HibernateException e) 
        {
            e.printStackTrace();
        }

    }
}
