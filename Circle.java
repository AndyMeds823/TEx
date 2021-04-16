package Ex1;

public abstract class Circle implements Geometric {
protected double radius;

public Circle(double radius) {
	this.radius = radius;
}

@Override
public double getPerimeter() {
	double perimeter =  2 * 3.1416 * radius;
 return perimeter;	
}

@Override
public double getArea() {
	double area = Math.PI*Math.pow(radius, 2);
	return area;
	}



}
