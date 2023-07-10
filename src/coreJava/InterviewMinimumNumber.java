package coreJava;

public class InterviewMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print smallest number in 3*3 matrix
		//2 4 5
		//3 0 7
		//1 2 9
		
		int abc[][] = {{2, 4, 5}, {3, 0, 7}, {1, 8, 9}};
		int min = abc[0][0];
		int max = abc[0][0];

		int mincolumn = 0;



		
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn = j;
				}
			}
		}
		
		
		//Find biggest number in min column number
		int maxTraverse = abc[0][mincolumn];
		int k = 0;
		
		//Single Column iteration - Hence using While Loop
		while(k<3)
		{
			if(abc[k][mincolumn]>maxTraverse) {
				maxTraverse=abc[k][mincolumn];
			}
			k++;
		}
		
		System.out.println(min);
		System.out.println(maxTraverse);
		
		
		
		//Exercise: Print smallest number in 3*3 matrix

		for(int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		}
		
		System.out.println(max);

		
	}

}
