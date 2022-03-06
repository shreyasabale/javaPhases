package constructors;

public class Students {
	
	String name;
	int age;
	char section;
	char gender;
	int Subject1;
	int Subject2=0;
	int Subject3=0;
	int TotalMarks;
	float Percentage;
	
	Students(String name, int age, char section, char gender, int Subject1, int Subject2, int Subject3){
	this.name=name;
	this.age=age;
	this.section=section;
	this.gender=gender;
	this.Subject1=Subject1;
	this.Subject2=Subject2;
	this.Subject3=Subject3;
	
	}
	Students(String name, int age, char section, char gender, int Subject1){
	this.name=name;
	this.age=age;
	this.section=section;
	this.gender=gender;
	this.Subject1=Subject1;
	}
	void Display(){
	 TotalMarks=Subject1+Subject2+Subject3;
	  Percentage=(TotalMarks/3)*100;
	    System.out.println("Name: "+name+" ,"+ "Age: "+ age +" ,"+"Section: "+ section+" ,"+"Gender: "+gender+" ,"+"Subject1: "+Subject1 +" ,"+"Subject2 : "+Subject2+" ,"+"Subject3: "+Subject3);
		
	}
	public static void main(String[] args){
		
		Students s1=new Students("Aarya",22,'A','F',65,46,81);
		Students s2=new Students("Shreya",23,'B','F',68,54,80);
		Students s3=new Students("om",22,'B','M',35,45,56);
		Students s4=new Students("Shweta",24,'A','F',65,46,8);
		s1.Display();
		s2.Display();
		s3.Display();
		s4.Display();
	}

}
