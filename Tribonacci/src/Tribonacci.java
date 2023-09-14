public class Tribonacci {
	public static int tribonacci(int a) {
		if(a==0 || a==1) {
			return 0;
		}
		else if(a==2) {
			return 1;
		}
		else {
			return tribonacci(a-1)+tribonacci(a-2)+tribonacci(a-3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			System.out.print(tribonacci(i)+ "\t");
		}
	}

}