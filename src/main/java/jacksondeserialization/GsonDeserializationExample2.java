package jacksondeserialization;

import java.text.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonDeserializationExample2 {

	public static void main(String args[]) throws ParseException {    
		  
	    String jsonString = "{\"name\":\"JavaDeveloper\",\"expReq\":2,"  
	            + "\"valid\":\"05-04-2022\",\"ctc\":700000,\"employees\":[\"Nicholas\",\"Brittany\",Sharon]}";  
	                      
	    Gson gson = new GsonBuilder()  
	            .registerTypeAdapter(JobPosition12.class, new JobPositionGsonDeserializer())  
	            .create(); 
	   
	    
	   
	   
	      
	    JobPosition12 position = gson.fromJson(jsonString, JobPosition12.class); 
	    
	    System.out.println(position);  
	  
	    }    
}


