class Mehulbhai
{
    final void show()
    {
        System.out.println("This is a show method of mehulbhai");
    }
}

class Tarj extends Mehulbhai
{
    void show()
    {
        System.out.println("This is a show method of Tarj");
    }
}

class finalmethodDemonstration
{
    public static void main(String args[])
    {
        Mehulbhai m = new Mehulbhai();
        Tarj t = new Tarj();
        m.show();
        t.show();
    }
}
