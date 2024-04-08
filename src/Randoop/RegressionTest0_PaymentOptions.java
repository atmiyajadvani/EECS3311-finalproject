package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_PaymentOptions {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        java.lang.Class<?> wildcardClass1 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        java.lang.Class<?> wildcardClass5 = itemList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.PaymentOptions paymentOptions5 = new Backend.PaymentOptions();
        Backend.Item[] itemArray6 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList7 = new java.util.ArrayList<Backend.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList7, itemArray6);
        double double9 = paymentOptions5.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double10 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        java.lang.Class<?> wildcardClass11 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass11 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        java.lang.Class<?> wildcardClass26 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (short) 100, "");
        double double16 = paymentOptions0.applyPromo((double) 1.0f, "hi!");
        java.lang.Class<?> wildcardClass17 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        java.lang.Class<?> wildcardClass4 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) 'a', "hi!");
        java.lang.Class<?> wildcardClass7 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        java.lang.Class<?> wildcardClass49 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        java.lang.Class<?> wildcardClass9 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) ' ', "");
        double double9 = paymentOptions0.applyPromo(1.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.PaymentOptions paymentOptions5 = new Backend.PaymentOptions();
        Backend.Item[] itemArray6 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList7 = new java.util.ArrayList<Backend.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList7, itemArray6);
        double double9 = paymentOptions5.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double10 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double13 = paymentOptions0.applyPromo((double) 0, "");
        double double16 = paymentOptions0.applyPromo(97.0d, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.PaymentOptions paymentOptions5 = new Backend.PaymentOptions();
        Backend.Item[] itemArray6 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList7 = new java.util.ArrayList<Backend.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList7, itemArray6);
        double double9 = paymentOptions5.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double10 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        java.lang.Class<?> wildcardClass11 = itemList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        java.lang.Class<?> wildcardClass49 = itemList43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) (-1), "");
        java.lang.Class<?> wildcardClass8 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 1L, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        java.lang.Class<?> wildcardClass5 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.PaymentOptions paymentOptions9 = new Backend.PaymentOptions();
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double19 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double20 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double23 = paymentOptions0.applyPromo((double) (short) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions4 = new Backend.PaymentOptions();
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double9 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        double double17 = paymentOptions14.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        double double22 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        double double23 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        Backend.Item[] itemArray24 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList25 = new java.util.ArrayList<Backend.Item>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList25, itemArray24);
        double double27 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList25);
        double double28 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList25);
        java.lang.Class<?> wildcardClass29 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (short) 100, "");
        double double16 = paymentOptions0.applyPromo((double) 1.0f, "hi!");
        double double19 = paymentOptions0.applyPromo((double) 100L, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        double double16 = paymentOptions0.applyPromo((double) 10.0f, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double11 = paymentOptions0.applyPromo((double) '4', "");
        double double14 = paymentOptions0.applyPromo((double) (short) 0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double28 = paymentOptions0.applyPromo((double) (byte) 0, "hi!");
        double double31 = paymentOptions0.applyPromo((double) 100L, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.PaymentOptions paymentOptions9 = new Backend.PaymentOptions();
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double19 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double20 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions21 = new Backend.PaymentOptions();
        double double24 = paymentOptions21.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        double double30 = paymentOptions21.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions21.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions35 = new Backend.PaymentOptions();
        double double38 = paymentOptions35.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions39 = new Backend.PaymentOptions();
        Backend.Item[] itemArray40 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList41 = new java.util.ArrayList<Backend.Item>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList41, itemArray40);
        double double43 = paymentOptions39.calculateTotalPrice((java.util.List<Backend.Item>) itemList41);
        double double44 = paymentOptions35.calculateTotalPrice((java.util.List<Backend.Item>) itemList41);
        Backend.Item[] itemArray45 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList46 = new java.util.ArrayList<Backend.Item>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList46, itemArray45);
        double double48 = paymentOptions35.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        double double49 = paymentOptions21.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        double double50 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        java.util.List<Backend.Item> itemList49 = null;
        double double50 = paymentOptions0.calculateTotalPrice(itemList49);
        double double53 = paymentOptions0.applyPromo((double) 100.0f, "hi!");
        double double56 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double28 = paymentOptions0.applyPromo((double) (byte) 0, "hi!");
        double double31 = paymentOptions0.applyPromo((double) 'a', "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        java.util.List<Backend.Item> itemList49 = null;
        double double50 = paymentOptions0.calculateTotalPrice(itemList49);
        double double53 = paymentOptions0.applyPromo((double) 100.0f, "hi!");
        double double56 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double28 = paymentOptions0.applyPromo((double) (-1L), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) 'a', "hi!");
        Backend.PaymentOptions paymentOptions7 = new Backend.PaymentOptions();
        Backend.Item[] itemArray8 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList9 = new java.util.ArrayList<Backend.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList9, itemArray8);
        double double11 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList9);
        double double14 = paymentOptions7.applyPromo((double) '4', "hi!");
        double double17 = paymentOptions7.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        double double21 = paymentOptions18.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions22 = new Backend.PaymentOptions();
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        double double26 = paymentOptions22.calculateTotalPrice((java.util.List<Backend.Item>) itemList24);
        double double27 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList24);
        Backend.Item[] itemArray28 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList29 = new java.util.ArrayList<Backend.Item>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList29, itemArray28);
        double double31 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        double double32 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        double double33 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double51 = paymentOptions0.applyPromo((double) (-1), "hi!");
        double double54 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass11 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        java.util.List<Backend.Item> itemList49 = null;
        double double50 = paymentOptions0.calculateTotalPrice(itemList49);
        double double53 = paymentOptions0.applyPromo((double) 100.0f, "hi!");
        double double56 = paymentOptions0.applyPromo((double) 'a', "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.PaymentOptions paymentOptions5 = new Backend.PaymentOptions();
        Backend.Item[] itemArray6 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList7 = new java.util.ArrayList<Backend.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList7, itemArray6);
        double double9 = paymentOptions5.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double10 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList7);
        double double13 = paymentOptions0.applyPromo((double) 0, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        double double17 = paymentOptions14.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        double double22 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        double double23 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        Backend.Item[] itemArray24 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList25 = new java.util.ArrayList<Backend.Item>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList25, itemArray24);
        double double27 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList25);
        Backend.PaymentOptions paymentOptions28 = new Backend.PaymentOptions();
        double double31 = paymentOptions28.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions32 = new Backend.PaymentOptions();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        double double36 = paymentOptions32.calculateTotalPrice((java.util.List<Backend.Item>) itemList34);
        double double37 = paymentOptions28.calculateTotalPrice((java.util.List<Backend.Item>) itemList34);
        Backend.Item[] itemArray38 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList39 = new java.util.ArrayList<Backend.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList39, itemArray38);
        double double41 = paymentOptions28.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        double double42 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        double double43 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        Backend.PaymentOptions paymentOptions44 = new Backend.PaymentOptions();
        Backend.Item[] itemArray45 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList46 = new java.util.ArrayList<Backend.Item>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList46, itemArray45);
        double double48 = paymentOptions44.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        Backend.PaymentOptions paymentOptions49 = new Backend.PaymentOptions();
        Backend.Item[] itemArray50 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList51 = new java.util.ArrayList<Backend.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList51, itemArray50);
        double double53 = paymentOptions49.calculateTotalPrice((java.util.List<Backend.Item>) itemList51);
        double double54 = paymentOptions44.calculateTotalPrice((java.util.List<Backend.Item>) itemList51);
        double double57 = paymentOptions44.applyPromo((double) 0, "");
        Backend.PaymentOptions paymentOptions58 = new Backend.PaymentOptions();
        double double61 = paymentOptions58.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions62 = new Backend.PaymentOptions();
        Backend.Item[] itemArray63 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList64 = new java.util.ArrayList<Backend.Item>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList64, itemArray63);
        double double66 = paymentOptions62.calculateTotalPrice((java.util.List<Backend.Item>) itemList64);
        double double67 = paymentOptions58.calculateTotalPrice((java.util.List<Backend.Item>) itemList64);
        Backend.Item[] itemArray68 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList69 = new java.util.ArrayList<Backend.Item>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList69, itemArray68);
        double double71 = paymentOptions58.calculateTotalPrice((java.util.List<Backend.Item>) itemList69);
        Backend.PaymentOptions paymentOptions72 = new Backend.PaymentOptions();
        double double75 = paymentOptions72.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions76 = new Backend.PaymentOptions();
        Backend.Item[] itemArray77 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList78 = new java.util.ArrayList<Backend.Item>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList78, itemArray77);
        double double80 = paymentOptions76.calculateTotalPrice((java.util.List<Backend.Item>) itemList78);
        double double81 = paymentOptions72.calculateTotalPrice((java.util.List<Backend.Item>) itemList78);
        Backend.Item[] itemArray82 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList83 = new java.util.ArrayList<Backend.Item>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList83, itemArray82);
        double double85 = paymentOptions72.calculateTotalPrice((java.util.List<Backend.Item>) itemList83);
        double double86 = paymentOptions58.calculateTotalPrice((java.util.List<Backend.Item>) itemList83);
        double double87 = paymentOptions44.calculateTotalPrice((java.util.List<Backend.Item>) itemList83);
        double double88 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        Backend.PaymentOptions paymentOptions26 = new Backend.PaymentOptions();
        double double29 = paymentOptions26.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions26.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double39 = paymentOptions0.applyPromo((double) 'a', "");
        Backend.PaymentOptions paymentOptions40 = new Backend.PaymentOptions();
        double double43 = paymentOptions40.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions44 = new Backend.PaymentOptions();
        Backend.Item[] itemArray45 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList46 = new java.util.ArrayList<Backend.Item>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList46, itemArray45);
        double double48 = paymentOptions44.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        double double49 = paymentOptions40.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        double double50 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double11 = paymentOptions0.applyPromo((double) '4', "");
        java.lang.Class<?> wildcardClass12 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (short) -1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (-1.0f), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 10, "");
        java.lang.Class<?> wildcardClass4 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (short) 100, "");
        double double16 = paymentOptions0.applyPromo((double) (byte) 100, "");
        double double19 = paymentOptions0.applyPromo((double) 100L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) 'a', "hi!");
        Backend.PaymentOptions paymentOptions7 = new Backend.PaymentOptions();
        Backend.Item[] itemArray8 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList9 = new java.util.ArrayList<Backend.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList9, itemArray8);
        double double11 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList9);
        double double14 = paymentOptions7.applyPromo((double) '4', "hi!");
        double double17 = paymentOptions7.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        double double22 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        double double25 = paymentOptions18.applyPromo((double) '4', "hi!");
        double double28 = paymentOptions18.applyPromo((double) (byte) -1, "hi!");
        double double31 = paymentOptions18.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions32 = new Backend.PaymentOptions();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        double double36 = paymentOptions32.calculateTotalPrice((java.util.List<Backend.Item>) itemList34);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        Backend.Item[] itemArray38 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList39 = new java.util.ArrayList<Backend.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList39, itemArray38);
        double double41 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        double double42 = paymentOptions32.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        double double43 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList39);
        Backend.PaymentOptions paymentOptions44 = new Backend.PaymentOptions();
        double double47 = paymentOptions44.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions48 = new Backend.PaymentOptions();
        Backend.Item[] itemArray49 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList50 = new java.util.ArrayList<Backend.Item>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList50, itemArray49);
        double double52 = paymentOptions48.calculateTotalPrice((java.util.List<Backend.Item>) itemList50);
        double double53 = paymentOptions44.calculateTotalPrice((java.util.List<Backend.Item>) itemList50);
        double double54 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList50);
        double double55 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList50);
        Backend.PaymentOptions paymentOptions56 = new Backend.PaymentOptions();
        Backend.Item[] itemArray57 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList58 = new java.util.ArrayList<Backend.Item>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList58, itemArray57);
        double double60 = paymentOptions56.calculateTotalPrice((java.util.List<Backend.Item>) itemList58);
        double double63 = paymentOptions56.applyPromo((double) '4', "hi!");
        double double66 = paymentOptions56.applyPromo((double) (byte) -1, "hi!");
        double double69 = paymentOptions56.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions70 = new Backend.PaymentOptions();
        Backend.Item[] itemArray71 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList72 = new java.util.ArrayList<Backend.Item>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList72, itemArray71);
        double double74 = paymentOptions70.calculateTotalPrice((java.util.List<Backend.Item>) itemList72);
        Backend.PaymentOptions paymentOptions75 = new Backend.PaymentOptions();
        Backend.Item[] itemArray76 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList77 = new java.util.ArrayList<Backend.Item>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList77, itemArray76);
        double double79 = paymentOptions75.calculateTotalPrice((java.util.List<Backend.Item>) itemList77);
        double double80 = paymentOptions70.calculateTotalPrice((java.util.List<Backend.Item>) itemList77);
        double double81 = paymentOptions56.calculateTotalPrice((java.util.List<Backend.Item>) itemList77);
        double double82 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList77);
        double double83 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 52.0d + "'", double63 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions4 = new Backend.PaymentOptions();
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.PaymentOptions paymentOptions9 = new Backend.PaymentOptions();
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        double double14 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        double double15 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        double double18 = paymentOptions0.applyPromo((double) (byte) -1, "");
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double28 = paymentOptions0.applyPromo((double) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass29 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        Backend.PaymentOptions paymentOptions19 = new Backend.PaymentOptions();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        double double23 = paymentOptions19.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double24 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        double double25 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList21);
        Backend.PaymentOptions paymentOptions26 = new Backend.PaymentOptions();
        double double29 = paymentOptions26.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions26.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        java.lang.Class<?> wildcardClass37 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) 'a', "hi!");
        double double9 = paymentOptions0.applyPromo((double) (short) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.PaymentOptions paymentOptions9 = new Backend.PaymentOptions();
        double double12 = paymentOptions9.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions13 = new Backend.PaymentOptions();
        Backend.Item[] itemArray14 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList15 = new java.util.ArrayList<Backend.Item>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList15, itemArray14);
        double double17 = paymentOptions13.calculateTotalPrice((java.util.List<Backend.Item>) itemList15);
        double double18 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList15);
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        double double22 = paymentOptions9.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        double double23 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions4 = new Backend.PaymentOptions();
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double9 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        double double16 = paymentOptions0.applyPromo((double) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double11 = paymentOptions0.applyPromo((double) '4', "");
        double double14 = paymentOptions0.applyPromo((double) 'a', "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) (short) 100, "hi!");
        double double6 = paymentOptions0.applyPromo((double) (short) 1, "");
        double double9 = paymentOptions0.applyPromo((double) 100.0f, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        double double18 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList16);
        double double21 = paymentOptions14.applyPromo((double) '4', "hi!");
        double double24 = paymentOptions14.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        double double28 = paymentOptions25.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions29 = new Backend.PaymentOptions();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        double double33 = paymentOptions29.calculateTotalPrice((java.util.List<Backend.Item>) itemList31);
        double double34 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList31);
        Backend.Item[] itemArray35 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList36 = new java.util.ArrayList<Backend.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList36, itemArray35);
        double double38 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList36);
        double double39 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList36);
        double double40 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList36);
        java.lang.Class<?> wildcardClass41 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double51 = paymentOptions0.applyPromo((double) (-1), "hi!");
        double double54 = paymentOptions0.applyPromo((double) '#', "");
        double double57 = paymentOptions0.applyPromo((-1.0d), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 35.0d + "'", double54 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) (-1), "");
        Backend.PaymentOptions paymentOptions8 = new Backend.PaymentOptions();
        double double11 = paymentOptions8.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions12 = new Backend.PaymentOptions();
        Backend.Item[] itemArray13 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList14 = new java.util.ArrayList<Backend.Item>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList14, itemArray13);
        double double16 = paymentOptions12.calculateTotalPrice((java.util.List<Backend.Item>) itemList14);
        double double17 = paymentOptions8.calculateTotalPrice((java.util.List<Backend.Item>) itemList14);
        Backend.Item[] itemArray18 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList19 = new java.util.ArrayList<Backend.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList19, itemArray18);
        double double21 = paymentOptions8.calculateTotalPrice((java.util.List<Backend.Item>) itemList19);
        Backend.PaymentOptions paymentOptions22 = new Backend.PaymentOptions();
        double double25 = paymentOptions22.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions26 = new Backend.PaymentOptions();
        Backend.Item[] itemArray27 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList28 = new java.util.ArrayList<Backend.Item>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList28, itemArray27);
        double double30 = paymentOptions26.calculateTotalPrice((java.util.List<Backend.Item>) itemList28);
        double double31 = paymentOptions22.calculateTotalPrice((java.util.List<Backend.Item>) itemList28);
        Backend.Item[] itemArray32 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList33 = new java.util.ArrayList<Backend.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList33, itemArray32);
        double double35 = paymentOptions22.calculateTotalPrice((java.util.List<Backend.Item>) itemList33);
        double double36 = paymentOptions8.calculateTotalPrice((java.util.List<Backend.Item>) itemList33);
        double double37 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList33);
        java.lang.Class<?> wildcardClass38 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        double double13 = paymentOptions0.applyPromo((double) (short) 100, "");
        double double16 = paymentOptions0.applyPromo((double) 1.0f, "hi!");
        double double19 = paymentOptions0.applyPromo(35.0d, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions4 = new Backend.PaymentOptions();
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double9 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        Backend.Item[] itemArray10 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList11 = new java.util.ArrayList<Backend.Item>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList11, itemArray10);
        double double13 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList11);
        Backend.PaymentOptions paymentOptions14 = new Backend.PaymentOptions();
        double double17 = paymentOptions14.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        double double22 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        double double23 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList20);
        Backend.Item[] itemArray24 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList25 = new java.util.ArrayList<Backend.Item>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList25, itemArray24);
        double double27 = paymentOptions14.calculateTotalPrice((java.util.List<Backend.Item>) itemList25);
        double double28 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList25);
        java.lang.Class<?> wildcardClass29 = itemList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) (short) 100, "hi!");
        double double6 = paymentOptions0.applyPromo((double) (short) 1, "");
        Backend.PaymentOptions paymentOptions7 = new Backend.PaymentOptions();
        Backend.Item[] itemArray8 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList9 = new java.util.ArrayList<Backend.Item>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList9, itemArray8);
        double double11 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList9);
        double double14 = paymentOptions7.applyPromo((double) '4', "hi!");
        double double17 = paymentOptions7.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions18 = new Backend.PaymentOptions();
        double double21 = paymentOptions18.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions22 = new Backend.PaymentOptions();
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        double double26 = paymentOptions22.calculateTotalPrice((java.util.List<Backend.Item>) itemList24);
        double double27 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList24);
        Backend.Item[] itemArray28 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList29 = new java.util.ArrayList<Backend.Item>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList29, itemArray28);
        double double31 = paymentOptions18.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        double double32 = paymentOptions7.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        double double33 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        Backend.Item[] itemArray1 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList2 = new java.util.ArrayList<Backend.Item>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList2, itemArray1);
        double double4 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList2);
        double double7 = paymentOptions0.applyPromo((double) '4', "hi!");
        double double10 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        Backend.PaymentOptions paymentOptions11 = new Backend.PaymentOptions();
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        double double15 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList13);
        double double18 = paymentOptions11.applyPromo((double) '4', "hi!");
        double double21 = paymentOptions11.applyPromo((double) (byte) -1, "hi!");
        double double24 = paymentOptions11.applyPromo((double) 10.0f, "");
        Backend.PaymentOptions paymentOptions25 = new Backend.PaymentOptions();
        Backend.Item[] itemArray26 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList27 = new java.util.ArrayList<Backend.Item>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList27, itemArray26);
        double double29 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList27);
        Backend.PaymentOptions paymentOptions30 = new Backend.PaymentOptions();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        double double34 = paymentOptions30.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double35 = paymentOptions25.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        double double36 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList32);
        Backend.PaymentOptions paymentOptions37 = new Backend.PaymentOptions();
        double double40 = paymentOptions37.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions41 = new Backend.PaymentOptions();
        Backend.Item[] itemArray42 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList43 = new java.util.ArrayList<Backend.Item>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList43, itemArray42);
        double double45 = paymentOptions41.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double46 = paymentOptions37.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double47 = paymentOptions11.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double48 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList43);
        double double51 = paymentOptions0.applyPromo((double) (-1), "hi!");
        double double54 = paymentOptions0.applyPromo((double) '#', "");
        java.lang.Class<?> wildcardClass55 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 35.0d + "'", double54 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0, "hi!");
        Backend.PaymentOptions paymentOptions4 = new Backend.PaymentOptions();
        Backend.Item[] itemArray5 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList6 = new java.util.ArrayList<Backend.Item>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList6, itemArray5);
        double double8 = paymentOptions4.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        double double9 = paymentOptions0.calculateTotalPrice((java.util.List<Backend.Item>) itemList6);
        java.lang.Class<?> wildcardClass10 = paymentOptions0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Backend.PaymentOptions paymentOptions0 = new Backend.PaymentOptions();
        double double3 = paymentOptions0.applyPromo((double) 0.0f, "hi!");
        double double6 = paymentOptions0.applyPromo((double) (byte) -1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }
}

