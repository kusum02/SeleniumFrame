package Patterns;

public class TestPgm1 {

	public static void main(String[] args) {
		
		int []a={5,10,15,20,25,30};
		
		int i=0,j;
		for(j=0;j<a.length-1;j++)//(j=0,i=a[j];i<a[j+1]||j<a.length;j++)
		{
			for(i=a[j];i<a[j+1];i++)
			{
				if(i==a[j]||i==a[j+1])
					continue;
				else
					System.out.println(i);	
			}
		}
		

	}

}
