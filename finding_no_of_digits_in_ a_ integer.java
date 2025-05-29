package jan23project;
import java.util.*;
public class ASCII{ 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		if(num==0) {
			count=1;}
		else {
			while(num>0) {
				count++;
				num=num/10;
			}
		}
		System.out.println(count);
		}
			
		}