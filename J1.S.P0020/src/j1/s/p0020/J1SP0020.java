/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class J1SP0020 {

    /**
     * @param arr
     */
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min == i)
                continue;
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
    public static void display(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else System.out.println(arr[i] + "]");
        }
    }
    static int[] random(int n, int min, int max){
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       
       int min = Validation.checkInt("Min = ", Integer.MIN_VALUE, Integer.MAX_VALUE);
       
       int max = Validation.checkInt("Max = ", min, Integer.MAX_VALUE);
       
       int n = Validation.checkInt("Enter number of array: ", 1, Integer.MAX_VALUE);
       int arr[] = random(n, min, max);
        System.out.print("Unsorted array: ");
        display(arr);
        System.out.print("Sorted array: ");
        sort(arr);
        display(arr);
    }
    
}
