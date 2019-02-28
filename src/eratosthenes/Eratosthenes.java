/*
 * Sieve of Eratosthenes
 * created by Williambd
 * on 2019-02-28
 * TO find all prime numbers between 1 and integer N
 */

package eratosthenes;

import java.util.Arrays;

/**
 *
 * @author lidea9928
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] numbers = new boolean[1000];
        Arrays.fill(numbers,true);
        
        for (int i=1; i<numbers.length; i++){
            if (numbers[i]==true){
                // If prime: sets every multiple to false.
                for(int j=i+(i+1); j<numbers.length; j+=(i+1)){
                    numbers[j] = false;
                }
                //print the primes
                System.out.print(i+1+" ");
            }
            
            //new line if multiple of 100
            if((i+1)%100==0){
                System.out.print("\n");
            }
        }
        
    }
    
}
