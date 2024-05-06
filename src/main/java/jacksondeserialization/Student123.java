package jacksondeserialization;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")  
public class Student123 {//P
	    private String id;  
	    private String name;  
	    public String course;  
	    public List<Book> books;  //child class object type as an instance in Student Parent class.
	      
	    // default constructor  
	    public Student123() {  
	        this.books = new ArrayList<Book>();  
	    }  
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
	    public void addBook(Book book){  
	        books.add(book);  
	    }  
	}  
 @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookId")  
	class Book {  
	  public int bookId; 
	    public String bookName;  
	    public Student123 bookOwner;  //defining the parent class object as a instance Type inside the Child class.
	      
	    Book(int bookId,String bookName, Student123 bookOwner){  
	        this.bookId = bookId;  
	        this.bookName = bookName;  
	        this.bookOwner = bookOwner;   //this.bookOwner = std (std is a Type Reference that Refers to the Student class object with all its instances Fully Initialized)
	       
	    
	    }  
	    

}
