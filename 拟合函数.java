package experiment4;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class experiment4 {
	
public static void main(String[] args) throws Exception{
		File file = new File("/Users/Lenovo/Desktop/LR_ex1.txt");
		int N;
		N=200;
		double[] X = getLineFromTxt(file,"\t",N,1);
		double[] Y = getLineFromTxt(file,"\t",N,2);
		double totalx=x(X);
		double totaly=y(Y);
		double totalx2=x2(X);
		double totalxy=xy(X,Y);		
		double A;
		double B;
		B=(totaly*totalx2-totalx*totalxy)/(N*totalx2-totalx*totalx);
		A=(totalxy*(N*totalx2-totalx*totalx)-totalx*(totaly*totalx2-totalx*totalxy))/((N*totalx2-totalx*totalx)*totalx2);
		System.out.println("y="+A+"x+"+B);
	}
	
	public static double[] getLineFromTxt(File file, String split,int n,int j) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String Line;
		String[] arrs=new String[n];
		for(int i=0;i<n;i++) {
			Line= br.readLine(); 
			String[] a=Line.split("\t");
			arrs[i]=a[j];		
		}
		
		double[] arr = new double[n];
		for(int i = 0; i< n; i++){
		arr[i] = Double.parseDouble(arrs[i]);
		}
		if(br!= null){
		br.close();
		br = null;
		}
		return arr;
		}
	public static double x2 (double[]A)throws Exception {
		double total=0;
		for(int i=0;i<A.length;i++)
			total+=A[i]*A[i];
		return total;
	}
	public static double x(double[]A )throws Exception {
		double total=0;
		for(int i=0;i<A.length;i++)
			total+=A[i];
		return total;
	}
	public static double xy(double[]A,double[]B)throws Exception{
		double total=0;
		for(int i=0;i<A.length;i++)
			total+=A[i]*B[i];
		return total;
	}
	public static double y(double[]A )throws Exception {
		double total=0;
		for(int i=0;i<A.length;i++)
			total+=A[i];
		return total;
	}
}
