package jacksondeserialization;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIdentityInfoExample {
	
	  public static void main(String args[]) throws IOException, ParseException  {  
          
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        // create Scanner class object  
	        Scanner sc= new Scanner(System.in);  
	          
	        try{  
	              
	            Student123 std = new Student123();  
	              
	            String stdId, stdName, stdCourse;  
	              
	            System.out.println("Enter Student Id:");  
	            stdId = sc.nextLine();  
	            std.setStdId(stdId);  
	              
	            System.out.println("Enter Student Name:");  
	            stdName = sc.nextLine();  
	            std.setStdName(stdName);  
	              
	            System.out.println("Enter Course Name:");  
	            stdCourse = sc.nextLine();  
	            std.setCourse(stdCourse);  
	              
	            Book obj1 = new Book(121,"Learn C Programming", std);  
	            Book obj2 = new Book(131,"Learn Advance Java", std);  
	              
	            std.addBook(obj1);  // adding the Book type ref that is Book class Object into the Student class and initializing it.
	            std.addBook(obj2);  
	              
	            // convert Java type into Json string  
	            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);;   
	            System.out.println(jsonString);   
	         }   
	          catch (IOException e) {   
	            e.printStackTrace();   
	        }  
	          
	        // close Scanner class object  
	        sc.close();  
	    }  

}
