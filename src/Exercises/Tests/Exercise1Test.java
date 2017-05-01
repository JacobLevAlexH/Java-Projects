package Exercises.Tests;


import Exercises.Exercise1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by jacobhsu on 2017-04-22.
 */
public class Exercise1Test {
    private Exercise1 testExercise1;

    @Before
    public void runBefore () { testExercise1 = new Exercise1();}


    @Test
    public void sleepIn() throws Exception {

        assertFalse(testExercise1.sleepIn(true,false));

        assertTrue(testExercise1.sleepIn(false,false));
        assertTrue(testExercise1.sleepIn(false,true));

    }

    @Test
    public void diff21() throws Exception {

        assertEquals(2, testExercise1.diff21(19));
        assertEquals(1, testExercise1.diff21(20));
        assertEquals(2, testExercise1.diff21(22));

    }

    @Test
    public void nearHundred() throws Exception {

        assertTrue( testExercise1.nearHundred(93));
        assertTrue( testExercise1.nearHundred(90));
        assertFalse( testExercise1.nearHundred( 83));

    }

    @Test
    public void missingChar() throws Exception {
        assertEquals( "itten", testExercise1.missingChar("kitten",0));
        assertEquals( "ktten", testExercise1.missingChar("kitten",1));
        assertEquals( "kitte", testExercise1.missingChar("kitten",5));

    }

    @Test
    public void startHi() throws Exception {
        assertTrue(testExercise1.startHi("hi there"));

    }

    @Test
    public void backAround() throws Exception {
        assertEquals( "tcatt", testExercise1.backAround("cat"));

    }

    @Test
    public void mixStart() throws Exception {
        assertTrue(testExercise1.mixStart("six"));
        assertFalse(testExercise1.mixStart("nim"));
        assertFalse(testExercise1.mixStart("im"));

    }

    @Test
    public void close10() throws Exception {
        assertEquals(8, testExercise1.close10(8, 23));
        assertEquals( 9, testExercise1.close10(1, 9));
        assertEquals(0, testExercise1.close10(9, 11));

    }

    @Test
    public void stringE() throws Exception {

        assertTrue(testExercise1.stringE("ee"));
        assertTrue(testExercise1.stringE("hello"));
        assertTrue(testExercise1.stringE("heelo"));
        assertFalse(testExercise1.stringE("heelelele"));
        assertFalse(testExercise1.stringE("eeee"));


    }

    @Test
    public void everyNth() throws Exception {

        assertEquals("Mrce",testExercise1.everyNth("Miracle", 2));

    }

    @Test
    public void hasTeen() throws Exception {
        assertTrue( testExercise1.hasTeen(19 , 18,  17));
        assertFalse(testExercise1.hasTeen(1,2,3));
    }

    @Test
    public void monkeyTrouble() throws Exception {
        assertTrue(testExercise1.monkeyTrouble(true, true));
        assertTrue(testExercise1.monkeyTrouble(false, false));
        assertFalse(testExercise1.monkeyTrouble(true, false));

    }

    @Test
    public void parrotTrouble() throws Exception {

        assertTrue(testExercise1.parrotTrouble(true, 6));
        assertFalse(testExercise1.parrotTrouble(true, 7));
        assertFalse(testExercise1.parrotTrouble(false, 6));

    }

    @Test
    public void posNeg() throws Exception {

        assertTrue(testExercise1.posNeg(1, -1, false));
        assertTrue(testExercise1.posNeg(-1, 1, false));
        assertTrue(testExercise1.posNeg(-4, -5, true));
        assertFalse(testExercise1.posNeg(1, -1, true));

    }

    @Test
    public void frontBack() throws Exception {

        assertEquals("eodc",testExercise1.frontBack("code"));
        assertEquals("a", testExercise1.frontBack("a"));
        assertEquals("ba",testExercise1.frontBack("ab"));

    }

    @Test
    public void or35() throws Exception {
        assertTrue(testExercise1.or35(3));
        assertTrue(testExercise1.or35(10));
        assertFalse(testExercise1.or35(8));

    }

    @Test
    public void icyHot() throws Exception {
        assertTrue(testExercise1.icyHot(120, -1));
        assertTrue(testExercise1.icyHot(-1, 120));
        assertFalse(testExercise1.icyHot(2, 120));

    }

    @Test
    public void loneTeen() throws Exception {
        assertTrue(testExercise1.loneTeen(13, 99));
        assertTrue(testExercise1.loneTeen(21, 19));
        assertFalse(testExercise1.loneTeen(13, 13));

    }

    @Test
    public void startOz() throws Exception {
        assertEquals("oz", testExercise1.startOz("ozymandias"));
        assertEquals("z",testExercise1.startOz("bzoo"));
        assertEquals("o",testExercise1.startOz("oxx"));

    }

    @Test
    public void in3050() throws Exception {

        assertTrue( testExercise1.in3050(30, 31));
        assertFalse( testExercise1.in3050(30, 41));
        assertTrue( testExercise1.in3050(40, 50));
    }

    @Test
    public void lastDigit() throws Exception {

        assertTrue( testExercise1.lastDigit(7, 17));
        assertFalse( testExercise1.lastDigit(6, 17));
        assertTrue( testExercise1.lastDigit(3, 113));

    }

    @Test
    public void sumDouble() throws Exception {

        assertEquals( 3, testExercise1.sumDouble(1, 2));
        assertEquals( 5, testExercise1.sumDouble(3, 2));
        assertEquals( 8, testExercise1.sumDouble(2, 2));


    }

    @Test
    public void makes10() throws Exception {
        assertTrue( testExercise1.makes10(9, 10));
        assertFalse( testExercise1.makes10(9, 9));
        assertTrue( testExercise1.makes10(1, 9));

    }

    @Test
    public void notString() throws Exception {

        assertEquals("not candy", testExercise1.notString("candy"));
        assertEquals("not x",testExercise1.notString("x"));
        assertEquals("not bad", testExercise1.notString("not bad"));

    }

    @Test
    public void front3() throws Exception {

        assertEquals("JavJavJav",testExercise1.front3("Java"));
        assertEquals("ChoChoCho", testExercise1.front3("Chocolate"));
        assertEquals("abcabcabc",testExercise1.front3("abc"));

    }

    @Test
    public void front22() throws Exception {
        assertEquals( "kikittenki", testExercise1.front22("kitten"));
        assertEquals( "HaHaHa", testExercise1.front22("Ha"));
        assertEquals( "ababcab",testExercise1.front22("abc"));

    }

    @Test
    public void in1020() throws Exception {

       assertTrue( testExercise1.in1020(12, 99));
       assertTrue( testExercise1.in1020(21, 12));
       assertFalse( testExercise1.in1020(8, 99));
    }

    @Test
    public void intMax() throws Exception {
        assertEquals(3, testExercise1.intMax(1, 2, 3));
        assertEquals(3, testExercise1.intMax(1, 3, 2));
        assertEquals(3, testExercise1.intMax(3, 2, 1));

    }

    @Test
    public void max1020() throws Exception {
        assertEquals(19, testExercise1.max1020(11, 19));
        assertEquals(19, testExercise1.max1020(19, 11));
        assertEquals(11, testExercise1.max1020(11, 9));

    }

    @Test
    public void endUp() throws Exception {

        assertEquals("HeLLO",testExercise1.endUp("Hello"));
        assertEquals("hi thERE",testExercise1.endUp("hi there"));
        assertEquals("HI",testExercise1.endUp("hi"));

    }

}