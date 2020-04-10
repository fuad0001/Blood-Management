
package blood_management;

public class Reciever extends Person{
    public String disease;
    

    public Reciever(String disease,String name, String PI, int age, String sex,String blood_grp) {
        super(name, PI, age, sex,blood_grp);
        this.disease = disease;
        
    }

    @Override
    public String toString() {
       
        return super.toString()+"\nHospital: "+disease; 
    }
 
    

    

	

	


}
