import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
import static java.util.regex.Pattern.*;
import static java.util.regex.Matcher.*;
import static java.math.BigInteger.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collection.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Character.*;


public class euler11
{
    int max;
    int[][] grid;
    public void run() throws Exception
    {
    	Scanner cin = new Scanner(new File("euler11.dat"));
    	grid = new int[20][20];
    	max = Integer.MIN_VALUE;
    	for (int r = 0; r < 20; r ++)
    	{
    		Scanner sc = new Scanner(cin.nextLine());
    		for(int c = 0; c < 20; c++)
    			grid[r][c] = sc.nextInt();	
    	}
    	for (int r = 0; r < grid.length; r++)
    		for (int c = 0; c < grid[0].length; c++)
    			multi(r, c);
    	out.println(max);
    }

	void multi(int r, int c)
	{
		//down
		int mult = 1;
		if(r < grid.length - 4)
		{
			for (int i = 0; i < 4; i++)
			{
				mult *= grid[r+i][c];
			}
			if (mult > max) max = mult;
		}
		//right
		mult = 1;
		if(c < grid[r].length - 4)
		{
			for (int i = 0; i < 4; i++)
			{
				mult *= grid[r][c+i];
			}
			if (mult > max) max = mult;
		}
		//diagonal right
		mult = 1;
		if(r < grid.length - 4 && c < grid[r].length - 4)
		{
			for (int i = 0; i < 4; i++)
			{
				mult *= grid[r+i][c+i];
			}
			if (mult > max) max = mult;
		}
		//diagonal left
		mult = 1;
		if(r > 3 && c < grid[r].length - 4)
		{
			for (int i = 0; i < 4; i++)
			{
				mult *= grid[r-i][c+i];
			}
			if (mult > max) max = mult;
		}
	}

    public static void main(String[] args) throws Exception
    {
        new euler11().run();
    }
}
