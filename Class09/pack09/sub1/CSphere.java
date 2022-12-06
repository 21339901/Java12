package pack9.sub1;

public class CSphere {
	public double radius;
	
	public CSphere(double r){
		radius = r;
	}
	
	public void show() {
		System.out.println("radius = " + radius);
		System.out.println("volume = " + (4.0/3.0*Math.PI*Math.pow(radius, 3)));
	}
}
