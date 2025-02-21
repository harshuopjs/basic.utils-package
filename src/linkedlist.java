package basic.utils;
import java.util.Scanner;

// Singly Linked List Class
class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert into the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Traverse and print the list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Circular Linked List Class
class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node tail;

    // Insert into the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (tail == null) return;

        Node current = tail.next;
        Node prev = tail;

        do {
            if (current.data == data) {
                if (current == tail) {
                    if (tail.next == tail) {
                        tail = null;
                    } else {
                        tail = prev;
                    }
                }
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    // Traverse and print the list
    public void traverse() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to head)");
    }
}

// Doubly Linked List Class
class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Insert into the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
        }
    }

    // Traverse list forward
    public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Traverse list backward
    public void traverseBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

// Main Class - Calls the Linked List Methods
public final class linkedlist {

    public static void linkedlistinput() {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList singlyList = new SinglyLinkedList();
        CircularLinkedList circularList = new CircularLinkedList();
        DoublyLinkedList doublyList = new DoublyLinkedList();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose the Linked List Operation:");
            System.out.println("1. Choose Singly Linked List");
            System.out.println("2. Choose Circular Linked List");
            System.out.println("3. Choose Doubly Linked List");
            System.out.println("4. Exit (Go to caller.java)");
            int listChoice = scanner.nextInt();

            switch (listChoice) {
                case 1:
                    // Singly Linked List Operations Loop
                    boolean singlyExit = false;
                    while (!singlyExit) {
                        System.out.println("\nSingly Linked List Operations:");
                        System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Traverse");
                        System.out.println("4. Back to Main Menu");
                        int operation = scanner.nextInt();

                        switch (operation) {
                            case 1:
                                System.out.print("Enter value to insert: ");
                                singlyList.insert(scanner.nextInt());
                                break;
                            case 2:
                                System.out.print("Enter value to delete: ");
                                singlyList.delete(scanner.nextInt());
                                break;
                            case 3:
                                singlyList.traverse();
                                break;
                            case 4:
                                singlyExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;

                case 2:
                    // Circular Linked List Operations Loop
                    boolean circularExit = false;
                    while (!circularExit) {
                        System.out.println("\nCircular Linked List Operations:");
                        System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Traverse");
                        System.out.println("4. Back to Main Menu");
                        int operation = scanner.nextInt();

                        switch (operation) {
                            case 1:
                                System.out.print("Enter value to insert: ");
                                circularList.insert(scanner.nextInt());
                                break;
                            case 2:
                                System.out.print("Enter value to delete: ");
                                circularList.delete(scanner.nextInt());
                                break;
                            case 3:
                                circularList.traverse();
                                break;
                            case 4:
                                circularExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;

                case 3:
                    // Doubly Linked List Operations Loop
                    boolean doublyExit = false;
                    while (!doublyExit) {
                        System.out.println("\nDoubly Linked List Operations:");
                        System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Traverse Forward");
                        System.out.println("4. Traverse Backward");
                        System.out.println("5. Back to Main Menu");
                        int operation = scanner.nextInt();

                        switch (operation) {
                            case 1:
                                System.out.print("Enter value to insert: ");
                                doublyList.insert(scanner.nextInt());
                                break;
                            case 2:
                                System.out.print("Enter value to delete: ");
                                doublyList.delete(scanner.nextInt());
                                break;
                            case 3:
                                doublyList.traverseForward();
                                break;
                            case 4:
                                doublyList.traverseBackward();
                                break;
                            case 5:
                                doublyExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting.......");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Choice! Please select again.");
            }
        }

        scanner.close();
    }
}