package coreJava;

public class NestedLoops {

	public static void main(String[] args) {
		
		//1 2 3 4 
		//5 6 7
		//8 9 
		//10
		
		int k =1;
		int m=3;
		for(int i=0;i<4;i++) //(Outer for loop)
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=4-i;j++) //(Inner for loop)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		k=1;
		//1
		//2 3 
		//4 5 6 
		//7 8 9 10
		for(int i=1;i<5;i++) //(Outer for loop)
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=i;j++) //(Inner for loop)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		//k=1;
		//1
		//1 2 
		//1 2 3
		//1 2 3 4
		for(int i=1;i<5;i++) //(Outer for loop)
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=i;j++) //(Inner for loop)
			{
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}
			System.out.println("");
			//k=1;
		}
		
	
		//3
		//6 9 
		//12 15 18
		for(int i=1;i<4;i++) //(Outer for loop)
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=i;j++) //(Inner for loop)
			{
				System.out.print(m);
				System.out.print("\t");
				m+=3;
				
			}
			System.out.println("");
			
		}	
		

		
	}

}
