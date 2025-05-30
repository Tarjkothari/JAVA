public class Car
 {

    private String model;
    private String color;
    private String brand;

  
    public void setData(String mdl, String clr, String brnd) {
        model = mdl;
        color = clr;
        brand = brnd;
    }


    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println();
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setData("City", "White", "Honda");
        car2.setData("Desire", "Red", "Maruti");
        car3.setData("XUV500", "Maroon", "Mahindra");

        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();
    }
}