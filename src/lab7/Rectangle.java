/*
 *
 */
package lab7;

public class Rectangle {
//Initialize variables
    private double width;
    private double height;
//assign values to variables
    public Rectangle() {
        width = 1;
        height = 1;

    }
//Two-arguement constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
//Method to find area of rectangle
    public double getArea() {
        double area = height * width;
        return area;
    }
//Method to find perimeter of rectangle
    public double getPerimeter() {
        double perimeter = (height * 2) + (width * 2);
        return perimeter;

    }
//toString method to output results in string format
    public String toString() {
        String output = "Length: " + height + "\n"
                + "Width: " + width + "\n"
                + "Area: " + getArea() + "\n"
                + "Perimeter: " + getPerimeter();
        return output;
    }

    
}
