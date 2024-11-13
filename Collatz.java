// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int times=Integer.parseInt(args[0]);
		String mode =args[1];
		if(mode.equals("v"))
		{
			for(int i=1;i<=times;i++)
			{
				int steps=1;
				int num= i;
				System.out.print(num+" ");
				if(num==1)
				{
					steps++;
					num=4;
					System.out.print(num+" ");
				}
				while(num!=1)
				{
					if(num%2==0)
						num/=2;
					else
						num = num*3+1;
					steps++;
					System.out.print(num+" ");
				}
				System.out.println("("+steps+")");
			}
		}
		System.out.println("Every one of the first " + times + " hailstone sequences reached 1.");
		


	}
}
