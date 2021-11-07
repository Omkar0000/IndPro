import java.util.*;
class Ip2 {

	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s=sc.nextLine();
		System.out.println("ENTER ROWS");
		int Rows=sc.nextInt();
		System.out.println(convert(s,Rows));
	}
	
	    static String convert(String s, int Rows) 
	{

        if (Rows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(Rows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) 
		{
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == Rows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}