package jacksondeserialization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JobPositionGsonDeserializer implements JsonDeserializer<JobPosition12> {  
	    // create an instance of the SimpleDateFormat  
	    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
	  
	   

		@Override
		public JobPosition12 deserialize(JsonElement json, java.lang.reflect.Type typeOfT,
				JsonDeserializationContext context) throws com.google.gson.JsonParseException {
			JsonObject obj = json.getAsJsonObject(); // Complete JSON Object that consists of an Entire JSON Data.
			System.out.println("The json object is " + obj);
			  
	        JsonElement JobPositionName = obj.get("name");  
	        System.out.println(JobPositionName.getAsString()); // that refers to the Current JSON Node or an Element.
	        JsonElement expRequired = obj.get("expReq");  	       
	        JsonElement ctc = obj.get("ctc");  
	        JsonElement dateToApply = obj.get("valid");  
	        JsonArray employeesData = obj.getAsJsonArray("employees"); 
	        System.out.println("The json Array is " + employeesData);
	        // Form of an array , if it is an array ,the Return Type should of the JSONArray. 
	  
	        ArrayList<String> empList = new ArrayList<String>();  
	        if (employeesData != null) {  
	            for (int i = 0; i < employeesData.size(); i++) {  
	                empList.add(employeesData.get(i).getAsString());  
	            }  
	        }  
	  
	        JobPosition12 pos;  // POJO Class instance  
	        try {  
	            pos = new JobPosition12(JobPositionName.getAsString(), expRequired.getAsInt(), empList, sdf.parse(dateToApply.getAsString()), ctc.getAsInt());  

	            return pos;  // Return an Object after an initialization(Full initialization).
	              
	        } catch (ParseException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
			return null;
		}  

}
