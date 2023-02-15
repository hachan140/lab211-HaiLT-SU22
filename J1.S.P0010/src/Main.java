
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    static int[] random(int n, int min, int max){
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
            
        }
        return arr;
    }
    static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    static void display(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + "]");
        }
    }
    static List<Integer> list = new ArrayList<>();
    static void search(int arr[],int val){
        
        int j = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                list.add(i);
            }
        }
        
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Validation.checkInt("Enter nummber of array: ", 1, Integer.MAX_VALUE);
        int min = Validation.checkInt("Min = ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int max = Validation.checkInt("Max = ", min, Integer.MAX_VALUE);
        int arr[] = random(n, min, max);
        int val = Validation.checkInt("Enter search value: ", min, max);
        
        System.out.print("Sorted array: ");
        sort(arr);
        display(arr);
        System.out.println("");
        search(arr, val);
        if(list.isEmpty())
            System.out.println("Not found!");
        else {
            System.out.print("Found " + val + " at index: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }

    }
}
