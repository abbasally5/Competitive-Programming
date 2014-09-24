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


public class euler013
{
    public void run() throws Exception
    {
    	Scanner sc= new Scanner(new File("euler013.dat"));
    	BigInteger sum = new BigInteger("0");
    	while (sc.hasNextLine())
    	{
    		BigInteger num = new BigInteger(sc.nextLine());
    		//out.println(num);
    		sum = sum.add(num);
    	}
    	out.println(sum.toString().substring(0,10));
    }


    public static void main(String[] args) throws Exception
    {
        new euler013().run();
    }
}
