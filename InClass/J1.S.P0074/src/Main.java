
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

    static Scanner sc = new Scanner(System.in);

    public static int checkInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new Exception();

                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.println("Invalid Number");
            }
        }
    }

    public static int[][] addition(int[][] matrix1, int[][] matrix2) {
        
        int row = matrix1.length;
        int col = matrix1[0].length;                     
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] substraction(int[][] matrix1, int[][] matrix2) {
        
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] += matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] input(int n) {

        int row = checkInt("Enter row matrix " + n + ":", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int col = checkInt("Enter column matrix " + n + ":", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int matrix[][] = new int[row][col];
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {

                matrix[j][k] = checkInt("Enter matrix " + n + "[" + (j + 1) + "]" + "[" + (k + 1) + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    public static int[][] input2(int row1, int col1) {
        int row, col;
        do {
            row = checkInt("Enter row matrix 2: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            col = checkInt("Enter column matrix 2: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (row != row1 || col != col1) {
                System.out.println("Can't Calculate");
            } else {
                break;
            }
        } while (true);

        int matrix[][] = new int[row][col];
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {

                matrix[j][k] = checkInt("Enter matrix 2" + "[" + (j + 1) + "]" + "[" + (k + 1) + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    public static int[][] input2(int col1) {
        int row, col;
        do {
            row = checkInt("Enter row matrix 2: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (col1 != row) {
                System.out.println("Can't Calculate");
            } else {
                break;
            }
        } while (true);
        col = checkInt("Enter column matrix 2: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int matrix[][] = new int[row][col];
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {

                matrix[j][k] = checkInt("Enter matrix 2" + "[" + (j + 1) + "]" + "[" + (k + 1) + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("-----Result-----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("======Calculation program======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Substraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            choice = checkInt("You choice: ", 1, 4);
            switch (choice) {
                case 1:
                    System.out.println("----Addition Matrix----");
                    int[][] matrix1 = input(1);
                    int[][] matrix2 = input2(matrix1.length, matrix1[0].length);
                    int[][] result1 = addition(matrix1, matrix2);
                    display(result1);
                    break;
                case 2:
                    System.out.println("----Substraction----");
                    int[][] matrix3 = input(1);
                    int[][] matrix4 = input2(matrix3.length, matrix3[0].length);
                    int[][] result2 = substraction(matrix3, matrix4);
                    display(result2);
                    break;
                case 3:
                    System.out.println("----Multiplication----");
                    int[][] matrix5 = input(1);
                    int[][] matrix6 = input2(matrix5[0].length);

                    display(multiplication(matrix5, matrix6));

                    break;
            }
        } while (choice != 4);

    }
}
