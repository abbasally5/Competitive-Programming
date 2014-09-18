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


public class euler4
{
    int max = 0;
    public void run() throws Exception
    {
    	loop1: for (int i = 999; i > 0; i--)
    	{
    		for (int j = i; j > 0; j--)
    		{    				
    			int prod =  i * j; 
    			if(prod > max)
    			{
    				StringBuffer product = new StringBuffer(Integer.toString(prod));
    				if (product.toString().equals(product.reverse().toString()))
    				{
    					max = prod;
    					out.println(i + " " + j); 
    				}
    				  
    			}
    			 				
    		}
    	}
    	out.println(max);	
    }


    public static void main(String[] args) throws Exception
    {
        new euler4().run();
    }
}
