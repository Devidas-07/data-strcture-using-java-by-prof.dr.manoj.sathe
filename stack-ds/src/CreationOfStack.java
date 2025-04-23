import java.util.Scanner;

public class CreationOfStack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StackDs ds = new StackDs();
		int choice=0;
		do {
			System.out.println("1 for push\t 2 for pop\t 3 for display\t 0 for exit		");
			System.out.println("enter your choice");
			choice=scan.nextInt();
			switch (choice) {
			case 1: 
				ds.push();
				break;
			case 2:
				ds.pop();
				break;
			case 3:
				ds.display();
				break;
			default:
				System.exit(0);
			}
			
			
		}
		while(choice!=0);

	}

}
class StackDs{
	Scanner scan = new Scanner(System.in);
	int [] stack= new int[10];
	
	int top=-1;
	
	public void push() {
		System.out.println("enter element to push");
		int data = scan.nextInt();
		if(top==stack.length-1) {
			System.out.println("stack is full");
			return;
			
		}
		else {
			top = top+1;
			stack[top]=data;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
		}
		else {
			top = top-1;
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		else {
			for(int i=top; i>=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	
	
	
	
	
}