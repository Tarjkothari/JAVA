class Student
{
    int rollno;
    String name;

    Student()
    {
        this.rollno = 00;
        this.name = "ABC";

        System.out.println("Your Enrollment No. is : "+rollno+" and Your name is : "+name);
    }
}

class constructorDemo
{
    public static void main(String args[])
    {
        Student s = new Student();
    }
}