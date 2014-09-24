import static java.lang.System.*;

class euler015
{
	void run()
	{
		out.println(recur(40,20,1,1));
	}
	
	long recur(long n, long c, int cnt, long num)
	{
		if (c <= 0) return num;
		return recur(n - 1, c - 1, cnt + 1, num * n/cnt);
	}
	
	public static void main(String... args)
	{
			new euler015().run();
	}
}