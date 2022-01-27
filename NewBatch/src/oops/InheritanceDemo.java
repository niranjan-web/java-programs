//single and multilevel inheritance
package oops;

public class InheritanceDemo {

	public static void main(String[] args) {
             
		Sem3 myObj = new Sem3();
		myObj.input1();
		myObj.output1();
		myObj.input2();
		myObj.output2();
		myObj.input3();
		myObj.output3();

		
	}
}
	class Sem1{
		
		int engMat,eng,engGrp,totalMark;
		
		
		public void input1() {
			engMat = 80;
			eng = 45;
			engGrp = 60;
			totalMark = engMat+eng+engGrp;
			
		}
		public void output1() {
			System.out.println("engineering mathamatics marks is "+ engMat);
			System.out.println("english marks is "+ eng);
			System.out.println("engineering graphics marks is "+ engGrp);
			System.out.println("total marks scored in sem1 is "+ totalMark);
			System.out.println();
		}
	}
	
	 class Sem2 extends Sem1{
		
		int java;
		int cLang;
		int cSharp;
		int totalMark;
		
		public void input2() {
			java = 80;
			cLang= 45;
			cSharp = 60;
			totalMark = java+cLang+cSharp;
			
		}
		public void output2() {
			System.out.println("engineering mathamatics marks is "+ java);
			System.out.println("english marks is "+ cLang);
			System.out.println("engineering graphics marks is "+ cSharp);
			System.out.println("total marks scored in sem1 is "+ totalMark);
			System.out.println();
}
		}
		class Sem3 extends Sem2{
	
			int php;
			int sql;
			int javaScript;
			int totalMark;
			
			public void input3() {
				php = 80;
				sql = 45;
				javaScript = 60;
				totalMark = php+sql+javaScript;
		
	}
	public void output3() {
		System.out.println("engineering mathamatics marks is "+ php);
		System.out.println("english marks is "+ sql);
		System.out.println("engineering graphics marks is "+ javaScript);
		System.out.println("total marks scored in sem1 is "+ totalMark);
	}
		}


