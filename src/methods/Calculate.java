package methods;

public class Calculate {
	public int cal(int a, int b){
        int addition= a+b;
        return addition;
    }
    public float cal(float r){
        float AreaOfCircle=3.14f*r*r;
        return AreaOfCircle;
    }
    public int cal(int l, float b){
        int AreaOfRectangle= (int) (l*b);
        return AreaOfRectangle;
    }

    public static void main(String[] args) {
        Calculate op=new Calculate();
        int x1=op.cal(2, 3);
        System.out.println("The Addition of two numbers is: "+x1);
        float x2=op.cal(20);
        System.out.println("The Area of Circle is: "+ x2);
        int x3=op.cal(2, 6);
        System.out.println("The Area of Rectangle is: "+ x3);

    }
    
}
