package oop_pillars;

class product{
    int id=78;
    String name="Amul";
    void display() {
        System.out.println(id+" "+name);
    }
    
}
class A extends product{
    int count=50;
    String catagory="butter";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}

class B extends product{
    int count=90;
    String catagory="Milk";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}

class C extends product{
    int count=56;
    String catagory="choco";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}

class SubA extends A{
    int price=30;
    void totalprice() {
        int tp;
        tp=count*price;
        
        System.out.println(id+" "+name+" "+ catagory+" totalprice:"+tp);
    }
}

class SubB extends B{
    int price=10;
    void totalprice() {
        int tp;
        tp=count*price;
        
        System.out.println(id+" "+name+" "+ catagory+" totalprice:"+tp);
    }
}

public class Inheritance {

	public static void main(String[] args) {
		A obj4 = new A();
		B obj5 = new B();
		C obj3 = new C();
		SubA obj1 = new SubA();
		SubB obj2 = new SubB();
	    
	    
	     //All classes can access the method of class A
	    obj4.display();
	    obj5.display();
	    obj3.display();
	    obj1.totalprice();
	    obj2.totalprice();
	    
	    
	       
		  
	}

}

