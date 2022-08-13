package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo 
{
    public static void main(String[] args)
    {
       ComparatorDemo cd =  new ComparatorDemo();
        ArrayList<Pc> list = new ArrayList<Pc>();
        
        Pc obj = new Pc("microsoft",75000," green");
        list.add(obj);
        list.add(new Pc("dell",40000,"violet"));
        list.add(new Pc("lenovo",60000,"white"));
        list.add(new Pc("asus",80000,"black"));
        list.add(new Pc("acer",50000,"grey"));
        list.add(new Pc("apple",30000,"blue"));
        
        Collections.sort(list, cd);
       
        for(Object lap: list)
        {
            System.out.println(lap);
        }

    }

}
class Pc
{
    String brand;
    int price;
    String color;
    
    Pc(String brand, int price , String color)
    {
        this.brand =brand;
        this.color = color;
        this.price =price;
       
    }
    public String toString()
            {
                    return "Brand name is "+this.brand +" Price is  "+ this.price +" color of the laptop is "+ this.color+" ";
        
            }
}