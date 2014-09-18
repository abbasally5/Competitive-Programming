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


public class euler14
{
    int[] sieve = new int[1000000];
    
    public void run() throws Exception
    {
    	//set up sieve and solve using recur2()
    	sieve[0] = sieve[1] = 1;
		int max = 0;
		int maxInd = 0;
		for (int i = 2; i < 1000000; i++)
		{
			sieve[i] = recur2(i);
			if (sieve[i] > max) 
			{
				max = sieve[i];
				maxInd = i;
			}
			//out.println(i + " " + length);
		}
		out.println(maxInd + " " + max);
		
		/*
		//without sieve using recur()
		int max = 0;
		int maxInd = 0;
		int length = 0;
		for (int i = 2; i < 1000000; i++)
		{
			length = recur(i,1);
			if (length > max) 
			{
				max = length;
				maxInd = i;
			}
			//out.println(i + " " + length);
		}
		out.println(maxInd + " " + max);
		//out.println(recur(837799, 1));	
		*/		
    }    
    
	long recur(long num, int cnt)
	{		
		if (num <= 1){ return cnt;}
		if (num % 2 == 0) return recur(num / 2, ++cnt);
		else return recur(3 * num + 1, ++cnt);
	}
	
	
	int recur2(long num)
	{
		if(num <= 1) return 1;
		else if (num < 1000000 && sieve[(int)num] != 0) return sieve[(int)num];
		else
		{
			int length = 0;
			if (num % 2 == 0) length = 1 + recur2(num/2);
			else length = 1 + recur2(3 * num + 1);
			if (num < 1000000) sieve[(int)num] = length;
			return length;
		}
		
	}

    public static void main(String[] args) throws Exception
    {
        new euler14().run();
    }
}
