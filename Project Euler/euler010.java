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


public class euler010
{
    public void run() throws Exception
    {
    	long num = 1;
    	long sum = 2;
    	while (num < 2000000)
    	{
    		num+=2;
    		if (isPrime(num))
    			sum += num;
	    }
    	out.println(sum);
    }

	//Precondition: long l is odd
	boolean isPrime(long l)
	{
		//if (l % 2 == 0) return false;
		long sqrt = (long)Math.sqrt(l) + 1;
		for (long i = 3;i < sqrt; i+= 2)
		{
			if (l % i == 0) return false;
		}
		return true;
	}
	
    public static void main(String[] args) throws Exception
    {
        new euler010().run();
    }
}
