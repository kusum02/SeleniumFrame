package Patterns;

public class TestPgm7 {

	public static void main(String[] args) {
		
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==3||j==1||i==1||j==5&&i!=4&&i!=5)
			{
				System.out.print("*");
			}
									
							else if(j>=3 && i!=6)
							{
									if((i+j)==7||(i+j)==9||(i+j)==11)
							     {
								System.out.print("*");
							     }
								else
								{
									System.out.print(" ");
								}
							}
							else
		
							
								
							{
								System.out.print(" ");
							}
					}
		
		System.out.println();
	}
	}
	


}
