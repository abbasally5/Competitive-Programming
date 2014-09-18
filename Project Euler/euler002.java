import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.*;

class euler2
{
	public void run()
	{
//		int last = 0;
//		int curr = 1;
//		int sum = 0;
		int sum, last, curr = 1 + (sum = last = 0);
		while(curr < 4000000)
		{
			//curr += last;
			//last = curr - last;
			curr += last = curr - last;
			if (curr % 2 == 0) sum += curr;	
		}
		out.println(sum);		
	}
	
	public static void main(String... args)
	{
		new euler2().run();
	}
}