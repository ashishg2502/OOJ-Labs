public class Car 
{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() 
    {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) 
    {
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", "Camry", 2010);
        cars[1] = new Car("Honda", "Accord", 2012);
        cars[2] = new Car("Ford", "Mustang", 2015);
        cars[3] = new Car("Tesla", "Model S", 2020);
        cars[4] = new Car("BMW", "X5", 2018);

        for (Car car : cars) 
        {
            car.displayInfo();
        }
    }
}