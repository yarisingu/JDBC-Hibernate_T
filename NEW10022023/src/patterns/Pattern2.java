package patterns;

public class Pattern2 {

	public static void main(String[] args) {
	
		int i=0;
		while(i<5)
		{
			i++;
			int j=0;
			while(j<5)
			{
				System.out.printf("%d ",j);
				j++;
			}
			System.out.println();
		}
	}
}

/*i11 i12 i13 i14 i15

  i21 i22 i23 i24 i25

  i31 i32 i33 i34 i35

  i41 i42 i43 i44 i45

  i51 i52 i53 i54 i55 */