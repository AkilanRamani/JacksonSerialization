package jacksondeserialization;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

public class Student12 {
	
	@JsonView(Views.Public.class)  
    private String id;  
    @JsonView(Views.Public.class)  
    private String name;  
    @JsonView(Views.Internal.class)  
    public String course;  
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")@JsonView(Views.Public.class)  
    public Date addmission;  
      
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
class Views {  
      
    static class Public {  
          
    }  
    static class Internal extends Public {  
          
    }  

}
