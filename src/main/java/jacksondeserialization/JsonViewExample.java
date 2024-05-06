package jacksondeserialization;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonViewExample {
	
	public static void main(String args[]) throws IOException, ParseException  {  
        
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
          
        try (// create Scanner class object  
		Scanner sc = new Scanner(System.in)) {
			try{  
			      
			    Student12 std = new Student12();  
			      
			    String stdId, stdName, stdCourse, stdAddmission;  
			      
			    System.out.println("Enter Student Id:");  
			    stdId = sc.nextLine();  
			    std.setStdId(stdId);  
			      
			    System.out.println("Enter Student Name:");  
			    stdName = sc.nextLine();  
			    std.setStdName(stdName);  
			      
			    System.out.println("Enter Course Name:");  
			    stdCourse = sc.nextLine();  
			    std.setCourse(stdCourse);  
			      
			    System.out.println("Enter Addmission Date(dd-MM-yyyy):");  
			    stdAddmission = sc.nextLine();  
			      
			    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
			    Date date = sdf.parse(stdAddmission);  
			    std.setAddmission(date);  
			      
			    // convert Java type into Json string  
			    String jsonString = mapper.writerWithDefaultPrettyPrinter().withView(Views.Public.class).writeValueAsString(std);   
			    System.out.println(jsonString);   
			}   
			catch (IOException e) {   
			    e.printStackTrace();   
			}
		}  

	}}
