package experiment1;

public class experiment1 {
	public static void main (String[] args) {
		   double a = -10.0;
		   double b =5.0; 
		   double delta = 0.001;
		   double m;
		   double answer;
		   if(f(a)<delta&&f(a)>(-delta)){
			   System.out.println(a);
			   }
		     else if(f(b)<delta&&f(b)>(-delta)){
		    	 System.out.println(b);
		    	 }
		     else 
		     {while(true)
		         {
		         if(f(a)*f(b)<0)
		            { m=(a+b)/2;
		             if(f(m)<delta&&f(m)>(-delta)){answer=m;break;}
		             else if(f(a)*f(m)<0)b=m;
		                   else a=m;
		            }
		         }
		   System.out.println(answer);}
		}
	static double f(double x){ 
		double y;
		y=x*x*x -10 *x + 23;
		return y;
		}
}
