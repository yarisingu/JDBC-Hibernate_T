package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=3)
			{
				System.out.printf("%s ",j+" "+i);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
