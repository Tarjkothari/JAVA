class ABC
{
    void displayJ()
    {
        System.out.println("This is display method of ABC");
    }
}

class XYZ extends ABC
{
    void displayD()
    {
        System.out.println("This is display method of XYZ");
    } 
}

class XYZZ extends ABC
{
    void displayA()
    {
        System.out.println("This is display method of XYZZ");
    }
}

class HeirarchicalInheritance
{
    public static void main(String args[])
    {
      

        ABC objJ =  new ABC();
        objJ.displayJ();
        

        XYZ objD = new XYZ();
        objD.displayD();
        objD.displayJ();
       
        XYZZ objA = new XYZZ();
        objA.displayA();
        objA.displayJ();
    }
}