
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr1=new int[3][4];
		
		//Inserting first row
		arr1[0][0]=5;
		arr1[0][1]=7;
		arr1[0][2]=9;
		arr1[0][3]=3;
		
		//Inserting second row
		arr1[1][0]=4;
		arr1[1][1]=6;
		arr1[1][2]=1;
		arr1[1][3]=5;
		
		//Inserting first row
		arr1[2][0]=2;
		arr1[2][1]=8;
		arr1[2][2]=9;
		arr1[2][3]=7;
		
		//printing
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
				
	}

}
