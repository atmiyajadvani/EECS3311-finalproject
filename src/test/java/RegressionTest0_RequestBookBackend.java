package test.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_RequestBookBackend {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        java.lang.Class<?> wildcardClass1 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        java.lang.Class<?> wildcardClass5 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        java.lang.Class<?> wildcardClass5 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", 100);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "", 0);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", 100);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 0);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 10);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) (short) -1);
        boolean boolean20 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("", "", 0);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "", 0);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", (int) (byte) 100);
        boolean boolean24 = requestBookBackend0.requestBook("hi!", "hi!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", 0);
        boolean boolean12 = requestBookBackend0.requestBook("", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", 0);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 0);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "hi!", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "", 0);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 10);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", (int) '4');
        java.lang.Class<?> wildcardClass21 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (byte) 0);
        boolean boolean12 = requestBookBackend0.requestBook("", "", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) 10);
        boolean boolean20 = requestBookBackend0.requestBook("", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "hi!", (int) (short) 100);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        java.lang.Class<?> wildcardClass21 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("", "hi!", 1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "", 10);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 10);
        boolean boolean20 = requestBookBackend0.requestBook("", "hi!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "hi!", (int) (byte) 1);
        boolean boolean20 = requestBookBackend0.requestBook("", "hi!", 0);
        boolean boolean24 = requestBookBackend0.requestBook("", "hi!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 10);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", (int) '4');
        boolean boolean24 = requestBookBackend0.requestBook("", "hi!", (int) (short) 10);
        boolean boolean28 = requestBookBackend0.requestBook("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) (short) 100);
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", 10);
        boolean boolean24 = requestBookBackend0.requestBook("", "", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) -1);
        boolean boolean16 = requestBookBackend0.requestBook("hi!", "", 0);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", (int) (short) -1);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", 0);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (-1));
        java.lang.Class<?> wildcardClass13 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean8 = requestBookBackend0.requestBook("", "hi!", 0);
        java.lang.Class<?> wildcardClass9 = requestBookBackend0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "", (int) (short) 100);
        boolean boolean16 = requestBookBackend0.requestBook("", "hi!", (int) (short) 100);
        boolean boolean20 = requestBookBackend0.requestBook("", "", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("hi!", "", 100);
        boolean boolean12 = requestBookBackend0.requestBook("hi!", "hi!", (int) (short) 1);
        boolean boolean16 = requestBookBackend0.requestBook("", "", (int) ' ');
        boolean boolean20 = requestBookBackend0.requestBook("hi!", "", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Backend.RequestBookBackend requestBookBackend0 = new Backend.RequestBookBackend();
        boolean boolean4 = requestBookBackend0.requestBook("hi!", "", (int) 'a');
        boolean boolean8 = requestBookBackend0.requestBook("", "", (-1));
        boolean boolean12 = requestBookBackend0.requestBook("", "hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

