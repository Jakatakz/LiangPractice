//package p13;
//
//public class P13Triangle extends GeometricObject {
//
//		private double side1;
//		private double side2;
//		private double side3;
//		
//		P13Triangle() 
//		{
//			this.side1 = 1;
//			this.side2 = 1;
//			this.side3 = 1;
//		}
//		
//		P13Triangle(double side1, double side2, double side3)
//		{
//			this.side1 = side1;
//			this.side2 = side2;
//			this.side3 = side3;
//			isValidTriangle();
//		}
//		
//		//need to check if valid triangle (a triangle is valid if sum of its two sides 
//		//is greater than the third side
//		private boolean isValidTriangle()
//		{
//			boolean isValid = true;
//			if ( ((side1+side2) > side3) && ((side1+side3) > side2) && ((side2+side3) > side1))
//				return isValid;
//			else
//			{
//				System.out.println("not a valid triangle");
//				System.exit(1);
//				return !isValid;		//shouldn't execute
//			}
//		}
//		
//	
//
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		double s = ( (side1+side2+side3) / 2);
//		double area = Math.sqrt( (s * (s-side1) * (s-side2) * (s-side3) ));
//		return area;
//	}
//
//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return side1+side2+side3;
//	}
//
//}
