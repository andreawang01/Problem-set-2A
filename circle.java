
public class circle {
    //instance variables
    double radius;
    public circle () {
        //default constructor 
        radius=1;
        
    }
    public circle(double r) {
        // constructor
        radius=r;
        
        
    }
    //Behaviour methods!
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
        
        
        
    }
    
    public double getRadius() {
        return radius;
        
    }
    public double circumference() {
        return 2* Math.PI * radius;
        
        
        
        
    }
    public double area() {
        return Math.PI * radius * radius;
        
        
        
    }
    }


