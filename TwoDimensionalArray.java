package Practise;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[5][6];
		int x = 2;
		for(int i=0;i<5;i++)
		{
		
			for(int j=0,k=1;j<6&&k<=6;j++,k++)
			{
					
				
					arr[i][j] = x*k;
					System.out.print(arr[i][j]+" ");
					
				
			}
		
			x=x+1;
			System.out.println();
		}
		
	}

}
