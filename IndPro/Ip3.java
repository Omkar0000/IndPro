import java.util.*;
public class Ip3
{

	static int stLength(String st) 
	{
		if(st.length() == 0)
			return 0;
		char[] ch = st.toCharArray();
		int counter = 0;
		
		for(int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ') {
				counter = 0;
				continue;
			}
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=input.nextLine();
		System.out.println(stLength(st));
	}
}