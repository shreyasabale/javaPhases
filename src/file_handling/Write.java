package file_handling;


import java.io.*;
public class Write {
 public static void main(String[] args){
 //Writing in the file

	 try
	 {
		 FileWriter f = new FileWriter("C:\\Users\\DELL\\Desktop\\shreya\\shr.txt");
	 try
	 {
		 f.write("My name is Shreya.");
	 }
	 finally
	 {
		 f.close();
	 }
	 System.out.println("Successfully Written..!! ");
	 }
	 catch(IOException i)
	 {
		 System.out.println(i);
	 }

 }
}