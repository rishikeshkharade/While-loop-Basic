
public class Sum {
	public static void main(String[] args) {
		int N=10;
		int i=0;
		int sum=0;
		int sum1=1;
		while (i <= N) {
			if (i%2==0) {
			sum = sum+i;
			
			}
			else {
				sum1 = sum1*i;
			}i++;}
			System.out.println("sum of even numbers between 1 to 10 = " + sum);
			System.out.println("sum of odd numbers between 1 to 10 = " 	+ sum1);;
		}}
