class base
{
    int b1 = 10;
    public int b2 = 20;
    protected int b3 = 30;
    private int b4 = 40;
}

class derive extends base
{
    int d1 = 50;
    public int d2 = 60;
    protected int d3 = 70;
    private int d4 = 80;
}

class accessmodifierDemo
{
    public static void main(String args[])
    {
        base objb = new base();
        System.out.println(objb.b1);
        System.out.println(objb.b2);
        System.out.println(objb.b3);
        //System.out.println(objb.b4);

        derive objd = new derive();
        System.out.println(objd.b1);
        System.out.println(objd.b2);
        System.out.println(objd.b3);
        //System.out.println(objb.b4);
    }
}