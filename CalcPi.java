// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num=Integer.parseInt(args[0]);
		double sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+= Math.pow(-1.0,i+1)*(1.0/(2*i-1));
		}
		System.out.println(4*sum);
	}
}
