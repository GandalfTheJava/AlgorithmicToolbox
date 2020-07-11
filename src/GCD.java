

public class GCD {

	public static void main(String[] args) {
		
		System.out.println(Euc(357,234));

	}

	private static int Euc(int a,int b) {
		if(b == 0) return a;
		//
		return Euc(b, a%b);
	}
}
