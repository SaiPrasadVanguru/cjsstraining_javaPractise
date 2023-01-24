package Practise;

import java.util.Arrays;

public class MatrixProgram1 {
	public static void main(String[] args) {
		char[][] a = {{'a','b','c','d','e','f'},{'3','t','1','k','r','s'},{'a','d','i','l','q','t'},{'b','e','h','m','p','a'},{'c','f','g','n','r','b'}};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
			
			if(a[i][j]=='1')
			{
				for(int k=i,l=0;l<=5;l++)
				{
					if(l!=2)
					{
					a[k][l]='0';
					}
				}

				for(int m=0,n=j;m<=4;m++)
				{
					if(m!=1)
					{
					a[m][n]='0';
					}
				}
						
            }
			}
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
