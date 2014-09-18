import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.*;

class euler1
{
	public void run()
	{
		TreeSet<Integer> sieve = new TreeSet<Integer>();
		for (int i = 3; i < 1000; i+=3)
			sieve.add(i);
		for (int i = 5; i < 1000; i+= 5)
			sieve.add(i);
		long sum = 0;
		for (int i: sieve)
			sum += i;
		out.println(sum);
	}
	
	public static void main(String... args)
	{
		new euler1().run();
	}
}