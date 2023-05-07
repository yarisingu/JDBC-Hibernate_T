package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			i++;
			while(j<=5)
			{
				System.out.printf("%02d ",(i*j));
				j++;
			}
			System.out.println();
		}

	}

}
