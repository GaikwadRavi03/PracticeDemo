package basicprograms;

public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		System.out.println("given no is:" + n);
		for (int i = 2; i <= n ; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}
}
