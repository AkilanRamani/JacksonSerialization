package jacksondeserialization;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDeserializationExample2 {
	
	public static void main(String args[]) throws ParseException {   
        String jsonString = "{\"name\":\"JavaDeveloper\",\"expReq\":2,"  
                + "\"valid\":\"21-09-2023T12:00:00+01:00\",\"ctc\":700000,\"employees\":[\"Brittany\",\"Nicholas\",\"Sharon\"]}";  
        // create an instance of SimpleDateFormat class  
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY'T'HH:mm:ss");     
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
        // add date format to ObjectMapper class  
       
       mapper.setDateFormat(sdf);  // default time Format that needs to be set into the Object mapper , so that the Correct Date Format as Specified on the SimpleDateFormat can be used When De-Seriliazing the JSON Strings into the Java Object.
        // deserialize jsonString into POJO  
        try {  
            JobPosition position = mapper.readValue(jsonString, JobPosition.class);  
            System.out.println(position);  
        } catch (JsonMappingException e) {  
            e.printStackTrace();  
        } catch (JsonProcessingException e) {  
            e.printStackTrace();  
        }  
  
    }    

}

