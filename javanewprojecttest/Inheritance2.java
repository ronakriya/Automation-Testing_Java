package javanewprojecttest;

public class Inheritance2 
{
    class Vehicle
    {
        String brand = "Ford";
        
        void Hello()
        {
            System.out.println("Hello");
        }
    }
    
    class Car extends Vehicle
    {
        String modelName = "Audi";
    }
    
    public static void main(String[] args)
    {
        Inheritance2 outer = new Inheritance2();
        Car myCar = outer.new Car();        
        myCar.Hello();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
    
    
}
