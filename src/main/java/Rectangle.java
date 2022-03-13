public class Rectangle {
    private double width;
    private double height;
    
public void setWidth(double width){
    this.width = width;
}
public void setHeight(double height){
    this.height = height;
}
public double getWidth(){
    return this.width;
}
public double getHeight(){
    return this.height;
}
public Rectangle(double height, double width){
    this.height = height;
    this.width = width;
    
    height = 0;
    width = 0;
}
public Rectangle(){
    
}

public void displayInfo(){
    System.out.println("Rectangle");
    System.out.println("Width: " + this.width);
    System.out.println("Height: " + this.height);
    System.out.println();
}



}
