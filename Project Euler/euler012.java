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


public class euler012
{
    public void run() throws Exception
    {
    	long num = 1;
    	long count = 2;
    	while (numFactors(num) < 500)
    	{
    		num += count;
    		count++;
    	}
    	out.println(num);
    }
    
    long numFactors(long l)
    {
    	long sqrt = (int)Math.sqrt(l) + 1;
    	long div = 0;
    	for (long it = 1; it <sqrt; it++)
    	{
    		if (l % it == 0) div++;
    	}
    	return div * 2;
    }


    public static void main(String[] args) throws Exception
    {
        new euler012().run();
    }
}
