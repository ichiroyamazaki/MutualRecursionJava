import java.util.*;

public class MutualRecursion{
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
		System.out.print("Enter a Number: ");
		num = input.nextInt();
	        if (Even(num)) {
	            System.out.println(num + " is an even number.\n");
	        } else {
	            System.out.println(num + " is an odd number.\n");
	        }
		
		}
	}
	    public static boolean Even(int n) {
	        if (n == 0) {
	            return true;
	        } else {
	            return Odd(n - 1);
	        }
	    }

	
	    public static boolean Odd(int n) {
	        if (n == 0) {
	            return false;
	        } else {
	            return Even(n - 1);
	        }
	    }
		}
