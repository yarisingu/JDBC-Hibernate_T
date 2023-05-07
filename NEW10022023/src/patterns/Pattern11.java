package patterns;

public class Pattern11 {

	public static void main(String[] args) {
		
		for(int i=0; i<7;i++)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
				
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<7;i++)
		{
			for( int j=7;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			int k=1;
			for(int j=i-k;j>i+k;j=k-1)
			{
				System.out.print("* ");
				k--;
			}
			k++;
		}
	}

}
