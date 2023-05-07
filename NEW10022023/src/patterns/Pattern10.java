package patterns;

public class Pattern10 {

	public static void main(String[] args)
	{
		int k,h,u;
	for(int i=1;i<=5;i++)
	{ 	k=1;
		h=5;
		u=2;
		for(int j=1;j<=5;j++)
		{
			if(i==k)
					System.out.print("** ");
			
			if(i==u) {
				if( (i+j)==h)
				System.out.print("**");
			else
				System.out.print("   ");
			}
			h++;
		}
		u++;
		System.out.println();
	}
	}

}

//A11 A12 A13 A14 A15
//
//A21 A22 A23 A24 A25
//
//A31 A32 A33 A34 A35
//
//A41 A42 A43 A44 A45

//if(i==3) {
//	if( (i+j)==6)
//	System.out.print("**");
//else
//	System.out.print("   ");
//}
//if(i==4) {
//	if( (i+j)==7)
//	System.out.print("**");
//else
//	System.out.print("   ");
//}
//if(i==5) {
//	if( (i+j)==8)
//	System.out.print("**");
//else
//	System.out.print("   ");
//}
