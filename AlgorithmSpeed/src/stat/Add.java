package stat;

public class Add {
	public static void main(String[] args) {
		long start ;
		start = System.currentTimeMillis();
		long temp = 0;
		for (long i=0;i<1000000;i++) {
			temp = temp +1;
		}
		System.out.println("first" + (System.currentTimeMillis()-start));

		start = System.currentTimeMillis();
		for (long i=0;i<1000000;i++) {
			temp = add(temp, 1);
		}
		System.out.println("second" + (System.currentTimeMillis()-start));
		}
	
	public static long add(long a, long b) {
		return a+b;
	}
}
