class ComplexNumber 
{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() 
    {
        return real;
    }

    public double getImaginary() 
    {
        return imaginary;
    }

    public void display() 
    {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Calculator 
{

    public int add(int a, int b) 
    {
        return a + b;
    }
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        double realSum = c1.getReal() + c2.getReal();
        double imaginarySum = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();

        // Integer addition
        int sum = calc.add(10, 20);
        System.out.println("Sum of integers: " + sum);

        // Complex number addition
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);
        ComplexNumber complexSum = calc.add(c1, c2);

        System.out.print("Sum of complex numbers: ");
        complexSum.display();
    }
}
