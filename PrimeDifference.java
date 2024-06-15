/**
 * 
 */
package interview1;
import java.util.Arrays;
/**
 * 
 */
public class PrimeDifference {
	 public static void main(String[] args) {
	        int limit = 500100;
	        boolean[] isPrime = sieveOfEratosthenes(limit);
	        
	        int largestPrimeBelow = 0;
	        int smallestPrimeAbove = 0;
	        
	        for (int i = 499999; i > 1; i--) {
	            if (isPrime[i]) {
	                largestPrimeBelow = i;
	                break;
	            }
	        }
	        
	        for (int i = 500001; i < limit; i++) {
	            if (isPrime[i]) {
	                smallestPrimeAbove = i;
	                break;
	            }
	        }
	        
	        int difference = smallestPrimeAbove - largestPrimeBelow;
	        
	        System.out.println("The largest prime number less than 500,000 is: " + largestPrimeBelow);
	        System.out.println("The smallest prime number greater than 500,000 is: " + smallestPrimeAbove);
	        System.out.println("The difference between the two prime numbers is: " + difference);
	   
} 

	    private static boolean[] sieveOfEratosthenes(int limit) {
	        boolean[] isPrime = new boolean[limit + 1];
	        Arrays.fill(isPrime, true);
	        isPrime[0] = false;
	        isPrime[1] = false;
	        
	        for (int i = 2; i * i <= limit; i++) {
	            if (isPrime[i]) {
	                for (int j = i * i; j <= limit; j += i) {
	                    isPrime[j] = false;
	                }
	            }
	        }
	        
	        return isPrime;
	    }
	}
	 
