import java.util.Arrays;
import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize inputs to the system
		Scanner input=new Scanner(System.in);
				
		//Arrays Declaration with Size
		int [] NumberArray;
		NumberArray =new int[10];
		
		//Additional Array for Memorize NumberArray Initial Values  
		int [] Survivor= new int[10];
		
		//Variables Declaration
		int Option, Summation=0;
		double Average=10;
		
		//Terminator Declaration
		boolean Terminate=false;
	
		//Display Users to enter ten integers
		System.out.println("Welcome to My Programme....");
		System.out.println("Enter Ten(10) Integers One by One :");
		System.out.println();
		
		
		//Put input integers in the NumberArray
		for(int i=0;i<10;i++) {
		System.out.format("Integer %d :",(i+1));
		NumberArray[i]=input.nextInt();
		if(i==9) {
			System.out.println("You have Entered ten integers!");
			System.out.println();
		}
		}
		
		//Display Array Operation main menu
		 try {
		while(!Terminate==true){
		
		System.out.println("		"+ "Array Operation Main Menu");
		System.out.println();
		System.out.println("1: Summation of the Elements");
		System.out.println("2: Average of the Elements");
		System.out.println("3: Sort the elements");
		System.out.println("4: Display the elements");
		System.out.println("5: Display the reverse order");
		System.out.println("6: Exit");
		System.out.print("Enter Your option :");
		
		//Identify what user need to execute
		Option=input.nextInt();
		switch(Option) {
		case 1:
			//Calculate and display the summation of array elements.
			for(int i=0;i<10;i++) {
				Summation+=NumberArray[i];
			}
			System.out.format("Summation of the Elements is : %d",Summation);
			System.out.println();
			System.out.println();
			Summation =0;
			Thread.sleep(1000);
			continue;
			
		case 2:
			//Calculate and display average of the array elements.
			for(int i=0;i<10;i++) {
				
				Summation+=NumberArray[i];
			}
			double Sum=Summation;
			Average= Sum/10.0;
			System.out.format("Average of the Elements is : %f",Average);
			Thread.sleep(1000);
			System.out.println();
			System.out.println();
			continue;
		
		case 3:
			//Sort the array elements in ascending order.
			for(int i=0;i<10;i++)
				Survivor[i]=NumberArray[i];
			/*Arrays.sort(NumberArray, 0,10);
			System.out.format("Acending order of the Integer Array  is :%s",Arrays.toString(NumberArray));
			*/
			for(int i=0;i<NumberArray.length;i++) {
				for(int j=0; j< NumberArray.length-i-1;j++) {
					if(NumberArray[j]>NumberArray[j+1]) {
						int temp=NumberArray[j];
						NumberArray[j]=NumberArray[j+1];
						NumberArray[j+1]=temp;
					}
				}
			}
			System.out.format("Acending order of the Integer Array  is :%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
					NumberArray[0],NumberArray[1],NumberArray[2],NumberArray[3],NumberArray[4],NumberArray[5],
					NumberArray[6],NumberArray[7],NumberArray[8],NumberArray[9]);
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
				NumberArray[i]=Survivor[i];
			System.out.println();
			System.out.println();
			continue;
			
		case 4:
			//Display the array elements
			System.out.format("Array Elements  :%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
					NumberArray[0],NumberArray[1],NumberArray[2],NumberArray[3],NumberArray[4],NumberArray[5],
					NumberArray[6],NumberArray[7],NumberArray[8],NumberArray[9]);
			Thread.sleep(1000);
			System.out.println();
			System.out.println();
			continue;
			
		case 5:
			//Display the array elements in reverse order.
			System.out.format("Array Elements in Reverse Order  :%n %n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n %d%n",
					NumberArray[9],NumberArray[8],NumberArray[7],NumberArray[6],NumberArray[5],NumberArray[4],
					NumberArray[3],NumberArray[2],NumberArray[1],NumberArray[0]);
			Thread.sleep(1000);
			System.out.println();
			System.out.println();
			continue;
			
		case 6:
			//Quit the program.
			Terminate=true;
			input.close();
			System.out.println();
			System.out.format("Programme Terminated!%n  Have a nice day!");
			Thread.sleep(1000);
			continue;
			
		default :
			//Error Message
			System.out.println("Invalid Option");
			continue;
		}
		}
		//Exception Handling
		 }catch(Exception e) {
	            System.out.println("System.in was closed; exiting");
		 }
		
	
		

	}

}
