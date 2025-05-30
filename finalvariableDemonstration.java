class Student
{
    final int data = 100;
    void increment()
    {
        data++;
    }
}

class finalvariableDemonstration
{
    public static void main(String args[])
    {
        Student s = new Student();
        System.out.println(s.data);
        s.increment();
        System.out.println(s.data);
    }
}
