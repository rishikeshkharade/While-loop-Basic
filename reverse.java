
public class reverse {
	public static void main(String[] args) {
	int i = 942111423;
		int rev=0;
		int rem = 0;
		int temp = i;
		while (temp!=0) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;}
			System.out.println(i+" rev= "+rev);
	}}        