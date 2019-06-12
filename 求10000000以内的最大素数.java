package experiment2;

public class experiment2 {
	public static void main(String[] args)
	{     long n=10000000;
	     A: for(long i=n;i>0;i--)
	   {
		   for(long m=2;m<i;m++)
			   if(i%m==0)continue A;
			   System.out.println(i); break;
	   }
	 }
}
