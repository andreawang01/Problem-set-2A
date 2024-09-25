public class Cylinder {
//instance variables
double height;
circle base;

//default constructor 
public Cylinder() {
    height=1;
    base=new circle();
}
// constructor
public Cylinder(double h, double r) {
    height=h; 
    base= new circle(r);
}
//behaviour methods
public String toString() {
    return "Hello, I am a cylinder with height of " + height + " and radius of " + base.getRadius() + ".";
    

} 
public double getRadius() {
    return base.getRadius();
    
    
}
public double getHeight() {
    return height;
    
    
}
public double surfaceArea() {
    return 2*Math.PI*base.getRadius()*height+ 2*Math.PI*base.getRadius()*base.getRadius();
    
}
public double volume() {
    return Math.PI*base.getRadius() *base.getRadius()*height;
}
}




    
    









    
    
    
    
    
    
    
