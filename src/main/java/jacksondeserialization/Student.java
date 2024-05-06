package jacksondeserialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	private int id;  
    private String name;  
    private String course;  
      
    // default constructor  
    Student(){  
          
    }  
    // parameterized constructor   
    Student(int id, String name, String course){  
        this.id = id;  
        this.name = name;  
        this.course = course;  
    }  
    @JsonProperty("id")  
    public int getStdId() {  
        return id;  
    }  
    @JsonProperty("id")  
    public void setStdId(int id) {  
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
    @JsonProperty("course")  
    public String getCourse() {  
        return course;  
    }  
    @JsonProperty("course")  
    public void setCourse(String course) {  
        this.course = course;  
    }    

}
