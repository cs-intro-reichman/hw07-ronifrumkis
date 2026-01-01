/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		//// Replace this comment with your code
		double height = Math.sqrt(3) / 2;
		sierpinski(n, 0.0, 0.0, 1.0, 0.0, 0.5, height);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double y1, double x2,
		                                 double y2, double x3, double y3) {
		//// Replace this comment with your code
		if (n == 0) {
			StdDraw.line (x1,y1,x2,y2);
			StdDraw.line (x2,y2,x3,y3);
			StdDraw.line (x3,y3,x1,y1);
			return;
		}
		double x12 = (x1 + x2) / 2;
		double y12 = (y1 + y2) / 2;
		double x23 = (x2 + x3) / 2;
		double y23 = (y2 + y3) / 2;
		double x31 = (x3 + x1) / 2;
		double y31 = (y3 + y1) / 2;
		
		sierpinski(n - 1, x1, y1, x12, y12, x31, y31);
		sierpinski(n - 1, x2, y2, x12, y12, x23, y23);
		sierpinski(n - 1, x3, y3, x31, y31, x23, y23);
	}
}
