import java.util.Scanner;
class marks
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of Students : ");

        System.out.println("Marks 1 : ");
        int i = s.nextInt();
        
        System.out.println("Marks 2 : ");
        int i1 = s.nextInt();
        
        System.out.println("Marks 3 : ");
        int i2 = s.nextInt();

        float per = ((i+i1+i2)*100)/150;
        System.out.println(per+"%");

        if(per >= 70)
            System.out.println("A");
        else if(per >= 60)
            System.out.println("B");
        else if(per >= 50)
            System.out.println("C");
        else if(per >= 40)
            System.out.println("D");
        else
            System.out.println("Sorry ! Better Luck Next Time !");
    }
}