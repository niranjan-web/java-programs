package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Movies> al = new ArrayList<Movies>();
		ComparatorBase cp = new ComparatorBase();
		al.add(new Movies("schindler's list",1991));
		al.add(new Movies("seven",2000));
		al.add(new Movies("the idol",2022));
		al.add(new Movies("catch me if you can",2004));
		
		Collections.sort(al,cp);
		for(Movies names:al)
		{
			System.out.println(names);
		}
	}
}

class Movies
{
	String name;
	int year;
	Movies(String name,int year)
	{
		this.name = name;
		this.year = year;
	}
	public String toString()
	{
		return ""+name + " "+year;
	}
}