class doctor
{
    String name;
    doctor(String n) 
    {
        name=n;
    }
}

class  Surgeon extends doctor
{
    String specialization;
    int charge;
    Surgeon(String n, String s, int c)

    {
        super(n);
        specialization=s; 
        charge=c;
    }

    void displaySurgeon()
    {
        System.out.println("Surgeon Information");
        System.out.println("Name : "+name);
        System.out.println("Specialization : "+specialization);
        System.out.println("Charge per hour : "+charge);
    }
}

class Physician extends doctor
{
    String speciality;
    int fees;
    Physician(String n, String s, int f)

    {
        super(n);
        speciality=s; 
        fees=f;
    }

    void displayPhysician()
    {
        System.out.println("Physician information ");
        System.out.println("Speciality:"+speciality);
        System.out.println("fees per hour:"+fees);
    }
}

class Hospital
{
    public static void main(String args[])
    {
        Surgeon s=new Surgeon ("Dr. Dhyan", "Child Doctor", 3000);
        Physician p=new Physician ("Dr. Tarj", "Heart Doctor", 2500);
        s.displaySurgeon();
        p.displayPhysician();
    }
}