import java.util.Scanner;
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int [] VectorX=new int[10];
		int [] VectorY= new int[10];
		int [] XAngle=new int [10];
		int [] YAngle=new int[10];
		double [] DotProduct=new double [10];
		double Angle=0;
		double SumofDotProduct=0.0;
		double[] AngleArray=new double[10];
		
		System.out.println("Welcome to the Vectores Programme!");
		System.out.println("Please Enter Modulies & Angles of 10 Elements for Vector X Array (X1,X2,...,X10) : ");
		
		for(int i=0; i<VectorX.length;i++) {
			System.out.print("X"+ (i+1) +"\t Moduli: ");
			VectorX[i]=input.nextInt();
			System.out.print("\t"+ "Angle(in Degrees[0-360])");
			XAngle[i]=input.nextInt();	
			}		
	System.out.println("Please Enter Modulies & Angles of 10 Elements for Vector Y Array (Y1,Y2,...,Y10) : ");
		
		for(int i=0; i<VectorY.length;i++) {
			System.out.print("Y"+ (i+1) +"\t Moduli: ");
			VectorY[i]=input.nextInt();
			System.out.print("\t"+ "Angle(in Degrees[0-360])");
			YAngle[i]=input.nextInt();	
			}	
		input.close();
		
		//Calculation
		for(int i=0;i<VectorX.length;i++) {
			if(XAngle[i]>YAngle[i]) 
				Angle=XAngle[i]-YAngle[i];
			else
				Angle=YAngle[i]-XAngle[i];
			
			double AngleN =Angle%90;
			if(Angle==0 )
				AngleArray[i]=0.0;
			
			if( AngleN>0 && AngleN<18) {
				AngleArray[i]=1.0;
			}
			else if(AngleN>17 && AngleN<32) {
				AngleArray[i]=0.9;
			}
			else if(AngleN>31 && AngleN<42) {
				AngleArray[i]=0.8;
			}
			else if(AngleN>41 && AngleN<50) {
				AngleArray[i]=0.7;
			}
			else if(AngleN>49 && AngleN<57 ) {
				AngleArray[i]=0.6;
			}
			else if(AngleN>56 && AngleN<64) {
				AngleArray[i]=0.5;
			}
			else if(AngleN>63 && AngleN<70) {
				AngleArray[i]=0.4;
			}
			else if(AngleN>69 && AngleN<76) {
				AngleArray[i]=0.3;
			}
			else if(AngleN>75 && AngleN<82) {
				AngleArray[i]=0.2;
			}
			else if(AngleN>81 && AngleN<88) {
				AngleArray[i]=0.1;
			}
			else if(AngleN>87 && AngleN<91) {
				AngleArray[i]=0.0;
			}
			if ((Angle/90)==4 || (Angle/90)==0 || (Angle/90)<1 ) {
				AngleArray[i]=AngleArray[i];
			}
			else if((Angle/90)<2 || (Angle/90)<3)
				AngleArray[i]=AngleArray[i]*(-1);
			else if((Angle/90)<4)
				AngleArray[i]=AngleArray[i];
				
		}
		for(int i=0;i<10;i++) {
			DotProduct[i]=VectorX[i]*VectorY[i]*AngleArray[i];
			SumofDotProduct+=DotProduct[i];
		}
		System.out.println();
		System.out.format("Sum of Dot Products is : %f",SumofDotProduct);

	
	}

}
