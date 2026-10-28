package programming;
import java.util.Scanner;

public class Polindrom {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        String out="";
	        for(int i=input.length()-1; i>=0; i--)
	        {
	             out+=input.charAt(i);
	        }
	      
	            System.out.println(input.equals(out) ? "Yes" : "No");

	        
	       
	    }
	}


