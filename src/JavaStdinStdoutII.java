import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaStdinStdoutII {

	public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		 
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	        
	   
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
	    }
	
	}


