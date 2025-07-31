package loop;

public class CountOfPositiveIntegers {
/*1)Write a Java program that reads an positive integer and count 
 * the number   of digits.*///////////
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int num=123456;
		int count=0;
		for (int temp=num;temp!=0;temp=temp/10) {
			count++;
		}
		System.out.println(+num+ "is"+count);
	}
}
