import java.sql.Array;
import  java.lang.*;


public class BasicJava {
    // Write a method that prints all the numbers from 1 to 255.
    public void Print1to255() {
        for (int num = 1; num <= 255; num++) {
            System.out.println(num);
        }
    }

    // Print odd numbers between 1-255
    public void PrintOdd1to255() {
        for (int num = 1; num <= 255; num++) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    // Write a method that prints the numbers from 0 to 255, but this time print the
    // sum of the numbers that have been printed so far.

    public void sum0to255() {
        int sum = 0;
        for (int num = 0; num <= 255; num++) {
            sum = sum + num;
            System.out.println("New Number = " + num + "  sum = " + sum);
        }
    }

    // Iterating through an array
    public void Iterating(int[] arr) {
        for (int i = 0; i <= arr.length  ; i++) {
            System.out.print("  "+arr[i]);
        }
    }

    // Find Max

    public int FindMax(int[] arr){
        int max = arr[0]; 
        for (int i = 0; i <= arr.length ; i++) {
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
    // Get Average
    public int FindAvrg(int[] arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length  ; i++) {
            sum = sum + arr[i];
        }
        int avg = sum/arr.length ;
        return avg;
    }

    //Greater Than Y

    public int GreaterThanY(int [] arr , int Y){
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> Y){
                count +=1;
            }
        }
    return count;
    }

    //Square the values
    public int[] Squarethevalues(int [] arr ){
        for (int i = 0 ; i <arr.length ;i++){
            arr[i] = (int) Math.pow(arr[i],2);  
        }
        return arr;
    }

    //Eliminate Negative Numbers
    public void EliminateNegNum(int []arr ){
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]<0){
                arr[i] = 0 ;   
            }
            System.out.print(arr[i]+" ");
        }   
        
    }
    //Max, Min, and Average
    public String MaxMinandAverage(int [] arr){
        int[] result = new int[3] ;
        int max  = 0 ; int min  = 0 ; int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] > max){
                result[0]= arr[i];
            } else if(arr[i]<min){
                result[1] = arr[i];
            }
        } result[2] = sum/arr.length;
        return "The Max Value = "+result[0]+"  The min Value = "+result[1] + " the avrg value =" + result[2];
    }
    //Shifting the Values in the Array

    public void ShiftingValues(int [] arr) {

        for(int i = 0; i< arr.length-1; i++){
            arr[i] = arr[i+1];
           
        }arr[arr.length-1] =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }
    }

}
