package loop;

public class SimpleCalculater {
//2)Write a Java program to create a simple calculator.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float num1=2;
     float num2=3;
     int result;
     char operator='+';
     switch (operator) {
     case '+':{
    	 System.out.println(num1+num2);
     }break;
     case'-':{
    	 System.out.println(num1-num2);
     }break;
     case'*':{
    	 System.out.println(num1*num2);
     }break;
     case'%':{
    	 System.out.println(num1%num2);
     }break;
     case'/':{
    	 System.out.println(num1/num2);
     }
     default:{
    	 System.out.println("invalid operator");
     }
    	 
     
     }
	}

}
