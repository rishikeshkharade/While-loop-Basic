
public class palindrome {
	public static void main(String[] args) {
		int i= 2332;
		int rev =0;
		int temp = i;
		while (temp!=0) {
			rev = rev*10 + temp%10;
			temp=temp/10;;
		}if (i==rev) {
			System.out.println("palindrome");
		}else { System.out.println("Not palindrome");
		}
	}

}
