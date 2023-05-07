package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int x;
		int y;
		
		for(int i=1;i<=5;i++)
		{
			x=i;
			y=5-i+1;
			for(int j=1;j<=5;j++)
			{
				if(j%2==1)
				{
					System.out.printf("%02d ",x);
				}
				else
				{
					System.out.printf("%02d ",y);
				}
				x+=5;
				y+=5;
			}
			System.out.println();
		}
	}

}
