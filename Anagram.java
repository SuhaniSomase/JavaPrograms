import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter word1: ");
		        String word1 = sc.nextLine();

		        System.out.print("Enter word2: ");
		        String word2 = sc.nextLine();

		     
		        word1 = word1.toLowerCase();
		        word2 = word2.toLowerCase();

		        
		        if (word1.length() != word2.length()) {
		            System.out.println("Not an Anagram");
		        }
		        else {
		            char[] arr1 = word1.toCharArray();
		            char[] arr2 = word2.toCharArray();

		            
		            Arrays.sort(arr1);
		            Arrays.sort(arr2);

		         
		            if (Arrays.equals(arr1, arr2)) {
		                System.out.println("The words are Anagrams");
		            }
		            else {
		                System.out.println("The words are Not Anagrams");
		            }
		        }

		        sc.close();
	}

}
