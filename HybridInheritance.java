interface ABC
{
    public void displayA();
}

class PQR
{
    void displayJ()
    {
        System.out.println("This is display method of PQR");
    }
}

class XYZ extends PQR implements ABC
{
    void displayD()
    {
        System.out.println("This is display method of XYZ");
    } 
    public void displayA()
    {
        System.out.println("This is display method of ABC");
    }
}


class HybridInheritance
{
    public static void main(String args[])
    {

        PQR objJ =  new PQR();
        objJ.displayJ();
        
        XYZ objD = new XYZ();
        objD.displayD();
        objD.displayJ();
        objD.displayA();
    }
}