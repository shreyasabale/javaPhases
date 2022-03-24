package constructors;

public class Shapes {

	public Shapes(){
		System.out.println("Default Constructor");
		
	};
	
	public Shapes(int a){
		System.out.println("Constructor for Square");
		AreaOfSquare(a);
	};
	
	public Shapes(int l, int b){
		System.out.println("Constructor for rectangle");
		AreaOfRectangle(l, b);
	};
	
	public Shapes(float f){
		System.out.println("Constructor for Circle");
		AreaOfCircle(f);
	};
	
	
	public void AreaOfSquare(int a){
		
		System.out.println("Area Of Square: "+ (a*a));
	};
	
	void AreaOfRectangle(int l, int b){
		System.out.println("Area Of Rectangle: "+ (l*b));
	}
	void AreaOfCircle(float l){
		System.out.println("Area Of Circle: "+ (3.14*l*l));
	}
	
	void AreaOf(int a, int b){
		System.out.println("Area Of Triangle: "+ (0.5*a*b));
	};
	
	void AreaOf(int a, float b){
		System.out.println("Area of Rhombus: "+ (0.5*a*b));
	};
	
	public static void main(String[] args){
		
		Shapes s= new Shapes();
		Shapes s1= new Shapes(4);
		Shapes s2= new Shapes(1,2);
		Shapes s3= new Shapes(5.4f);
		
		s.AreaOf(2, 4);
		s.AreaOf(5, 4.6f);
		
	}

}
