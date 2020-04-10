
package blood_management;

public class Person {
    
        public String name; 
	public String PI; 
	public int age; 
	public String sex; 
        public String blood_grp;

    public Person(String name, String PI, int age, String sex, String blood_grp) {
        this.name = name;
        this.PI = PI;
        this.age = age;
        this.sex = sex;
        this.blood_grp = blood_grp;
    }
	
	

	@Override
	public String toString() 
	{ 
		return "\nName: "+name+"\nPersonal Id: "+PI+"\nAge: "+age+"\nSex: "+sex+"\nBlood Group: "+blood_grp;
	} 
        
}
