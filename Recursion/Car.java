/*Create a class Car with private fields make, model, and price. Implement getter
and setter methods for these fields. Write a method applyDiscount() that applies a
discount to the car's price. Instantiate a Car object, apply a discount, and print the
details. */ 
    
public class Car{
    private String make;
    private String model;
    private double price;

    public Car(String make, String model, double price){
        this.make=make;
        this.model=model;
        this.price=price;
    }

    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public void applyDiscount(double discount){
        price=price*(1-discount);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 25000);
        car.applyDiscount(0.2);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Price: $" + car.getPrice());
    }
}
