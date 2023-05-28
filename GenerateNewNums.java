/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatenewnums;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bonam
 */
public class GenerateNewNums {

    /**
     * @param args the command line arguments
     */
    public static boolean primenumbers(int number){
        if(number<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number % i==0){
                return false;
            }
        }
        return true;
    }
    public static int generatetheprime(int begin, int end){
        Random random = new Random();
        int number;
        do {
            number = random.nextInt(end - begin + 1) + begin;
        }while(!primenumbers(number));
        return number;
    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
    public static boolean Is_Realtively_Prime(int a, int b){
        return GCD(a, b)==1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Code to generate prime numbers
        Scanner input = new Scanner(System.in);
        int startRange;
        int endRange;
        System.out.println("Enter start range");
        startRange = input.nextInt();
        System.out.println("Enter end range");
        endRange = input.nextInt();
        
        int p = generatetheprime(startRange, endRange);
        int q = generatetheprime(startRange, endRange);
        System.out.println("Random prime number p:"+ p);
        System.out.println("Random prime number q:"+ q);
        System.out.println("The numbers are\n");
        for(int k=1; k<p; k++){
            if(Is_Realtively_Prime(k, p)){
                System.out.println(k+ ",");
            }
        }
      
    }
    
}
