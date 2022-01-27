
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
       System.out.println(callName("",""));
        }
        catch(MyException ex) {
            System.out.println("you have to enter your name! "+ex);
        }

    }
    public static String callName(String firstName,String lastName) throws MyException{
       // try 
       // {
        if(firstName.isEmpty() || lastName.isEmpty()) {
            throw new MyException("you have to enter the name");
        }
        else 
        {
            String name = firstName.trim() + lastName.trim();
             return name;
        }
    //}
//     catch(MyException ex) 
//        {
//        return"you have to enter a name";
//    }

}
}
class MyException extends Exception{
    
    String msg;
    MyException(String msg){
        this.msg = msg;
    }
}