package Patterns;

public class TestPgm4 {

	public static void main(String[] args) {
		
		int r,c,m=7,k=1;
		
		for(r=1;r<=m;r++)
		{
				for(c=1;c<=r;c++)
				{
					if(k<=9)
					{
						System.out.print(k);
						k++;
					}
					else
					{
						k=1;
						System.out.print(k);
						k++;
					}
						
				}
			
			System.out.println();
		}
	}

}
