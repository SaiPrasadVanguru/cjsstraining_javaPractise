package Practise;
import java.util.Scanner;
public class Alphabets {
	
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	String s ="";
	    	System.out.println("Enter the  alphabet to come first at first sequence");
	    	char f = scan.next().charAt(0);
	    	System.out.println("Enter the  alphabet to come last at last sequence");
	    	char l = scan.next().charAt(0);
	    	System.out.println("Enter the  alphabet to come in last at first sequence");
	    	char fl = scan.next().charAt(0);
	    	System.out.println("Enter the alphabet to come last at second sequence");
	    	char ll = scan.next().charAt(0);
	        for (char c1=f,c3 = l; c1 <= fl&&c3<=ll; c1++,c3++) {
	         
	        

	            		 for (char c2 = 'A'; c2 <= 'Z'; c2++) {	
	            	if(c2=='A'||c2=='E'|| c2=='I'||c2=='O'||c2=='U')
	            		
	            	{
	            		
		            	
	            	
	            		
	                 s = s+c1 + c2 +c3+" ";
	                 
	                
	            	}
	            }
	        }
	    
	        System.out.println(s);
	   String[] words = s.split(" ");
	   for(String a : words)
	   {
		   int sum=0;
		   for(int i=0;i<=a.length()-1;i++)
		   {
			   sum = sum+a.charAt(i)-'@';
		   }
		   System.out.print(sum+" ");
	   }
	   
	   
}
}


