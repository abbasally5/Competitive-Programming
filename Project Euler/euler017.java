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


class euler017
{
    private static String[] tensNames = {
    "",
    "ten",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
  };

  private static final String[] numNames = {
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
  };


    public void run() throws Exception
    {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
        {
            String num2Word = num2Word(i);
            //out.println(num2Word);
            sum += numLetters(num2Word);
        }
        out.println(sum);

    }

    public static String num2Word(int num) {
        if (num < 20) return numNames[num];
        else if (num == 1000) return "one thousand";
        else if (num / 100 == 0)
            return tensNames[num / 10] + " " + num2Word(num % 10);
        else {
            if (num % 100 == 0)
                return numNames[num / 100] + " hundred";
            else
                return numNames[num / 100] + " hundred and " + num2Word(num % 100);
        }
    }

    public static int numLetters(String word) {
        int count = 0;
        for (String s: word.split(" ")) {
            count += s.length();
        }
        return count;
    }


    public static void main(String[] args) throws Exception
    {
        new euler017().run();
    }
}
