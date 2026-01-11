package methods;
import java.util.*;

public class Xylem_Phloem_number {
	
	public static String check_xylem_phloem(int num) {
			      int sum_1=0;
			      int sum_2=0;
			      int original = num;
			      sum_1 = num % 10;
			      num = num / 10;
			      while(num > 9) {
			         sum_2 = sum_2 + num % 10;
			         num = num / 10;
			      }
			      sum_1 = sum_1 + num;
			      if(sum_1 == sum_2)
			         return "Xylem number";
			      else
			         return "Phloem number";
			   
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
			      
		System.out.println(check_xylem_phloem(n));
	}
}
