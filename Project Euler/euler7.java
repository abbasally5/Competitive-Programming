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


public class euler7
{
    public void run() throws Exception
    {
    	int i = 3;
    	int count = 2;
    	while (count < 10001)
    	{
    		i += 2;
    		if (isPrime(i)) count++;    		
    	}
    	out.println(i);
    }
    
    boolean isPrime(int num)
    {
    	if (num % 2 == 0) return false;
    	for(int i = 3; i < (int)Math.sqrt(num)+1; i += 2)
    	{
    		if (num % i == 0) return false;
    	}
    	return true;
    }

    public static void main(String[] args) throws Exception
    {
        new euler7().run();
    }
}
