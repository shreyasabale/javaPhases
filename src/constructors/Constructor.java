package constructors;

class Std{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructor {

public static void main(String[] args) {

	Std s1=new Std();
	Std s2=new Std();

	s1.display();
	s2.display();
	}
}

