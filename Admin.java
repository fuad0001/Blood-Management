
package blood_management;

public class Admin {
        private String username; 
	 private int phonenumber;  
	 private String address; 
         

	public String getUserame() 
	{ 
		return username; 
	} 

	public int getPhonenumber() 
	{ 
		return phonenumber; 
	} 


	public String getAddress() 
	{ 
		return address; 
	} 
        
        public void setPhonenumber(){
            this.phonenumber=phonenumber;
        }
        public void setUsername(){
            this.username=username;
        }
        public void setAddress(){
            this.address=address;
        }

	@Override
	public String toString() 
	{ 
		return("\nUsername: "+ this.getUserame()+ 
			"\nPhone number: "+ this.getPhonenumber()+ 
			"\nAddress: "+ this.getAddress()); 
	} 

	
}
