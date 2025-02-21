import basic.utils.array;
import basic.utils.linkedlist;
import java.util.Scanner;
class caller {
    public static void main(String[] args) {
        array arr = new array();
        linkedlist ll = new linkedlist();
        System.out.println("Welcome to JavLab");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1. Array \n 2. Linked List \n 3. exit");
        int choice = s.nextInt();

        switch (choice){
            case 1:
                arr.arrayuse();
                case 2:
                ll.linkedlistinput();
        }
        s.close();
    }
}