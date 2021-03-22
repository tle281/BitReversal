
public class BitReverse {

	public static double BinaryReversal(String str) {
		int n = Integer.valueOf(str);

		if (n == 0)
			return 0;

		int ans = 0;
		for (int i = 0; i < 8; i++) {
			ans <<= 1;
			if ((n & 1) == 1)
				ans++;
			n >>= 1;
		}

		return ans / 1.0;

	}

	public static void main(String[] args) {
		String str = "47";
		System.out.println(BinaryReversal(str));

	}

}
