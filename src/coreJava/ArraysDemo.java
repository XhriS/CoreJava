package coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array - Container which stores multuple values of the same data type
		//int a = 4;
		 
		int a[]= new int [5]; //Declares an array and allocates memory for the values
		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12; //Initialized values into the array
		
		int b[]= {1,2,3, 4, 5};
		
		
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]); //Retrieve values in array
		}
		
	}

}
