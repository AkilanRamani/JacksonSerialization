package jacksondeserialization;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("nameFilter")  

public class Product {
	public String proId;      
    public String name;      
    public String price;  
    public String expire;   
      
    // constructor  
    Product(String proId, String name, String price, String expire){  
        this.proId = proId;  
        this.name = name;  
        this.price = price;  
        this.expire = expire;  
    }  
}
