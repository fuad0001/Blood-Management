package blood_management;

public class Donor extends Person{
    
	int weight; 
	String last_dont_date;
        String available;

    public Donor(int weight, String last_dont_date,String available, String name, String PI, int age, String sex,String blood_grp) {
        super(name, PI, age, sex,blood_grp);
        this.weight = weight;
        this.last_dont_date = last_dont_date;
        this.available=available;
    }

    @Override
    public String toString() {
        
        return super.toString()+"\nWeight: "+weight+"\nLast Donation Date: "+last_dont_date+"\n"+available; 
    }
      	
}
