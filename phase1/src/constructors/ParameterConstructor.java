package constructors;

class St{
	int id;
	String name;
	St(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParameterConstructor {
	public static void main(String[] args) {

	St s1=new St(2500,"Shreya");
	St s2=new St(1200,"Aarya");
	s1.display();
	s2.display();
		}
}



