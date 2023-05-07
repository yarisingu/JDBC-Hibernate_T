package patterns;

public class Pattern8 {

	public static void main(String[] args) {
		int x;
		int y;
		for(int i=1; i<=5;i++)
		{
			x=i;
			y=5-i+1;
			for(int j=1;j<=5;j++)
			{
				if(j%2==0)
				{
					System.out.printf("%2d ",x);
				}
				else
				{
					System.out.printf("%2d ", y);
				}
				x=x+5;
				y=y+5; 
			}
			System.out.println();
		}
	}

}
