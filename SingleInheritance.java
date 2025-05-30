class Mehulbhai
{
    void displayJ()
    {
        System.out.println("This is display method of Mehulbhai");
    }
}

class Tarj extends Mehulbhai
{
    void displayD()
    {
        System.out.println("This is display method of Tarj");
    } 
}
class singleInheritance
{
    public static void main(String args[])
    {
        Mehulbhai objJ =  new Mehulbhai();
        objJ.displayJ();

        Tarj objD = new Tarj();
        objD.displayD();
        //objD.displayJ();
    }
}