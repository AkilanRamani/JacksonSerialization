package jacksondeserialization;

import java.util.Date;
import java.util.List;

public class JobPosition12 {

	  public String name;        
	    public int expReq;     
	    public Date valid;  
	    public int ctc;     
	    public List<String> employees;      
	    // constructor    
	    JobPosition12(String name, int expReq, List<String> employees, Date valid, int ctc){    
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
