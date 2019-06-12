package experiment5;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class experiment5 {
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/Lenovo/Desktop/score.txt");
		int[] a = getLineFromTxt(file,";");
		int max=Max(a);
		int min=Min(a);
		double average=Average(a);
		int _60=count(a,60,69);
		int _70=count(a,70,79);
		int _80=count(a,80,89);
		int _90=count(a,90,100);
		//写入
		File file2 = new File("/Users/Lenovo/Desktop/score_1.txt");
	    FileWriter writer = new FileWriter(file2, false);
	    for(int i=0;i<52;i++)
	        writer.write((i+1)+";"+a[i]+'\n');
	    writer.write("max="+max+'\n');
	    writer.write("min="+min+'\n');
	    writer.write("average="+average+'\n');
	    writer.write("60~69:"+_60+'\n');
	    writer.write("70~79:"+_70+'\n');
	    writer.write("80~89:"+_80+'\n');
	    writer.write("90~100:"+_90+'\n');
	    writer.close();
		} 
		
		public static int[] getLineFromTxt(File file, String split) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String Line;
		String[] arrs=new String[52];
		for(int i=0;i<52;i++) {
			Line= br.readLine(); 
			String[] a=Line.split(";");
			arrs[i]=a[1];		
		}
		int[] arr = new int[52];
		for(int i = 0; i< 52; i++){
		arr[i] = Integer.parseInt(arrs[i]);
		}
		if(br!= null){
		br.close();
		br = null;
		}
		return arr;
		}
		public static int Max(int[] A)throws Exception {
			int max=0;
			for(int i=0;i<A.length;i++) {
				max=max>A[i]?max:A[i];
			}	
			return max;
		}
		public static int Min(int[] A)throws Exception {
			int min=100000;
			for(int i=0;i<A.length;i++) {
				min=min<A[i]?min:A[i];
			}	
			return min;
		}
		public static double Average(int[] A)throws Exception{
			int total=0;
			int n=A.length;
			double average=0;
			for(int i=0;i<n;i++)total+=A[i];
			average=(double)total/(double)n;
			return average;
		}
		public static int count(int[] A,int l,int r)throws Exception {
			int n=0;
			for(int i=0;i<A.length;i++) 
				if(A[i]>=l&&A[i]<=r) n++;
			return n;
		}
}
