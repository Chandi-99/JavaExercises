import java.util.Scanner;
public class MeanandStandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int Size,Sum=0;
		int[] Population;
		System.out.print("Enter the Size of Population : ");
		Size=input.nextInt();
		Population=new int[Size];
		System.out.println("Enter observations one by one! ");
		
		for(int i=0;i<Size;i++) {
			System.out.format("Enter Observation %d : ",i+1);
			Population[i]=input.nextInt();
			Sum+=Population[i];		
		}
		double Mean=1;
		Mean = Sum/Size;
		double SD1=0;
		for(int i=0; i<Size;i++) {
			SD1 +=Math.pow(Population[i]-Mean,2);
		}
		double SD2=Math.sqrt(SD1/Size);
		
		System.out.format("Mean of the Population is : %f",Mean);
		System.out.println();
		System.out.format("Sample Deviation of the Population is : %f",SD2);
		
	}

}
