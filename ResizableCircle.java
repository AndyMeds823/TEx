package Ex1;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}	

	@Override
	public void resize(double percent) {
		radius *= (1+percent);		
	}
	public String toString() {
		return "Resizable [radius ="+ radius+"]";
		
	}
}
