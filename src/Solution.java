
public class Solution {

	public static void main(String[] args) {

		String s="java";
		StringBuffer buffer=new StringBuffer(s);
		
		if(s.equals(buffer.reverse().toString()))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("nos");
		}
	}

}
