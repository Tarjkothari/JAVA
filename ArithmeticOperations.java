import java.util.Scanner;
class ArithmeticOperations
{
    public static void main(String args[])
    {
        int a,b,c;
        float d;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First value : ");
        a = s.nextInt();
        System.out.println("Enter the Second value : ");
        b = s.nextInt();

        do
        {
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for Subraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");
            System.out.println("Choose 5 for Modulo");

            c = s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("C = 1(Addition)");
                    d = a + b;
                    System.out.println("The answer of Addition is : "+d);
                    break;
                case 2:
                    System.out.println("C = 2(Subraction)");
                    d = a - b;
                    System.out.println("The answer of Subraction is : "+d);
                    break;
                case 3:
                    System.out.println("C = 3(Multiplication)");
                    d = a * b;
                    System.out.println("The answer of Multiplication is : "+d);
                    break;
                case 4:
                    System.out.println("C = 4(Division)");
                    d = a / b;
                    System.out.println("The answer of Division is : "+d);
                    break;
                case 5:
                    System.out.println("C = 5(Modulo)");
                    d = a % b;
                    System.out.println("The answer of Modulo is : "+d);
                    break;
                default:
                    System.out.println("Sorry ! Your input is wrong !");
                    break;
            }
        }while(c != 0 && c != 6);
    }
}