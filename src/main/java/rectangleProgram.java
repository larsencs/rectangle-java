public class rectangleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);
        double area = calcArea(rectangle);
        double perimeter = calcPerimeter(rectangle);
        rectangle.displayInfo();
        System.out.println("Rectangle Area: " +area);
        System.out.println( "Rectangle Perimeter: " +perimeter);
        
        
        
    }
    
    public static double calcArea(Rectangle rectangle){

        double area = rectangle.getHeight() * rectangle.getWidth();
        return area;
    }
    public static double calcPerimeter(Rectangle rectangle){
        double perimeter = (rectangle.getHeight() + rectangle.getWidth()) * 2;
        return perimeter;
    }
    
}
