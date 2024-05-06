package jacksondeserialization;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student1 {
	
	private String id;  
    private String name;  
    public String course;  
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")  
    public Date addmission;  
      // when 
    // getter and setter  
    @JsonProperty("id")  
    public String getStdId() {  
        return id;  
    }  
    @JsonProperty("id")  
    public void setStdId(String id) {  
        this.id = id;  
    }  
    @JsonProperty("name")  
    public String getStdName() {  
        return name;  
    }  
    @JsonProperty("name")  
    public void setStdName(String name) {  
        this.name = name;  
    }    
    public String getCourse() {  
        return course;  
    }  
    public void setCourse(String course) {  
        this.course = course;  
    }  
    public Date getAddmission() {  
        return addmission;  
    }  
    public void setAddmission(Date addmission) {  
        this.addmission = addmission;  
    }   

}
