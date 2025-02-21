package basic.utils;
import java.util.Scanner;
public final class array {
    static void oned() {
        Scanner s = new Scanner(System.in);
        int n, i;
        System.out.print("Enter no. of elements you want to enter: ");
        n = s.nextInt();
        int arr[] = new int[n];
        for (i = 1; i <= n; i++) {
            System.out.print("Enter element for position: " + i + ": /n");
            arr[i] = s.nextInt();
        }
        System.out.print("{");
        for(i=1;i<=n;i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("}");
    }
    static void multi(){
        Scanner s = new Scanner(System.in);
        int row,col,i,j;
        System.out.print("Enter no. of row you want to enter: ");
        row = s.nextInt();
        System.out.print("Enter no. of colum you want to enter: ");
        col = s.nextInt();
        int arr[][] = new int[row][col];
        for(i=1;i<=row;i++){
            for(j=1;j<=col;j++){
                System.out.print("Enter element for position: " + i + "," + j + ": /n");
                arr[i][j] = s.nextInt();
            }
        }

    }
    static void ooperations() {
        int n, pos, e, op;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. of element: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Your Array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.print("\n What task you want to perform \n Insertion[1] \n Deletion[2] \n");
        op = s.nextInt();
        if (op == 1) {
            int[] b = new int[n + 1];
            System.out.print("\n Enter Position where array is to be added");
            pos = s.nextInt();
            System.out.print("\n Enter Element to be added");
            e = s.nextInt();
            for (int i = 0; i < n + 1; i++) {
                if (i < pos) {
                    b[i] = a[i];
                } else if (i == pos) {
                    b[i] = e;
                } else {
                    b[i] = a[i - 1];
                }
            }
            System.out.print("YOur new array is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]);
                System.out.print(" ");
            }
        }
        if (op == 2) {
            int[] b = new int[n - 1];
            System.out.print("\n Enter Position to be Deleted");
            pos = s.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (i < pos) {
                    b[i] = a[i];
                } else if (i == pos)
                    continue;
                else {
                    b[i - 1] = a[i];
                }
            }
            System.out.print("YOur new array is: ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(b[i]);
                System.out.print(" ");
            }
        }
    }
    static void searching(){
        Scanner s = new Scanner(System.in);
    }
    static void sorting(){
        Scanner s = new Scanner(System.in);
    }
    static void error(){
        System.out.println("Error 404 not found");
    }
    public static void arrayuse() {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What  do you want to do? " + " 1. Create a 1-D array " + " 2. Create a Multi-Dimensional array " + " 3. searching " + " 4. sorting " + " 5. Traverse Array "+" 6. opertions "+ " 7. Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    oned();
                case 2:
                    multi();
                case 3:
                    searching();
                case 4:
                    sorting();
                case 5:
                    error();
                case 6:
                    ooperations();
                case 7:
                    break;
            }
        }while (choice != 7);
    }
}