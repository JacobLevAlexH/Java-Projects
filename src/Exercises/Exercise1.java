package Exercises; /**
 * Created by jacobhsu on 2017-04-21.
 */

/**
 * Exercises from  Coding Bat Java via http://codingbat.com/
 */
public class Exercise1 {


    /**
     * Statement:
     * <p>
     * EFFECT:The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in. via http://codingbat.com/prob/p187868
     *
     *
     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sleepIn(false, true) → true
     * @param weekday
     * @param vacation
     * @return
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    /**
     * Statement:
     * <p>
     * EFFECT: Given an int n, return the absolute difference
     * between n and 21, except return double the absolute difference
     * if n is over 21. via http://codingbat.com/prob/p116624
     *
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     * @param n
     * @return
     *

     */

    public int diff21(int n) {

        if ( n <= 21) {
            return 21 - n ;
        }
        else {
            return (n - 21) * 2;
        }

    }

    /**
     * Statement:
     * EFFECT: Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * http://codingbat.com/prob/p184004
     *
     *
     nearHundred(93) → true
     nearHundred(90) → true
     nearHundred(89) → false
     *
     *
     * @param n
     */

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    /**
     * Statement:
     * EFFECT: Given a non-empty string and an int n, return a new string where
     * the char at index n has been removed. The value of n will be a valid index
     * of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
     * http://codingbat.com/prob/p190570
     *
     missingChar("kitten", 1) → "ktten"
     missingChar("kitten", 0) → "itten"
     missingChar("kitten", 4) → "kittn"
     *
     * @param str
     * @param n
     */

    public String missingChar(String str, int n) {

        String front = str.substring(0,n) ;

        String back = str.substring(n+1, str.length());

        return front + back;

    }


    /**
     * Statement:
     * EFFECT: Given a string, return true if the string starts with "hi" and false otherwise.
     * via http://codingbat.com/prob/p191022
     *
     * startHi("hi there") → true
     * startHi("hi") → true
     * startHi("hello hi") → false
     *
     * @param str
     */

    public boolean startHi(String str) {

        String firstTwo = str.substring(0,2);

        if (str.length() < 2) return false;

        if ( firstTwo.equals( "hi" ) ) {
            return true ;
        }

        return false;
    }


    /**
     * Statement:
     * EFFECT: Given a string, take the last char and return a new string with the last char
     * added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
     * via http://codingbat.com/prob/p161642
     *
     * backAround("cat") → "tcatt"
     backAround("Hello") → "oHelloo"
     backAround("a") → "aaa
     *
     * @param str
     */

    public String backAround(String str) {

        String last = str.substring(str.length() - 1);

        return last + str + last;

    }


    /**
     * Statement:
     * EFFECT: Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix"
     * .. all count.
     *
     * @param str mixStart("mix snacks") → true
     *            mixStart("pix snacks") → true
     *            mixStart("piz snacks") → false
     *            via http://codingbat.com/prob/p151713
     */

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String ix = str.substring( 1, 3);

        if ( ix.equals("ix")) {
            return true;
        }

        return false;
    }

    /**
     * Statement:
     * EFFECT: Given 2 int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
     * close10(8, 13) → 8
     * close10(13, 8) → 8
     * close10(13, 7) → 0
     *
     * @param a
     * @param b
     */

    public int close10(int a, int b) {
        int one = Math.abs( a - 10);
        int two = Math.abs( b - 10);

        if (one < two) {
            return a;
        }
        if (two < one) {
            return b;
        }
        return 0;

    }

    /**
     * Statement:
     * EFFECT: Return true if the given string contains between 1 and 3 'e' chars.
     * <p>
     * stringE("Hello") → true
     * stringE("Heelle") → true
     * stringE("Heelele") → false
     * via http://codingbat.com/prob/p173784
     *
     * @param str
     */

    public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }


    /***We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     *  Given 3 int values, return true if 1 or more of them are teen.

     hasTeen(13, 20, 10) → true
     hasTeen(20, 19, 10) → true
     hasTeen(20, 10, 13) → true
     */
    public boolean hasTeen(int a, int b, int c) {

        if ( a>= 13 && a <= 19 || b >= 13 && b <= 19 || c>= 13 && c <= 19 ) {
            return true;
        }

        return false;
    }


    /**
     * Statement:
     * EFFECT: Given a non-empty string and an int N, return the string made
     * starting with char 0, and then every Nth char of the string.
     * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     * everyNth("Miracle", 2) → "Mrce"
     * everyNth("abcdefg", 2) → "aceg"
     * everyNth("abcdefg", 3) → "adg"
     * http://codingbat.com/prob/p196441
     *
     * @param str
     * @param n
     */

    public String everyNth(String str, int n) {
        String endString = "";

        for (int i=0 ; i<str.length(); i = i+ n ) {
            endString = endString + str.charAt(i);
        }
        return endString;

    }

    /**
     * Statement:
     * EFFECT: We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble if they are both smiling or
     * if neither of them is smiling. Return true if we are in trouble.
     * http://codingbat.com/prob/p181646
     * <p>
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     *
     * @param aSmile
     * @param bSmile
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return ( aSmile == bSmile) ;

    }

    /**
     * Statement:
     * EFFECT: We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and the hour
     * is before 7 or after 20. Return true if we are in trouble.
     * <p>
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     *
     * @param talking
     * @param hour
     */

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));

    }

    /**
     * Statement:
     * EFFECT: Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     * <p>
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     *
     * @param a
     * @param b
     * @param negative
     */

    public boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a<0 && b<0 && negative);
        }

        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    /**
     * Statement:
     * EFFECT: Given a string, return a new string where the first and last chars have been exchanged.
     * <p>
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     *
     * @param str
     */

    public String frontBack(String str) {

        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }

    /**
     * Statement:
     * EFFECT: Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
     * Use the % "mod" operator
     * via http://codingbat.com/prob/p112564

     or35(3) → true
     or35(10) → true
     or35(8) → false

     *@param n

     */

    public boolean or35(int n) {
        return (n % 3 == 0 )|| (n % 5 == 0);
    }

    /**
     * Statement:
     * EFFECT: Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * via http://codingbat.com/prob/p192082
     icyHot(120, -1) → true
     icyHot(-1, 120) → true
     icyHot(2, 120) → false

     @param temp1
     @param temp2
     */

    public boolean icyHot(int temp1, int temp2) {

        return ((temp1 < 0 && temp2 >100)) || ((temp2 < 0 && temp1 > 100));
    }

    /**
     * Statement:
     * EFFECT: We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
     * return true if one or the other is teen, but not both.
     * http://codingbat.com/prob/p165701

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
     *@param a
     *@param b
     */

    public boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

    /**
     * Statement:
     * EFFECT: Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".

     startOz("ozymandias") → "oz"
     startOz("bzoo") → "z"
     startOz("oxx") → "o"
     *@param str
     */

    public String startOz(String str) {

        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    /**
     * Statement:
     * EFFECT: Given 2 int values, return true if they are both in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive.

     in3050(30, 31) → true
     in3050(30, 41) → false
     in3050(40, 50) → true
     *@param a
     *@param b
     */

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }


    /**
     * Statement:
     * EFFECT: Given two non-negative int values, return true if they have the same last digit,
     * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true

     *@param a
     *@param b
     */

    public boolean lastDigit(int a, int b) {

        return(a % 10 == b % 10);

    }

    /**
     * * Statement:
     * EFFECT: Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.

     sumDouble(1, 2) → 3
     sumDouble(3, 2) → 5
     sumDouble(2, 2) → 8


     *@param a
     *@param b
     */

    public int sumDouble(int a, int b) {

        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    /**
     * * Statement:
     * EFFECT: Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

     makes10(9, 10) → true
     makes10(9, 9) → false
     makes10(1, 9) → true


     *@param a
     *@param b
     */

    public boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || a+b == 10) ;
    }

    /**
     * * Statement:
     * EFFECT: Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.

     notString("candy") → "not candy"
     notString("x") → "not x"
     notString("not bad") → "not bad"


     *@param str
     */

    public String notString(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

    /**
     * * Statement:
     * EFFECT: Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.

     front3("Java") → "JavJavJav"
     front3("Chocolate") → "ChoChoCho"
     front3("abc") → "abcabcabc"

     *@param str
     */

    public String front3(String str) {

        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;

    }


    /**
     * Statement:
     * EFFECT: Given a string, take the first 2 chars and return the string with the 2 chars added at
     * both the front and back,so "kitten" yields"kikittenki". If the string length is less than 2,
     * use whatever chars are there.

     front22("kitten") → "kikittenki"
     front22("Ha") → "HaHaHa"
     front22("abc") → "ababcab"

     *@param str
     */

    public String front22(String str) {
        int first2 = 2;
        if (first2 > str.length()) {
            first2 = str.length();
        }

        String front = str.substring(0, first2);
        return front + str + front;
    }

    /**
     * Statement:
     * EFFECT: Given 2 int values, return true if either of them is in the range 10..20 inclusive.

     in1020(12, 99) → true
     in1020(21, 12) → true
     in1020(8, 99) → false

     *@param a
     *@param b
     */

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    /**
     * Statement:
     * EFFECT: Given three int values, a b c, return the largest.

     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3

     *@param a
     *@param b
     *@param c
     */

    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    /**
     * Statement:
     * EFFECT: Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.

     max1020(11, 19) → 19
     max1020(19, 11) → 19
     max1020(11, 9) → 11

     *@param a
     *@param b
     */

    public int max1020(int a, int b) {
        if (b > a) {
            int das = a;
            a = b;
            b = das;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    /**
     * Statement:
     * EFFECT: Given a string, return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
     * returns the uppercase version of a string.

     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"

     *@param str
     */

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int insert = str.length() - 3;
        String front = str.substring(0, insert);
        String back  = str.substring(insert);  // this takes from cut to the end

        return front + back.toUpperCase();
    }



}
