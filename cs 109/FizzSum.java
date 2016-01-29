import static java.lang.System.*;
import java.util.*;
import java.io.*;

class FizzSum 
{

	void run() throws IOException
	{
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			int min = 0;
			int max = 0;
			if (a < b)
			{
				min = a;
				max = b;
			}
			else
			{
				min = b;
				max = a;
			}

			long sum = 0;
			for (int x = min; x <= max; x++)
			{
				if (x % 3 == 0 && x % 5 == 0)
					sum += (long) Math.pow(x, 2);
				else if (x % 3 == 0)
					sum += x + 3;
				else if (x % 5 == 0)
					sum += x + 5;
			}

			out.println(sum);
		}
	}

	public static void main(String ... args) throws IOException
	{
		new FizzSum().run();
	}
}