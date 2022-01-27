



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    //Student obj;
    static ArrayList<Student> std=new ArrayList<Student>();
    public  int Id; String Name;String Quota; String Course; String Academy; String Sports; String place; String Des; String Exp;
    public Student(int Id, String Name, String Quota, String Course, String Academy, String Sports, String place, String Des, String Exp) 
    {
        this.Id=Id; this.Name=Name; this.Quota=Quota;  this.Course=Course;  this.Academy=Academy; this.Sports=Sports; this.place=place; this.Des=Des; this.Exp= Exp;
    }
    
    public int getId(){
        return Id;
        }
    
    public String toString(){
       return "Student ID : "+Id+", Student Name : "+Name+" , Reservation : "+Quota+", Course : "+Course+""
                + ", Academy Report : "+Academy+", Sports Report : "+Sports+", Place : "+place+", Designation : "+Des+", Experience : "+Exp;
        
    
        }
    
    //------------------------------------CREATE-----------------------------------------------//
    
        public static   void create()
        {
            //ArrayList<Student> std=new ArrayList<Student>();
            std.add(new Student (1001,"AAA","MQ","BE-CSE","GOOD","NO RECORDS","DELHI","SOFTWAR ENGINEER","1 YEARS"));
            std.add(new Student (1002,"BBB","GQ","B -TECH IT","GOOD","BOXER","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
            std.add(new Student (1003,"CCC","GQ","BE-MECH","BAD","FOOTBALL PLAYER","CHENNAI","STUDENT","FRESHER"));
            std.add(new Student (1004,"DDD","GQ","MBBS","GOOD","NO RECORDS","PUNJAB","STUDENT","FRESHER"));
            System.out.println(std);
            }
    //------------------------------------UPDATE-----------------------------------------------//   
    
        public static  void update()
        {
            Scanner add=new Scanner(System.in);
            System.out.println("Enter Id : ");                           
            int Id=add.nextInt();
            System.out.println("Enter Name : ");                      
            String Name=add.next();
            System.out.println("Enter Reservation : ");            
            String Quota=add.next();
            System.out.println("Enter Course : ");                    
            String Course=add.next();
            System.out.println("Enter Academy Report : ");    
            String  Academy=add.next();
            System.out.println("Enter Sports Report : ");        
            String Sports=add.next();
            System.out.println("Enter Place : ");                      
            String place=add.next();
            System.out.println("Enter Designation : ");           
            String Des=add.next();
            System.out.println("Enter Experience : ");            
            String Exp=add.next();
            
            System.out.println("Student ID : "+Id+", Student Name : "+Name+" , Reservation : "+Quota+", Course : "+Course+""
                    + ", Academy Report : "+Academy+", Sports Report : "+Sports+", Place : "+place+", Designation : "+Des+", Experience : "+Exp);
            
            
        }
    //------------------------------------READ-----------------------------------------------// 
        
        public static void read()
        {
        std.add(new Student (1001,"AAA","MQ","BE-CSE","GOOD","NO RECORDS","DELHI","SOFTWAR ENGINEER","1 YEARS"));
        std.add(new Student (1002,"BBB","GQ","B -TECH IT","GOOD","BOXER","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
        std.add(new Student (1003,"CCC","GQ","BE-MECH","BAD","FOOTBALL PLAYER","CHENNAI","STUDENT","FRESHER"));
        std.add(new Student (1004,"DDD","GQ","MBBS","GOOD","NO RECORDS","PUNJAB","STUDENT","FRESHER"));
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Id :");
        int SId=sc1.nextInt();
        
        Iterator<Student> itr=std.iterator();
        while(itr.hasNext())
        {
            Student Std=itr.next();
            
            if(Std.getId()==SId)
            {
                System.out.println(Std);
            }
        }}

        //------------------------------------DELETE-----------------------------------------------//   
        
        public static void delete()
        {
//        std.add(new Student (1001,"AAA","MQ","BE-CSE","GOOD","NO RECORDS","DELHI","SOFTWAR ENGINEER","1 YEARS"));
//        std.add(new Student (1002,"BBB","GQ","B -TECH IT","GOOD","BOXER","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
//        std.add(new Student (1003,"CCC","GQ","BE-MECH","BAD","FOOTBALL PLAYER","CHENNAI","STUDENT","FRESHER"));
//        std.add(new Student (1004,"DDD","GQ","MBBS","GOOD","NO RECORDS","PUNJAB","STUDENT","FRESHER"));
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Id :");
        int SId=sc1.nextInt();
        
        Iterator<Student> itr=std.iterator();
        while(itr.hasNext())
        {
            Student Std=itr.next();
            
            if(Std.getId()==SId)
            {
                System.out.println("Deleted !");
            }else{System.out.println(Std);}
        }}
            
}
class Demo2{
    Student obj;
    public static void main(String[] args) {
        int n;
        do{
        System.out.println("Select the option :");
        System.out.println("1.Create");
        System.out.println("2.Read");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Exit");
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        switch(n)
        {
        case 1:   // Create
            Student.create();
            break;
        case 2:  // Read 
            Student.read();
            break;
        case 3:  // Add
            Student.update();
            break;
        case 4:  //  Delete
            Student.delete();
            break;
        case 5:
            break;
        default :
            System.out.println("Invalid !   Select the correct option");
        }}while(n!=5);
        if(n==5){System.out.println("Exited");}
    }
}



