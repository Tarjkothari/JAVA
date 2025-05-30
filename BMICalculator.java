import java.util.Scanner;
class person
{
    double bmi;
    void calculator(float w, float h)
    {
        double height,weight;
        height = h;
        weight = w;
        height = h*0.3048;
        bmi = weight/(height*height);
        System.out.println("Your BMI is : " + bmi);

        if(bmi < 18.5)
        {
            System.out.println("Your BMI weight is Under-Weight");
        }
        else if(bmi > 18.5 && bmi < 24.9)
        {
            System.out.println("Your BMI weight is Normal");
        }
        else if(bmi > 25.0 && bmi < 29.9)
        {
            System.out.println("Your BMI weight is Over-Weight");
        }
    }
}

class BMICalculator
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float w,h;
        System.out.println("Enter Weight : ");
        w = s.nextFloat();
        System.out.println("Enter Height : ");
        h = s.nextFloat();

        person p = new person();
        p.calculator(w,h);
    }
}