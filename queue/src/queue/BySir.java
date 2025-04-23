package queue;

import java.util.Scanner;

class Queue {
    int f = -1, r = -1;
    int n = 10;
    Scanner sc = new Scanner(System.in);
    int q[] = new int[n];

    void enque() //Addition of Elements in QUEUE
    {
        if (r == (n - 1))  //Value of r reached at n-1th index of array which is last element of array
        {
            System.out.println("QUEUE is FULL");
        }
        else
        {
            System.out.println("Enter data:");
            int data = sc.nextInt();
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                q[r] = data;
            }
            else
            {
                r = r + 1;
                q[r] = data;
            }
        }
    }

    void dqueue() //Deletion of Elements from QUEUE
    {
        if (f == -1 && r == -1) 
        {
            System.out.println("QUEUE is EMPTY!!!");
        }
        else
        {
            f = f + 1;
            System.out.println("Item deleted");
        }
    }

    void display() {
        if (f == -1 && r == -1) {
            System.out.println("No Elements in QUEUE");
        }
        else if(f>r) {
            System.out.println("No Elements in QUEUE");
        } 
        else
        {
            System.out.println("f is:"+f);
            System.out.println("r is:"+r);
            System.out.println("Elements in QUEUE are:");
            for (int i = f; i <= r; i++) {
                System.out.println(q[i]);
            }
    }

    }
}

public class BySir {
    public static void main(String[] args) {
        Queue s = new Queue();
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Queue Operations using Array");
        System.out.println("1.Enque\n2.Dqueue\n3.Display\n4.Exit");
        while (true) {
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    s.enque();
                    break;
                }
                case 2: {
                    s.dqueue();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Wrong Choice");
            }
        }

    }
}