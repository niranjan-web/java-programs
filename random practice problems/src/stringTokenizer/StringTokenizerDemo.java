package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
//        StringTokenizer str = new StringTokenizer("hi hello how are you");
//       // System.out.println( str.countTokens());;
//        String name = new String("746474");
//        
//        while(str.hasMoreTokens()){
//            System.out.println(str.nextToken());
//        }
//       //System.out.println( str.countTokens());;
//    }
        
        Car obj = new Car(24,"audi", "red");
        System.out.println(obj);
        
    }
}
class Car{
    String brand;
    String color;
    int noOfSeats;
    
    Car(int noOfSeats,String color,String brand){
        this.noOfSeats = noOfSeats;
        this.brand = brand;
        this.color = color;
    }
    public String toString() {
        return noOfSeats+" " +color+" "+ brand+" ";
    }
    
}