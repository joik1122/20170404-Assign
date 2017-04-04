public class Cylinder extends Circle {
	
	double height;
	double weight = getArea();

	public Cylinder(Circle circle,double height) {
		
		super(radius);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getVolume(double height,double circle){
		this.weight = circle;
		this.height = height;
		return height*circle;
	}
	
	public static void main(String[] args){
		
		Cylinder cd = new Cylinder(new Circle(2.8),5.6);
		cd.height = 5.6;
		System.out.println(cd.getVolume(cd.height,cd.weight));
		
	}
	
	
	

}
