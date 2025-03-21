package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three();
	
	}
	
	public static void one() {
	//1.outer loop will number of times == number of rows
		
		//2how many columns are there for every row number or types of element in column (* or 1)
		//3.what do you need to print
		
		
		for(int row=1; row <=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			//when one row is printed, we need to add a newline
			System.out.println();
		}

	}
	public static void two() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col +"\t");
			}
			System.out.println();
		}
	}
	public static void three() {
		for(int row=1; row<=10; row++) {
			int rowCon=0;
			if(row>10/2) {
				rowCon=10-row;
			}
			else {
				rowCon=row;
			}
			for(int col=1; col<=rowCon; col++) {
				
					System.out.print("*");
				
			}
			System.out.println();
		}
	}
	static void chr() {
		char c ='A';
		
		for(int row=1; row<=6; row++) {
			for(int col=1; col<=row+1; col++) {
				System.out.print(c);
				c++;
				if(!(row%2==0)|| row ==1) {
					break;
				}
				
				
			}
			System.out.println();
		}
	}
}
