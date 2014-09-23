import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import static java.lang.System.*;
import java.math.BigInteger.*;

class euler015
{
	void run()
	{
		out.println(calcSum(15));
		out.println(calcSum(1000));
	}

	//trivial standard way to solve problem
	BigInteger calcSum(int pow)
	{
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(pow);
		BigInteger sum = BigInteger.valueOf(0);
		while (n.compareTo(BigInteger.valueOf(0)) > 0)
		{
			sum = sum.add(n.mod(BigInteger.valueOf(10)));
			n = n.divide(BigInteger.valueOf(10));
		}
		return sum;
	}

	public static void main(String ... args)
	{
		new euler015().run();
	}
}