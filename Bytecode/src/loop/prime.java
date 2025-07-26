package loop;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=9;int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%1==0)
			{
				count++;
			}
		}
			if (count==1) { 
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		
	}

}
