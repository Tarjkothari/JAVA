class armstrong
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int reminder = 0;
        int sum = 0;
        double result = 0;
        int no = n;

        while(n!=0)
        {
            reminder = n%10;
            result = result + Math.pow(reminder,3);
            n = n/10;
        }
        if(result == no)
        {
            System.out.println("The number is an Armstrong Number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
    }
}