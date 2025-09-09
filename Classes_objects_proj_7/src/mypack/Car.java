package mypack;

public class Car {
    private String brand;
    private double price;

    Car() {
        this("Unknown", 0);  
    }

    
    Car(String brand) {
        this(brand, 0);  
    }

    
    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

   
    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("BMW", 50000);

        c1.display();
        c2.display();
        c3.display();
    }
}

