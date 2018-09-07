package quan.dev;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = 6;
		double c = 2;
		double delta = (b*b) - (4*a*c);
		double x1, x2;
		
		if (delta < 0){
			System.out.println("Phuong trinh vo nghiem");
		}
		
		else if (delta > 0){
			x1 = (-b+Math.sqrt(delta)) / (2*a);
			x2 = (-b-Math.sqrt(delta)) / (2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		else if (delta == 0) {
			x1 = -b / (2*a);
			System.out.println("Phuong trinh co nghiem kep x = " + x1);
		}
		
	}

}
