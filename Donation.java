
package blood_management;

public class Donation {
    Donor don;
    Reciever rec;
    String hospital,donation_time;

    public Donation(Donor don, Reciever rec, String hospital, String donation_time) {
        this.don = don;
        this.rec = rec;
        this.hospital = hospital;
        this.donation_time = donation_time;
    }

    @Override
    public String toString() {
        return "\nBlood Donor:"+don.toString()+"\n"+"\nBlood Reciever:"+rec.toString()+"\nHospital: "+hospital+"\nDonation Time: "+donation_time; 
    }
    public static void main(String[] args) {
        Donor d=new Donor(60,"12-12-2019","Available","Anis","111",30,"Male","O+");
        Reciever r=new Reciever("Blood Cancer","Kasem","1221",55,"Male","O+");
        Donation D=new Donation(d,r,"Cresent Hospital","8-4-2020 10:50pm");
        
        System.out.println("--------------Donation Status----------------\n");
        System.out.println(D.toString());
    }
}
