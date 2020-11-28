package p09;

class E01Rectangle {


		private double width;
		private double height;
		
		E01Rectangle()
		{
			this.width = 1;
			this.height = 1;
		}
		
		E01Rectangle(double width, double height)
		{
			this.width = width;
			this.height = height;
		}
		
		double getArea()
		{
			return this.width * this.height;
		}
		
		double getPerimeter()
		{
			return 2*this.width + 2*this.height;
		}
		
		@Override
		public String toString()
		{
			return "width: " + width + "\nheight: " + height + "\narea: " + getArea() 
			+ "\nperimeter: " + getPerimeter();
		}

}
