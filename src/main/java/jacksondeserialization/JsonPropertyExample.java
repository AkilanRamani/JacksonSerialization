package jacksondeserialization;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyExample {

	
    public static void main(String args[]) throws IOException {  
        
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
          
        String json = "{\"name\":\"Sharon\",\"id\":101, \"course\":\"MCA\"}";  
          
        // de-serializing Json into Java object  
        Student std = mapper.readerFor(Student.class).readValue(json);  
          
        // print id, name and course of student  
        System.out.println(std.getStdId());  
        System.out.println(std.getStdName());  
        System.out.println(std.getCourse());  
    }  
}
