import java.util.Scanner;
public class PalindromePracticalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		boolean isPalindrome=true;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter any word :");
		word=input.next().toLowerCase();
		
		for(int i=0,j=word.length()-1;i<word.length() && j>-1;i++,j--) {
			if(word.charAt(i)!= word.charAt(j)){
				isPalindrome=false;
				break;
				
			}
		}
		if(isPalindrome) {
			System.out.println(word + " " +"is a palindrome");
		}
		else {
			System.out.println(word + " " +"is not a palindrome");
		}

	}

}
