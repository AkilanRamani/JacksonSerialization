package jacksondeserialization;

import java.util.Date;
import java.util.List;

public class JobPosition {

	 public String name;        
	    public int expReq;     
	    public Date valid;  
	    public int ctc;     
	    public List<String> employees;   
	      
	    // default constructor  
	    JobPosition(){  
	        this.name = null;   //null
	        this.expReq = 0;  
	        this.valid = null;  
	        this.ctc = 0;  
	        this.employees = null;  
	    }  
	      
	    // constructor    
	    JobPosition(String name, int expReq, List<String> employees, Date valid, int ctc){    
	        this.name = name;    
	        this.expReq = expReq;    
	        this.valid = valid;   
	        this.ctc = ctc;  
	        this.employees = employees;    
	    }  
	    @Override      
	    public String toString() {      
	        // TODO Auto-generated method stub      
	        return "\"Job Position [Job Position: "+ name + ", Experience Required: " + expReq + ", Last Date To Apply: " + valid + ", CTC: "+ctc+", Employees Details "+employees+"]";      
	    }    
	}  
	



