class Banking
{
    int accountno;
    int Balance = 50000;
    String Name;

    void depositMoney(int deposit)
    {
        Balance = Balance + deposit;
        System.out.println("Now the Balance of your account is : " +Balance);
    }

    void withdrawMoney(int withdraw)
    {
        Balance = Balance - withdraw;
        System.out.println("Now the Balance of your account is : " +Balance);
    }

    void askBalance()
    {
        System.out.println("Your account Balance is : "+Balance);
    }
}

class Bank
{
    public static void main(String args[])
    {
        Banking b = new Banking();
        b.depositMoney(500);
        b.withdrawMoney(5000);
        b.askBalance();
    }
}