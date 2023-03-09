package Task0;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	Triangle(){
		side1=0;
		side2=0;
		side3=0;
		
	}
	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
   public boolean is_RightAngle() {
	   if((Math.pow(side1,2)+Math.pow(side2, 2))==Math.pow(side3, 2)) 
		   return true;
	   if((Math.pow(2, 2)+Math.pow(1, 2))==Math.pow(3, 2)) 
		   return true;
	   if((Math.pow(3, 2)+Math.pow(2, 2))==Math.pow(1, 2)) 
		   return true;
	   else
		  return false;
	   
	   }
   public boolean is_isoleces() {
	 if ((side1)==(side2))
		 return true ;
	 if ((side2)==(side3))
	return true;
	 if ((side3)==(side1))
		 return true;
	 else 
		 return false;
	
			 
		   
   }
   public boolean is_equilateral() {
	   if((side1==side2==side3)&&(side1+side2+side3==0)
			   return true;
	   else 
		   return false;
   }

	

}
