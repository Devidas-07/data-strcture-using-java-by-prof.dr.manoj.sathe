package queue;

import java.util.Scanner;

public class CircularQueue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyQueue1 qds = new MyQueue1();

        int choice;

        do {
            System.out.println("Enter your choice: 1. Insert  2. View  3. Delete  4. Stop");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    qds.enqueue(scan);
                    break;
                case 2:
                    qds.printQueue();
                    break;
                case 3:
                    qds.dequeue();
                    break;
                case 4:
                    System.out.println("ok");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scan.close();
    }

}

class MyQueue1 {
    int[] queArr = new int[5];
    int front = -1;
    int rear = -1;
    int size = 0;

    public void enqueue(Scanner s) {
        if (size == queArr.length) {
            System.out.println("Queue is full");
            return;
        }

        System.out.println("Enter item for queue:");
        int item = s.nextInt();

        if (front == -1) {
            front = 0;
        }
        
        rear = (rear + 1) % queArr.length;
        queArr[rear] = item;
        size++;
    }

    public void printQueue() {
        if (size == 0) {
            System.out.println("No elements in queue");
            return;
        }

//        System.out.println("Front index: " + front);
//        System.out.println("Rear index: " + rear);
        System.out.print("Elements in queue: ");

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queArr[i] + " ");
            i = (i + 1) % queArr.length;
        }
        System.out.println();
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front item deleted: " + queArr[front]);
        front = (front + 1) % queArr.length;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }
    }
}
