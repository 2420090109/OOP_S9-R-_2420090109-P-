package mypack;

class Box {
    private double length;
    private double width;
    private double height;

   
    Box() {
        this(1, 1, 1);  
    }

    
    Box(double length, double width) {
        this(length, width, 1);  
    }

   
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    double volume() {
        return length * width * height;
    }

    
    void display() {
        System.out.println("Length: " + length + ", Width: " + width +
                           ", Height: " + height + ", Volume: " + volume());
    }

   
    public static void main(String[] args) {
        Box b1 = new Box();            
        Box b2 = new Box(5, 4);        
        Box b3 = new Box(3, 2, 6);     

        b1.display();
        b2.display();
        b3.display();
    }
}

