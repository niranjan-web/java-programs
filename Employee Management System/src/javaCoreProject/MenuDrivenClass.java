//Employee management system
package javaCoreProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MenuDrivenClass {

    @SuppressWarnings("resource")
    public static void main(String[] args) /* throws Exception */
    {
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int empId, empSalary;
        long MobileNumber;
        String empAddress, empJobType, empName;

        List<EmployeeDetails> obj1 = new ArrayList<EmployeeDetails>();
        // MyException ex = new MyException();
        int num;

        do {
            System.out.println("----------------Employee Management System----------------");
            System.out.println("1-->For Entering the Employee Details");
            System.out.println("2-->For Display the Employee Details");
            System.out.println("3-->For Search the Employee Details");
            System.out.println("4-->For Remove the Employee Details");
            System.out.println("5-->For Update the Employee Details");
            System.out.println("0-->For Exit");
            System.out.println("----------------------------------------");
            System.out.println("select the above option ");

            num = in.nextInt();
            switch (num) {
            // for create employee details
            case 1: {
                while (true) {
                    try {
                        System.out.print("Enter your EmployerId:");
                       // empId = Integer.parseInt(in.next());
                        empId = in.nextInt();

                        System.out.print("Enter your Name:");
                        empName = scan.nextLine();

                        System.out.print("Enter your Mobile Number:");
                        MobileNumber = Long.parseLong(in.next());

                        System.out.print("Enter your Address:");
                        empAddress = scan.nextLine();

                        System.out.print("Enter your Salary:");
                        empSalary = Integer.parseInt(in.next());

                        System.out.print("Enter your Job Type:");
                        empJobType = scan.nextLine();

                        break;
                    } catch (Exception ex) {
                        System.err.println("invalid input");
                        System.out.println("please enter only integer!");
                        System.out.println("---------------------------------");

                    }

                }

                obj1.add(new EmployeeDetails(empId, empName, MobileNumber, empAddress, empSalary, empJobType));
                System.out.println("your details are added succesfully!");

                break;
            }
            // for display employee details
            case 2: {
            	int flag = 0;
                Iterator<EmployeeDetails> itr = obj1.iterator();

                while (itr.hasNext()) {
                    EmployeeDetails emp = itr.next();
                    System.out.println(emp);
                    flag = 1;
                }
                if(flag == 0)
                {
                	System.out.println("there is nothing to display");
                	System.out.println("enter 1 to add employee details");
                }
                break;
            }
            // for searching employee details
            case 3: {
                int flag = 0;
                System.out.println("enter employee id to search");
                int num1 = in.nextInt();

                Iterator<EmployeeDetails> itr = obj1.iterator();

                while (itr.hasNext()) {
                    EmployeeDetails emp = itr.next();
                    if (emp.getEmpId() == num1) {
                        System.out.println(emp);
                        flag = 1;
                        // break;
                    }
                }
                if (flag == 0) {
                    System.err.println("the entered employee id is not found");
                    System.out.println("Type 1 to add! (OR) search again with existing employee id!");
                }
                break;
            }
            // For Remove the Employee Details
            case 4: {
                boolean flag = false;
                System.out.println("enter the employee id to remove");
                int num1 = in.nextInt();

                Iterator<EmployeeDetails> itr = obj1.iterator();

                while (itr.hasNext()) {
                    EmployeeDetails emp = itr.next();
                    if (emp.getEmpId() == num1) {
                        itr.remove();
                        flag = true;
                    }
                }
                if (!flag) {
                    System.err.println("the entered employee id is not found");
                    System.out.println("please enter valid employee id!");
                } else {
                    System.out.println("Employee details deleted successfully");
                }

                break;
            }
            // for update employee details
            case 5: {
                boolean flag = false;
                System.out.println("enter your employee id to update");
                int num1 = in.nextInt();

                ListIterator<EmployeeDetails> itr = obj1.listIterator();// list iterator for adding
                // Iterator<EmployeeDetails> itr = obj1.iterator();//list iterator for adding

                while (itr.hasNext()) {
                    EmployeeDetails emp = itr.next();
                    if (emp.empId == num1) {

                        System.out.print("enter your new Employee ID:");
                        empId = in.nextInt();

                        System.out.print("Enter your new Name:");
                        empName = scan.nextLine();

                        System.out.print("Enter your new Mobile Number:");
                        MobileNumber = in.nextLong();

                        System.out.print("Enter your new Address:");
                        empAddress = scan.nextLine();

                        System.out.print("Enter your new Salary:");
                        empSalary = in.nextInt();

                        System.out.print("Enter your new Job Type:");
                        empJobType = scan.nextLine();

                        itr.add(new EmployeeDetails(empId, empName, MobileNumber, empAddress, empSalary, empJobType));
                        flag = true;

                    }
                }
                if (!flag)// if flag remain false
                {
                    System.err.println("the entered employee id is not found");
                    System.out.println("please enter valid employee id!");
                } else {
                    System.out.println("your details are Updated Successfully...!");
                }
                break;
            }
            case 0: {
                break;
            }
            default: {
                System.err.println("you have enter wrong input!");
                System.out.println("please enter below valid option");
            }

            }
        } while (num != 0);
        if (num == 0) {
            System.out.println("thanks for using");
        }

    }

}
