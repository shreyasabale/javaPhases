package diamondproblem;

interface One 
{  
    default void show() 
    { 
        System.out.println("Default One"); 
    } 
} 
interface Two 
{  
    default void show() 
    { 
        System.out.println("Default Two"); 
    } 
}  
public class Diamond implements One, Two
{  
    public void show() 
    {  
        One.super.show(); 
        Two.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamond ob = new Diamond(); 
        ob.show(); 
    } 
}
