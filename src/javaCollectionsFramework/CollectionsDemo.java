package javaCollectionsFramework;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};
		
		//4 - 3 times, 5 - 3, 6 - 2, 9 - 1
		
		//ALGORYRTHM
		//Empty ArrayList
		//Print unique number from the list - Amazon Interview
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<a.length; i++)
		{
			int k =0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j = i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i] + " - " + k + " Times");
				
				if(k==1)
				{
					System.out.println(a[i] + " Is unique number");
				}
			}
			
		}
		


	}

}
