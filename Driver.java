
public class Driver {
    public static void main (String[] args) {
     // instantiation
    circle c1= new circle();
    circle c2= new circle (5);
    
    System.out.println(c1.toString());
    System.out.println("getRadius() --> " + c1.getRadius() + " units.");
    System.out.println("circumference()--> "  + c1.circumference() + " units.");
    System.out.println("area()--> "  + c1.area() + " units^2.");
    System.out.println(c2);
    System.out.println("circumference() --> " +c2.circumference() + " units.");
    System.out.println("area()--> "  + c2.area() + " units^2.");
    
    Cylinder cl1= new Cylinder ();
    Cylinder cl2= new Cylinder (5,5);
    
    System.out.println(cl1.toString());
    System.out.println("getRadius() --> " + cl1.getRadius() + " units.");
    System.out.println("getHeight()--> "  + cl1.getHeight() + " units.");
    System.out.println("surface area()--> "  + cl1.surfaceArea() + " units^2.");
    System.out.println("volume()--> "  + cl1.volume() + " units^2.");    
    System.out.println(cl2.toString());
    System.out.println("getRadius() --> " + cl2.getRadius() + " units.");
    System.out.println("getHeight()--> "  + cl2.getHeight() + " units.");
    System.out.println("surface area()--> "  + cl2.surfaceArea() + " units^2.");
    System.out.println("volume()--> "  + cl2.volume() + " units^2.");    
    

    
    
    
    
    
    
    
    
    
    
    
     
     
    
    }   
}