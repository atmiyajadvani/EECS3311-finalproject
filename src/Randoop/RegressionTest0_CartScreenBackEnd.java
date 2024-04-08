package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_CartScreenBackEnd {

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
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList23);
        java.lang.Class<?> wildcardClass27 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        boolean boolean9 = cartScreenBackEnd0.canRentMoreItems((int) '4');
        java.lang.Class<?> wildcardClass10 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList11 = cartScreenBackEnd0.loadCartItems((int) 'a');
        java.util.List<Backend.Item> itemList13 = cartScreenBackEnd0.loadCartItems((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = itemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        java.lang.String str11 = cartScreenBackEnd0.getUserRole((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray2 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList3 = new java.util.ArrayList<Backend.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList3, itemArray2);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList3);
        java.util.List<Backend.Item> itemList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cartScreenBackEnd0.setCartItems(itemList6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"cartItems\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd27 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        cartScreenBackEnd28.saveCart((int) '#', (java.util.List<Backend.Item>) itemList31);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList31);
        Backend.Item[] itemArray36 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList37 = new java.util.ArrayList<Backend.Item>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList37, itemArray36);
        cartScreenBackEnd27.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList37);
        Backend.CartScreenBackEnd cartScreenBackEnd40 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd41 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray43 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList44 = new java.util.ArrayList<Backend.Item>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList44, itemArray43);
        cartScreenBackEnd41.saveCart((int) '#', (java.util.List<Backend.Item>) itemList44);
        cartScreenBackEnd40.setCartItems((java.util.List<Backend.Item>) itemList44);
        Backend.Item[] itemArray49 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList50 = new java.util.ArrayList<Backend.Item>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList50, itemArray49);
        cartScreenBackEnd40.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList50);
        boolean boolean56 = cartScreenBackEnd0.canRentMoreItems((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray2 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList3 = new java.util.ArrayList<Backend.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList3, itemArray2);
        cartScreenBackEnd0.saveCart((-1), (java.util.List<Backend.Item>) itemList3);
        java.util.List<Backend.Item> itemList7 = cartScreenBackEnd0.loadCartItems((-1));
        java.lang.Class<?> wildcardClass8 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        java.util.List<Backend.Item> itemList23 = cartScreenBackEnd14.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd14.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) (byte) 100, itemList25);
        java.lang.Class<?> wildcardClass27 = itemList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        boolean boolean9 = cartScreenBackEnd0.canRentMoreItems((int) '4');
        Backend.CartScreenBackEnd cartScreenBackEnd10 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd11 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray13 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList14 = new java.util.ArrayList<Backend.Item>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList14, itemArray13);
        cartScreenBackEnd11.saveCart((int) '#', (java.util.List<Backend.Item>) itemList14);
        cartScreenBackEnd10.setCartItems((java.util.List<Backend.Item>) itemList14);
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd10.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList20);
        Backend.CartScreenBackEnd cartScreenBackEnd24 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd25 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray27 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList28 = new java.util.ArrayList<Backend.Item>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList28, itemArray27);
        cartScreenBackEnd25.saveCart((int) '#', (java.util.List<Backend.Item>) itemList28);
        cartScreenBackEnd24.setCartItems((java.util.List<Backend.Item>) itemList28);
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        cartScreenBackEnd24.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList34);
        cartScreenBackEnd10.saveCart((int) (short) 10, (java.util.List<Backend.Item>) itemList34);
        java.util.List<Backend.Item> itemList39 = cartScreenBackEnd10.loadCartItems((int) (byte) 1);
        cartScreenBackEnd0.setCartItems(itemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList39);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        java.util.List<Backend.Item> itemList23 = cartScreenBackEnd14.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd14.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) (byte) 100, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd27 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        cartScreenBackEnd28.saveCart((int) '#', (java.util.List<Backend.Item>) itemList31);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList31);
        Backend.Item[] itemArray36 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList37 = new java.util.ArrayList<Backend.Item>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList37, itemArray36);
        cartScreenBackEnd27.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList37);
        java.lang.String str41 = cartScreenBackEnd27.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd43 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd44 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray46 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList47 = new java.util.ArrayList<Backend.Item>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList47, itemArray46);
        cartScreenBackEnd44.saveCart((int) '#', (java.util.List<Backend.Item>) itemList47);
        cartScreenBackEnd43.setCartItems((java.util.List<Backend.Item>) itemList47);
        java.util.List<Backend.Item> itemList52 = cartScreenBackEnd43.loadCartItems((int) (short) 1);
        cartScreenBackEnd27.saveCart((int) (byte) 0, itemList52);
        Backend.CartScreenBackEnd cartScreenBackEnd54 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd55 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray57 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList58 = new java.util.ArrayList<Backend.Item>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList58, itemArray57);
        cartScreenBackEnd55.saveCart((int) '#', (java.util.List<Backend.Item>) itemList58);
        cartScreenBackEnd54.setCartItems((java.util.List<Backend.Item>) itemList58);
        Backend.Item[] itemArray63 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList64 = new java.util.ArrayList<Backend.Item>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList64, itemArray63);
        cartScreenBackEnd54.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList64);
        Backend.CartScreenBackEnd cartScreenBackEnd67 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd68 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray70 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList71 = new java.util.ArrayList<Backend.Item>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList71, itemArray70);
        cartScreenBackEnd68.saveCart((int) '#', (java.util.List<Backend.Item>) itemList71);
        cartScreenBackEnd67.setCartItems((java.util.List<Backend.Item>) itemList71);
        Backend.Item[] itemArray76 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList77 = new java.util.ArrayList<Backend.Item>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList77, itemArray76);
        cartScreenBackEnd67.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList77);
        cartScreenBackEnd54.setCartItems((java.util.List<Backend.Item>) itemList77);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList77);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList77);
        boolean boolean84 = cartScreenBackEnd0.canRentMoreItems((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        boolean boolean11 = cartScreenBackEnd0.canRentMoreItems((int) (short) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList23);
        Backend.CartScreenBackEnd cartScreenBackEnd27 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        cartScreenBackEnd28.saveCart((int) '#', (java.util.List<Backend.Item>) itemList31);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList31);
        java.util.List<Backend.Item> itemList36 = cartScreenBackEnd27.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList38 = cartScreenBackEnd27.loadCartItems((int) 'a');
        cartScreenBackEnd0.setCartItems(itemList38);
        java.lang.Class<?> wildcardClass40 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray2 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList3 = new java.util.ArrayList<Backend.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList3, itemArray2);
        cartScreenBackEnd0.saveCart((-1), (java.util.List<Backend.Item>) itemList3);
        boolean boolean7 = cartScreenBackEnd0.canRentMoreItems((int) '4');
        Backend.CartScreenBackEnd cartScreenBackEnd8 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd9 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray11 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList12 = new java.util.ArrayList<Backend.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList12, itemArray11);
        cartScreenBackEnd9.saveCart((int) '#', (java.util.List<Backend.Item>) itemList12);
        cartScreenBackEnd8.setCartItems((java.util.List<Backend.Item>) itemList12);
        java.util.List<Backend.Item> itemList17 = cartScreenBackEnd8.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList19 = cartScreenBackEnd8.loadCartItems((int) 'a');
        cartScreenBackEnd0.setCartItems(itemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        java.util.List<Backend.Item> itemList16 = cartScreenBackEnd0.loadCartItems((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        cartScreenBackEnd18.saveCart((int) '#', (java.util.List<Backend.Item>) itemList21);
        cartScreenBackEnd17.setCartItems((java.util.List<Backend.Item>) itemList21);
        boolean boolean26 = cartScreenBackEnd17.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd17.loadCartItems((int) 'a');
        cartScreenBackEnd0.setCartItems(itemList28);
        java.lang.Class<?> wildcardClass30 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd27 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        cartScreenBackEnd28.saveCart((int) '#', (java.util.List<Backend.Item>) itemList31);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList31);
        Backend.Item[] itemArray36 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList37 = new java.util.ArrayList<Backend.Item>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList37, itemArray36);
        cartScreenBackEnd27.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList37);
        Backend.CartScreenBackEnd cartScreenBackEnd40 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd41 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray43 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList44 = new java.util.ArrayList<Backend.Item>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList44, itemArray43);
        cartScreenBackEnd41.saveCart((int) '#', (java.util.List<Backend.Item>) itemList44);
        cartScreenBackEnd40.setCartItems((java.util.List<Backend.Item>) itemList44);
        Backend.Item[] itemArray49 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList50 = new java.util.ArrayList<Backend.Item>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList50, itemArray49);
        cartScreenBackEnd40.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList50);
        java.lang.Class<?> wildcardClass55 = itemList50.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList23);
        boolean boolean28 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 10);
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        cartScreenBackEnd31.saveCart((int) '#', (java.util.List<Backend.Item>) itemList34);
        cartScreenBackEnd30.setCartItems((java.util.List<Backend.Item>) itemList34);
        Backend.Item[] itemArray39 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList40 = new java.util.ArrayList<Backend.Item>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList40, itemArray39);
        cartScreenBackEnd30.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList40);
        Backend.CartScreenBackEnd cartScreenBackEnd44 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd45 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray47 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList48 = new java.util.ArrayList<Backend.Item>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList48, itemArray47);
        cartScreenBackEnd45.saveCart((int) '#', (java.util.List<Backend.Item>) itemList48);
        cartScreenBackEnd44.setCartItems((java.util.List<Backend.Item>) itemList48);
        java.util.List<Backend.Item> itemList53 = cartScreenBackEnd44.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList55 = cartScreenBackEnd44.loadCartItems((int) 'a');
        cartScreenBackEnd30.saveCart((int) (byte) 100, itemList55);
        Backend.CartScreenBackEnd cartScreenBackEnd58 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd59 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray61 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList62 = new java.util.ArrayList<Backend.Item>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList62, itemArray61);
        cartScreenBackEnd59.saveCart((int) '#', (java.util.List<Backend.Item>) itemList62);
        cartScreenBackEnd58.setCartItems((java.util.List<Backend.Item>) itemList62);
        Backend.Item[] itemArray67 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList68 = new java.util.ArrayList<Backend.Item>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList68, itemArray67);
        cartScreenBackEnd58.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList68);
        Backend.CartScreenBackEnd cartScreenBackEnd71 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd72 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray74 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList75 = new java.util.ArrayList<Backend.Item>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList75, itemArray74);
        cartScreenBackEnd72.saveCart((int) '#', (java.util.List<Backend.Item>) itemList75);
        cartScreenBackEnd71.setCartItems((java.util.List<Backend.Item>) itemList75);
        Backend.Item[] itemArray80 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList81 = new java.util.ArrayList<Backend.Item>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList81, itemArray80);
        cartScreenBackEnd71.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList81);
        cartScreenBackEnd58.setCartItems((java.util.List<Backend.Item>) itemList81);
        cartScreenBackEnd30.saveCart((int) '#', (java.util.List<Backend.Item>) itemList81);
        cartScreenBackEnd0.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList81);
        java.lang.String str88 = cartScreenBackEnd0.getUserRole(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        java.util.List<Backend.Item> itemList23 = cartScreenBackEnd14.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd14.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) (byte) 100, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        cartScreenBackEnd29.saveCart((int) '#', (java.util.List<Backend.Item>) itemList32);
        cartScreenBackEnd28.setCartItems((java.util.List<Backend.Item>) itemList32);
        Backend.Item[] itemArray37 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList38 = new java.util.ArrayList<Backend.Item>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList38, itemArray37);
        cartScreenBackEnd28.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList38);
        Backend.CartScreenBackEnd cartScreenBackEnd41 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd42 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray44 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList45 = new java.util.ArrayList<Backend.Item>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList45, itemArray44);
        cartScreenBackEnd42.saveCart((int) '#', (java.util.List<Backend.Item>) itemList45);
        cartScreenBackEnd41.setCartItems((java.util.List<Backend.Item>) itemList45);
        Backend.Item[] itemArray50 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList51 = new java.util.ArrayList<Backend.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList51, itemArray50);
        cartScreenBackEnd41.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd28.setCartItems((java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList51);
        java.lang.String str57 = cartScreenBackEnd0.getUserRole(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        boolean boolean11 = cartScreenBackEnd0.canRentMoreItems((int) (short) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray15 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList16 = new java.util.ArrayList<Backend.Item>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList16, itemArray15);
        cartScreenBackEnd13.saveCart((int) '#', (java.util.List<Backend.Item>) itemList16);
        cartScreenBackEnd0.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd27 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray30 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList31 = new java.util.ArrayList<Backend.Item>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList31, itemArray30);
        cartScreenBackEnd28.saveCart((int) '#', (java.util.List<Backend.Item>) itemList31);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList31);
        Backend.Item[] itemArray36 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList37 = new java.util.ArrayList<Backend.Item>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList37, itemArray36);
        cartScreenBackEnd27.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList37);
        Backend.CartScreenBackEnd cartScreenBackEnd40 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd41 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray43 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList44 = new java.util.ArrayList<Backend.Item>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList44, itemArray43);
        cartScreenBackEnd41.saveCart((int) '#', (java.util.List<Backend.Item>) itemList44);
        cartScreenBackEnd40.setCartItems((java.util.List<Backend.Item>) itemList44);
        Backend.Item[] itemArray49 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList50 = new java.util.ArrayList<Backend.Item>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList50, itemArray49);
        cartScreenBackEnd40.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd27.setCartItems((java.util.List<Backend.Item>) itemList50);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList50);
        Backend.CartScreenBackEnd cartScreenBackEnd56 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd57 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray59 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList60 = new java.util.ArrayList<Backend.Item>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList60, itemArray59);
        cartScreenBackEnd57.saveCart((int) '#', (java.util.List<Backend.Item>) itemList60);
        cartScreenBackEnd56.setCartItems((java.util.List<Backend.Item>) itemList60);
        boolean boolean65 = cartScreenBackEnd56.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList67 = cartScreenBackEnd56.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) 'a', itemList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList67);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        cartScreenBackEnd14.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList24);
        cartScreenBackEnd0.saveCart((int) (short) 10, (java.util.List<Backend.Item>) itemList24);
        java.util.List<Backend.Item> itemList29 = cartScreenBackEnd0.loadCartItems((int) (byte) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd32 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray34 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList35 = new java.util.ArrayList<Backend.Item>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList35, itemArray34);
        cartScreenBackEnd32.saveCart((int) '#', (java.util.List<Backend.Item>) itemList35);
        cartScreenBackEnd31.setCartItems((java.util.List<Backend.Item>) itemList35);
        java.util.List<Backend.Item> itemList40 = cartScreenBackEnd31.loadCartItems((int) (short) 1);
        boolean boolean42 = cartScreenBackEnd31.canRentMoreItems((int) (short) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd44 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd45 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray47 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList48 = new java.util.ArrayList<Backend.Item>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList48, itemArray47);
        cartScreenBackEnd45.saveCart((int) '#', (java.util.List<Backend.Item>) itemList48);
        cartScreenBackEnd44.setCartItems((java.util.List<Backend.Item>) itemList48);
        Backend.Item[] itemArray53 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList54 = new java.util.ArrayList<Backend.Item>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList54, itemArray53);
        cartScreenBackEnd44.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList54);
        cartScreenBackEnd31.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList54);
        Backend.CartScreenBackEnd cartScreenBackEnd58 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd59 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray61 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList62 = new java.util.ArrayList<Backend.Item>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList62, itemArray61);
        cartScreenBackEnd59.saveCart((int) '#', (java.util.List<Backend.Item>) itemList62);
        cartScreenBackEnd58.setCartItems((java.util.List<Backend.Item>) itemList62);
        java.util.List<Backend.Item> itemList67 = cartScreenBackEnd58.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList69 = cartScreenBackEnd58.loadCartItems((int) 'a');
        cartScreenBackEnd31.setCartItems(itemList69);
        cartScreenBackEnd0.saveCart(1, itemList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList69);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray2 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList3 = new java.util.ArrayList<Backend.Item>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList3, itemArray2);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList3);
        boolean boolean7 = cartScreenBackEnd0.canRentMoreItems(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        java.util.List<Backend.Item> itemList23 = cartScreenBackEnd14.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd14.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) (byte) 100, itemList25);
        java.lang.String str28 = cartScreenBackEnd0.getUserRole((int) '4');
        boolean boolean30 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd0.loadCartItems(1);
        java.util.List<Backend.Item> itemList30 = cartScreenBackEnd0.loadCartItems((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        java.lang.Class<?> wildcardClass27 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        boolean boolean11 = cartScreenBackEnd0.canRentMoreItems((int) (short) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList23);
        boolean boolean28 = cartScreenBackEnd0.canRentMoreItems((int) (byte) -1);
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray32 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList33 = new java.util.ArrayList<Backend.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList33, itemArray32);
        cartScreenBackEnd30.saveCart((int) '#', (java.util.List<Backend.Item>) itemList33);
        cartScreenBackEnd29.setCartItems((java.util.List<Backend.Item>) itemList33);
        java.util.List<Backend.Item> itemList38 = cartScreenBackEnd29.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList40 = cartScreenBackEnd29.loadCartItems((int) 'a');
        java.util.List<Backend.Item> itemList42 = cartScreenBackEnd29.loadCartItems((int) (byte) 10);
        cartScreenBackEnd0.setCartItems(itemList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList42);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        cartScreenBackEnd0.saveCart((int) (byte) 0, itemList25);
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd0.loadCartItems(1);
        java.lang.Class<?> wildcardClass29 = itemList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        java.util.List<Backend.Item> itemList16 = cartScreenBackEnd0.loadCartItems((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd19 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray21 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList22 = new java.util.ArrayList<Backend.Item>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList22, itemArray21);
        cartScreenBackEnd19.saveCart((int) '#', (java.util.List<Backend.Item>) itemList22);
        cartScreenBackEnd18.setCartItems((java.util.List<Backend.Item>) itemList22);
        Backend.Item[] itemArray27 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList28 = new java.util.ArrayList<Backend.Item>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList28, itemArray27);
        cartScreenBackEnd18.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList28);
        cartScreenBackEnd0.saveCart((int) (short) 10, (java.util.List<Backend.Item>) itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        Backend.Item[] itemArray11 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList12 = new java.util.ArrayList<Backend.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList12, itemArray11);
        cartScreenBackEnd0.saveCart(0, (java.util.List<Backend.Item>) itemList12);
        java.lang.String str16 = cartScreenBackEnd0.getUserRole((int) (byte) -1);
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd19 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray21 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList22 = new java.util.ArrayList<Backend.Item>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList22, itemArray21);
        cartScreenBackEnd19.saveCart((int) '#', (java.util.List<Backend.Item>) itemList22);
        cartScreenBackEnd18.setCartItems((java.util.List<Backend.Item>) itemList22);
        boolean boolean27 = cartScreenBackEnd18.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList29 = cartScreenBackEnd18.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) ' ', itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        boolean boolean9 = cartScreenBackEnd0.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList11 = cartScreenBackEnd0.loadCartItems((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        java.lang.String str16 = cartScreenBackEnd0.getUserRole((int) (byte) 10);
        boolean boolean18 = cartScreenBackEnd0.canRentMoreItems(10);
        Backend.CartScreenBackEnd cartScreenBackEnd19 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray21 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList22 = new java.util.ArrayList<Backend.Item>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList22, itemArray21);
        cartScreenBackEnd19.saveCart((int) '#', (java.util.List<Backend.Item>) itemList22);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        cartScreenBackEnd14.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList24);
        cartScreenBackEnd0.saveCart((int) (short) 10, (java.util.List<Backend.Item>) itemList24);
        java.util.List<Backend.Item> itemList29 = cartScreenBackEnd0.loadCartItems((int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = itemList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray18 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList19 = new java.util.ArrayList<Backend.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList19, itemArray18);
        cartScreenBackEnd16.saveCart((int) '#', (java.util.List<Backend.Item>) itemList19);
        cartScreenBackEnd15.setCartItems((java.util.List<Backend.Item>) itemList19);
        Backend.Item[] itemArray24 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList25 = new java.util.ArrayList<Backend.Item>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList25, itemArray24);
        cartScreenBackEnd15.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        cartScreenBackEnd29.saveCart((int) '#', (java.util.List<Backend.Item>) itemList32);
        cartScreenBackEnd28.setCartItems((java.util.List<Backend.Item>) itemList32);
        Backend.Item[] itemArray37 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList38 = new java.util.ArrayList<Backend.Item>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList38, itemArray37);
        cartScreenBackEnd28.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList38);
        cartScreenBackEnd15.setCartItems((java.util.List<Backend.Item>) itemList38);
        boolean boolean43 = cartScreenBackEnd15.canRentMoreItems((int) (byte) 10);
        boolean boolean45 = cartScreenBackEnd15.canRentMoreItems((int) (short) 100);
        Backend.CartScreenBackEnd cartScreenBackEnd47 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd48 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray50 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList51 = new java.util.ArrayList<Backend.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList51, itemArray50);
        cartScreenBackEnd48.saveCart((int) '#', (java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd47.setCartItems((java.util.List<Backend.Item>) itemList51);
        Backend.Item[] itemArray56 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList57 = new java.util.ArrayList<Backend.Item>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList57, itemArray56);
        cartScreenBackEnd47.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList57);
        Backend.CartScreenBackEnd cartScreenBackEnd60 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd61 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray63 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList64 = new java.util.ArrayList<Backend.Item>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList64, itemArray63);
        cartScreenBackEnd61.saveCart((int) '#', (java.util.List<Backend.Item>) itemList64);
        cartScreenBackEnd60.setCartItems((java.util.List<Backend.Item>) itemList64);
        Backend.Item[] itemArray69 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList70 = new java.util.ArrayList<Backend.Item>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList70, itemArray69);
        cartScreenBackEnd60.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList70);
        cartScreenBackEnd47.setCartItems((java.util.List<Backend.Item>) itemList70);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList70);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        java.util.List<Backend.Item> itemList16 = cartScreenBackEnd0.loadCartItems((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        cartScreenBackEnd18.saveCart((int) '#', (java.util.List<Backend.Item>) itemList21);
        cartScreenBackEnd17.setCartItems((java.util.List<Backend.Item>) itemList21);
        boolean boolean26 = cartScreenBackEnd17.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd17.loadCartItems((int) 'a');
        cartScreenBackEnd0.setCartItems(itemList28);
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        cartScreenBackEnd31.saveCart((int) '#', (java.util.List<Backend.Item>) itemList34);
        cartScreenBackEnd30.setCartItems((java.util.List<Backend.Item>) itemList34);
        boolean boolean39 = cartScreenBackEnd30.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList41 = cartScreenBackEnd30.loadCartItems((int) 'a');
        Backend.CartScreenBackEnd cartScreenBackEnd42 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd43 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray45 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList46 = new java.util.ArrayList<Backend.Item>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList46, itemArray45);
        cartScreenBackEnd43.saveCart((int) '#', (java.util.List<Backend.Item>) itemList46);
        cartScreenBackEnd42.setCartItems((java.util.List<Backend.Item>) itemList46);
        boolean boolean51 = cartScreenBackEnd42.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList53 = cartScreenBackEnd42.loadCartItems((int) 'a');
        cartScreenBackEnd30.setCartItems(itemList53);
        cartScreenBackEnd0.setCartItems(itemList53);
        Backend.CartScreenBackEnd cartScreenBackEnd56 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd57 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray59 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList60 = new java.util.ArrayList<Backend.Item>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList60, itemArray59);
        cartScreenBackEnd57.saveCart((int) '#', (java.util.List<Backend.Item>) itemList60);
        cartScreenBackEnd56.setCartItems((java.util.List<Backend.Item>) itemList60);
        Backend.Item[] itemArray65 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList66 = new java.util.ArrayList<Backend.Item>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList66, itemArray65);
        cartScreenBackEnd56.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList66);
        Backend.CartScreenBackEnd cartScreenBackEnd69 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd70 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray72 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList73 = new java.util.ArrayList<Backend.Item>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList73, itemArray72);
        cartScreenBackEnd70.saveCart((int) '#', (java.util.List<Backend.Item>) itemList73);
        cartScreenBackEnd69.setCartItems((java.util.List<Backend.Item>) itemList73);
        Backend.Item[] itemArray78 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList79 = new java.util.ArrayList<Backend.Item>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList79, itemArray78);
        cartScreenBackEnd69.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList79);
        cartScreenBackEnd56.setCartItems((java.util.List<Backend.Item>) itemList79);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        Backend.Item[] itemArray11 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList12 = new java.util.ArrayList<Backend.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList12, itemArray11);
        cartScreenBackEnd0.saveCart(0, (java.util.List<Backend.Item>) itemList12);
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray19 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList20 = new java.util.ArrayList<Backend.Item>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList20, itemArray19);
        cartScreenBackEnd17.saveCart((int) '#', (java.util.List<Backend.Item>) itemList20);
        cartScreenBackEnd16.setCartItems((java.util.List<Backend.Item>) itemList20);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd16.loadCartItems((int) (short) 1);
        boolean boolean27 = cartScreenBackEnd16.canRentMoreItems((int) (short) 1);
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray32 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList33 = new java.util.ArrayList<Backend.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList33, itemArray32);
        cartScreenBackEnd30.saveCart((int) '#', (java.util.List<Backend.Item>) itemList33);
        cartScreenBackEnd29.setCartItems((java.util.List<Backend.Item>) itemList33);
        Backend.Item[] itemArray38 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList39 = new java.util.ArrayList<Backend.Item>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList39, itemArray38);
        cartScreenBackEnd29.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList39);
        cartScreenBackEnd16.saveCart((int) ' ', (java.util.List<Backend.Item>) itemList39);
        cartScreenBackEnd0.saveCart((-1), (java.util.List<Backend.Item>) itemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList23);
        boolean boolean28 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 10);
        boolean boolean30 = cartScreenBackEnd0.canRentMoreItems((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        Backend.Item[] itemArray11 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList12 = new java.util.ArrayList<Backend.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList12, itemArray11);
        cartScreenBackEnd0.saveCart(0, (java.util.List<Backend.Item>) itemList12);
        java.lang.String str16 = cartScreenBackEnd0.getUserRole((int) (byte) -1);
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd19 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray21 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList22 = new java.util.ArrayList<Backend.Item>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList22, itemArray21);
        cartScreenBackEnd19.saveCart((int) '#', (java.util.List<Backend.Item>) itemList22);
        cartScreenBackEnd18.setCartItems((java.util.List<Backend.Item>) itemList22);
        cartScreenBackEnd0.saveCart((int) '4', (java.util.List<Backend.Item>) itemList22);
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd0.loadCartItems((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        boolean boolean9 = cartScreenBackEnd0.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList11 = cartScreenBackEnd0.loadCartItems((int) (short) -1);
        java.lang.String str13 = cartScreenBackEnd0.getUserRole((int) (short) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray18 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList19 = new java.util.ArrayList<Backend.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList19, itemArray18);
        cartScreenBackEnd16.saveCart((int) '#', (java.util.List<Backend.Item>) itemList19);
        cartScreenBackEnd15.setCartItems((java.util.List<Backend.Item>) itemList19);
        java.util.List<Backend.Item> itemList24 = cartScreenBackEnd15.loadCartItems((int) (short) 1);
        boolean boolean26 = cartScreenBackEnd15.canRentMoreItems((int) (short) 1);
        java.lang.String str28 = cartScreenBackEnd15.getUserRole((int) (short) 10);
        java.util.List<Backend.Item> itemList30 = cartScreenBackEnd15.loadCartItems((int) (byte) 100);
        cartScreenBackEnd0.saveCart((int) '4', itemList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        java.util.List<Backend.Item> itemList23 = cartScreenBackEnd14.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList25 = cartScreenBackEnd14.loadCartItems((int) 'a');
        cartScreenBackEnd0.saveCart((int) (byte) 100, itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd28 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray31 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList32 = new java.util.ArrayList<Backend.Item>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList32, itemArray31);
        cartScreenBackEnd29.saveCart((int) '#', (java.util.List<Backend.Item>) itemList32);
        cartScreenBackEnd28.setCartItems((java.util.List<Backend.Item>) itemList32);
        Backend.Item[] itemArray37 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList38 = new java.util.ArrayList<Backend.Item>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList38, itemArray37);
        cartScreenBackEnd28.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList38);
        Backend.CartScreenBackEnd cartScreenBackEnd41 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd42 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray44 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList45 = new java.util.ArrayList<Backend.Item>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList45, itemArray44);
        cartScreenBackEnd42.saveCart((int) '#', (java.util.List<Backend.Item>) itemList45);
        cartScreenBackEnd41.setCartItems((java.util.List<Backend.Item>) itemList45);
        Backend.Item[] itemArray50 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList51 = new java.util.ArrayList<Backend.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList51, itemArray50);
        cartScreenBackEnd41.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd28.setCartItems((java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList51);
        java.lang.String str57 = cartScreenBackEnd0.getUserRole((int) (short) -1);
        java.util.List<Backend.Item> itemList59 = cartScreenBackEnd0.loadCartItems(10);
        java.lang.Class<?> wildcardClass60 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        java.util.List<Backend.Item> itemList16 = cartScreenBackEnd0.loadCartItems((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd17 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd18 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray20 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList21 = new java.util.ArrayList<Backend.Item>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList21, itemArray20);
        cartScreenBackEnd18.saveCart((int) '#', (java.util.List<Backend.Item>) itemList21);
        cartScreenBackEnd17.setCartItems((java.util.List<Backend.Item>) itemList21);
        boolean boolean26 = cartScreenBackEnd17.canRentMoreItems((int) '4');
        java.util.List<Backend.Item> itemList28 = cartScreenBackEnd17.loadCartItems((int) 'a');
        cartScreenBackEnd0.setCartItems(itemList28);
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd32 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray34 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList35 = new java.util.ArrayList<Backend.Item>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList35, itemArray34);
        cartScreenBackEnd32.saveCart((int) '#', (java.util.List<Backend.Item>) itemList35);
        cartScreenBackEnd31.setCartItems((java.util.List<Backend.Item>) itemList35);
        Backend.Item[] itemArray40 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList41 = new java.util.ArrayList<Backend.Item>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList41, itemArray40);
        cartScreenBackEnd31.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList41);
        java.lang.String str45 = cartScreenBackEnd31.getUserRole((int) (byte) 0);
        Backend.CartScreenBackEnd cartScreenBackEnd47 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd48 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray50 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList51 = new java.util.ArrayList<Backend.Item>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList51, itemArray50);
        cartScreenBackEnd48.saveCart((int) '#', (java.util.List<Backend.Item>) itemList51);
        cartScreenBackEnd47.setCartItems((java.util.List<Backend.Item>) itemList51);
        java.util.List<Backend.Item> itemList56 = cartScreenBackEnd47.loadCartItems((int) (short) 1);
        cartScreenBackEnd31.saveCart((int) (byte) 0, itemList56);
        cartScreenBackEnd0.saveCart(1, itemList56);
        java.lang.Class<?> wildcardClass59 = cartScreenBackEnd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList23);
        boolean boolean28 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 10);
        boolean boolean30 = cartScreenBackEnd0.canRentMoreItems((int) (short) 100);
        Backend.CartScreenBackEnd cartScreenBackEnd32 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd33 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray35 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList36 = new java.util.ArrayList<Backend.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList36, itemArray35);
        cartScreenBackEnd33.saveCart((int) '#', (java.util.List<Backend.Item>) itemList36);
        cartScreenBackEnd32.setCartItems((java.util.List<Backend.Item>) itemList36);
        Backend.Item[] itemArray41 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList42 = new java.util.ArrayList<Backend.Item>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList42, itemArray41);
        cartScreenBackEnd32.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList42);
        Backend.CartScreenBackEnd cartScreenBackEnd45 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd46 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray48 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList49 = new java.util.ArrayList<Backend.Item>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList49, itemArray48);
        cartScreenBackEnd46.saveCart((int) '#', (java.util.List<Backend.Item>) itemList49);
        cartScreenBackEnd45.setCartItems((java.util.List<Backend.Item>) itemList49);
        Backend.Item[] itemArray54 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList55 = new java.util.ArrayList<Backend.Item>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList55, itemArray54);
        cartScreenBackEnd45.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList55);
        cartScreenBackEnd32.setCartItems((java.util.List<Backend.Item>) itemList55);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList55);
        java.lang.String str61 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd13 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray16 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList17 = new java.util.ArrayList<Backend.Item>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList17, itemArray16);
        cartScreenBackEnd14.saveCart((int) '#', (java.util.List<Backend.Item>) itemList17);
        cartScreenBackEnd13.setCartItems((java.util.List<Backend.Item>) itemList17);
        Backend.Item[] itemArray22 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList23 = new java.util.ArrayList<Backend.Item>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList23, itemArray22);
        cartScreenBackEnd13.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList23);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList23);
        boolean boolean28 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 10);
        boolean boolean30 = cartScreenBackEnd0.canRentMoreItems((int) (short) 100);
        Backend.CartScreenBackEnd cartScreenBackEnd32 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd33 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray35 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList36 = new java.util.ArrayList<Backend.Item>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList36, itemArray35);
        cartScreenBackEnd33.saveCart((int) '#', (java.util.List<Backend.Item>) itemList36);
        cartScreenBackEnd32.setCartItems((java.util.List<Backend.Item>) itemList36);
        Backend.Item[] itemArray41 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList42 = new java.util.ArrayList<Backend.Item>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList42, itemArray41);
        cartScreenBackEnd32.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList42);
        Backend.CartScreenBackEnd cartScreenBackEnd45 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd46 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray48 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList49 = new java.util.ArrayList<Backend.Item>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList49, itemArray48);
        cartScreenBackEnd46.saveCart((int) '#', (java.util.List<Backend.Item>) itemList49);
        cartScreenBackEnd45.setCartItems((java.util.List<Backend.Item>) itemList49);
        Backend.Item[] itemArray54 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList55 = new java.util.ArrayList<Backend.Item>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList55, itemArray54);
        cartScreenBackEnd45.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList55);
        cartScreenBackEnd32.setCartItems((java.util.List<Backend.Item>) itemList55);
        cartScreenBackEnd0.saveCart((int) '#', (java.util.List<Backend.Item>) itemList55);
        java.util.List<Backend.Item> itemList61 = cartScreenBackEnd0.loadCartItems((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList61);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd2 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray4 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList5 = new java.util.ArrayList<Backend.Item>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList5, itemArray4);
        cartScreenBackEnd2.saveCart((int) '#', (java.util.List<Backend.Item>) itemList5);
        cartScreenBackEnd1.setCartItems((java.util.List<Backend.Item>) itemList5);
        java.util.List<Backend.Item> itemList10 = cartScreenBackEnd1.loadCartItems((int) (short) 1);
        Backend.Item[] itemArray12 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList13 = new java.util.ArrayList<Backend.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList13, itemArray12);
        cartScreenBackEnd1.saveCart(0, (java.util.List<Backend.Item>) itemList13);
        java.lang.String str17 = cartScreenBackEnd1.getUserRole((int) (byte) -1);
        java.lang.String str19 = cartScreenBackEnd1.getUserRole((int) '#');
        Backend.CartScreenBackEnd cartScreenBackEnd20 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd21 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        cartScreenBackEnd21.saveCart((int) '#', (java.util.List<Backend.Item>) itemList24);
        cartScreenBackEnd20.setCartItems((java.util.List<Backend.Item>) itemList24);
        boolean boolean29 = cartScreenBackEnd20.canRentMoreItems((int) '4');
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        cartScreenBackEnd31.saveCart((int) '#', (java.util.List<Backend.Item>) itemList34);
        cartScreenBackEnd30.setCartItems((java.util.List<Backend.Item>) itemList34);
        java.util.List<Backend.Item> itemList39 = cartScreenBackEnd30.loadCartItems((int) (short) 1);
        boolean boolean41 = cartScreenBackEnd30.canRentMoreItems((int) (short) 1);
        java.lang.String str43 = cartScreenBackEnd30.getUserRole((int) (short) 10);
        java.util.List<Backend.Item> itemList45 = cartScreenBackEnd30.loadCartItems((int) (byte) 100);
        cartScreenBackEnd20.setCartItems(itemList45);
        cartScreenBackEnd1.setCartItems(itemList45);
        java.util.List<Backend.Item> itemList49 = cartScreenBackEnd1.loadCartItems((int) (byte) 100);
        cartScreenBackEnd0.setCartItems(itemList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList49);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        java.lang.String str14 = cartScreenBackEnd0.getUserRole((int) (byte) 100);
        java.util.List<Backend.Item> itemList16 = cartScreenBackEnd0.loadCartItems((int) (byte) 0);
        java.lang.String str18 = cartScreenBackEnd0.getUserRole(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        java.util.List<Backend.Item> itemList9 = cartScreenBackEnd0.loadCartItems((int) (short) 1);
        Backend.Item[] itemArray11 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList12 = new java.util.ArrayList<Backend.Item>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList12, itemArray11);
        cartScreenBackEnd0.saveCart(0, (java.util.List<Backend.Item>) itemList12);
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd16 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray18 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList19 = new java.util.ArrayList<Backend.Item>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList19, itemArray18);
        cartScreenBackEnd16.saveCart((int) '#', (java.util.List<Backend.Item>) itemList19);
        cartScreenBackEnd15.setCartItems((java.util.List<Backend.Item>) itemList19);
        Backend.Item[] itemArray24 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList25 = new java.util.ArrayList<Backend.Item>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList25, itemArray24);
        cartScreenBackEnd15.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList25);
        Backend.CartScreenBackEnd cartScreenBackEnd29 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray32 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList33 = new java.util.ArrayList<Backend.Item>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList33, itemArray32);
        cartScreenBackEnd30.saveCart((int) '#', (java.util.List<Backend.Item>) itemList33);
        cartScreenBackEnd29.setCartItems((java.util.List<Backend.Item>) itemList33);
        java.util.List<Backend.Item> itemList38 = cartScreenBackEnd29.loadCartItems((int) (short) 1);
        java.util.List<Backend.Item> itemList40 = cartScreenBackEnd29.loadCartItems((int) 'a');
        cartScreenBackEnd15.saveCart((int) (byte) 100, itemList40);
        cartScreenBackEnd0.setCartItems(itemList40);
        java.util.List<Backend.Item> itemList44 = cartScreenBackEnd0.loadCartItems((int) (byte) 1);
        boolean boolean46 = cartScreenBackEnd0.canRentMoreItems((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.CartScreenBackEnd cartScreenBackEnd0 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd1 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray3 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList4 = new java.util.ArrayList<Backend.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList4, itemArray3);
        cartScreenBackEnd1.saveCart((int) '#', (java.util.List<Backend.Item>) itemList4);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList4);
        Backend.Item[] itemArray9 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList10 = new java.util.ArrayList<Backend.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList10, itemArray9);
        cartScreenBackEnd0.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList10);
        Backend.CartScreenBackEnd cartScreenBackEnd14 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd15 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray17 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList18 = new java.util.ArrayList<Backend.Item>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList18, itemArray17);
        cartScreenBackEnd15.saveCart((int) '#', (java.util.List<Backend.Item>) itemList18);
        cartScreenBackEnd14.setCartItems((java.util.List<Backend.Item>) itemList18);
        Backend.Item[] itemArray23 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList24 = new java.util.ArrayList<Backend.Item>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList24, itemArray23);
        cartScreenBackEnd14.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList24);
        cartScreenBackEnd0.saveCart((int) (short) 10, (java.util.List<Backend.Item>) itemList24);
        boolean boolean29 = cartScreenBackEnd0.canRentMoreItems((int) '#');
        Backend.CartScreenBackEnd cartScreenBackEnd30 = new Backend.CartScreenBackEnd();
        Backend.CartScreenBackEnd cartScreenBackEnd31 = new Backend.CartScreenBackEnd();
        Backend.Item[] itemArray33 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList34 = new java.util.ArrayList<Backend.Item>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList34, itemArray33);
        cartScreenBackEnd31.saveCart((int) '#', (java.util.List<Backend.Item>) itemList34);
        cartScreenBackEnd30.setCartItems((java.util.List<Backend.Item>) itemList34);
        Backend.Item[] itemArray39 = new Backend.Item[] {};
        java.util.ArrayList<Backend.Item> itemList40 = new java.util.ArrayList<Backend.Item>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<Backend.Item>) itemList40, itemArray39);
        cartScreenBackEnd30.saveCart((int) (short) -1, (java.util.List<Backend.Item>) itemList40);
        cartScreenBackEnd0.setCartItems((java.util.List<Backend.Item>) itemList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }
}
