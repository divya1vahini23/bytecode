package operators;
//Length and breadth of a rectangle are 5 and 7 respectively.
//Write a program to calculate the area and perimeter of the rectangle.

public class Perimeter {
	public static void main(String[] arg){
   int length=5,bredth=7;
   int area=length*bredth;
   int perimeter=2*(length+bredth);
    System.out.println("area of a rectangle " +area);
    System.out.println("perimeter of rectangle " +perimeter);
     }
}
