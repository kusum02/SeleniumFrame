package Patterns;

public class TestPgm10 {

	public static void main(String[] args) {
		
		String s="E5";
		String digits = "0123456789ABCDEF";
		int val = 0;
		
		for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
		System.out.println(val);
				
	}
		

}
