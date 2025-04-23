package queue;  

import java.util.Scanner;  

public class CircularQueue {  

    public static void main(String[] args) { 
    	
        Scanner scan = new Scanner(System.in);  
        MyQueue1 qds = new MyQueue1();

        int choice; 

        do { 
            System.out.println("enter your choice\t 1. insertion \t 2.view \t 3.delete \t 4.stop");  
            choice = scan.nextInt();   

            switch (choice) {  
                case 1:  
                    qds.enqueue();  
                    break;  
                case 2:  
                    qds.printQueue();  
                    break;  
                case 3:  
                    qds.dequeue();  
                    break;  
                case 4:  
                    return;  
                       
                default:  
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");  
            }  
        } while (choice != 4);   

        scan.close();   
    }  
   
}  
class MyQueue1{
	int [] queArr= new int[5];
	int front = -1;
	int rear = -1;
	
	public String enqueue() { 
		Scanner s = new Scanner(System.in);
		System.out.println("enter item for queue\t");
		int item = s.nextInt();
		if(rear==queArr.length-1) {
			return "queue is full";
		}
		else if(front==-1 && rear==-1){
			front =0;
			rear=0;
			
			queArr[front]=item;
			
			return "element added";
		}
		else {
			rear=rear+1;
			queArr[rear]=item;
			return "element added apart from first index";
		}
	}
	public void printQueue() {
		 if (front == -1 && rear == -1) {
	            System.out.println("No Elements in QUEUE");
	        }
	        else if(front>rear) {
	            System.out.println("No Elements in QUEUE");
	        } 
	        else
	        {
	            System.out.println("f is:"+front);
	            System.out.println("r is:"+rear);
	            System.out.println("Elements in QUEUE are:");
	            for (int i = front; i <= rear; i++) {
	                System.out.println(queArr[i]);
	            }
	    }

	}
	public void dequeue() {
		
		front=front+1;
		printQueue();
	}
}