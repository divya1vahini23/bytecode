package loop;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println("perfect "+num);
		else
			System.out.println("not perfect "+num);

	}

}
