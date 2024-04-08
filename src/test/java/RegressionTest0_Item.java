package test.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_Item {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str1 = Backend.Item.getNextID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str1 = Backend.Item.formatPrice("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.00" + "'", str1.equals("1.00"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        boolean boolean1 = Backend.Item.isValidPrice("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str1 = Backend.Item.getNextID("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = Backend.Item.formatPrice("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".00" + "'", str1.equals(".00"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean1 = Backend.Item.isValidPrice("1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        boolean boolean1 = Backend.Item.isValidPrice("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        boolean boolean1 = Backend.Item.isValidPrice(".00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = Backend.Item.formatPrice(" |  | 1.00 |  Available copies. | disabled");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str1.equals(" |  | 1.00 |  Available copies. | disabled"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        java.lang.String str10 = item7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        boolean boolean1 = Backend.Item.isValidPrice("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.Item item7 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "", "", ".00", "1.00", (double) 10L, " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str8 = item7.getAuthor();
        item7.setAmountLeft(".00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getAmountLeft();
        item7.setAmountLeft("1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        item7.disable();
        boolean boolean11 = item7.isEnabled();
        item7.enable();
        item7.setPrice((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str1 = Backend.Item.formatPrice("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!.00" + "'", str1.equals("hi!.00"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        double double10 = item7.getPrice();
        boolean boolean11 = item7.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.Item item7 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "", "", ".00", "1.00", (double) 10L, " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str9.equals(" |  | 1.00 |  Available copies. | disabled"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getAmountLeft();
        java.lang.String str10 = item7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str10.equals(" |  | 1.00 |  Available copies. | disabled"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        item7.disable();
        item7.disable();
        java.lang.String str10 = item7.getId();
        item7.setAmountLeft("hi!");
        boolean boolean14 = item7.equals((java.lang.Object) "1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String str1 = Backend.Item.getNextID(" |  | 1.00 |  Available copies. | disabled");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        boolean boolean10 = item7.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.getItemType();
        boolean boolean13 = item7.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1.00" + "'", str12.equals("1.00"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.Item item7 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "", "", ".00", "1.00", (double) 10L, " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str8 = item7.getItemType();
        item7.setAmountLeft("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".00" + "'", str8.equals(".00"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.String str1 = Backend.Item.formatPrice("1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.00" + "'", str1.equals("1.00"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getId();
        java.lang.String str11 = item7.getAmountLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.toString();
        Backend.Item item17 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "", "", ".00", "1.00", (double) 10L, " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str18 = item17.getName();
        java.lang.Class<?> wildcardClass19 = item17.getClass();
        boolean boolean20 = item7.equals((java.lang.Object) wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str9.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getAuthor();
        java.lang.String str10 = item7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        item7.disable();
        item7.disable();
        java.lang.String str10 = item7.getId();
        item7.setAmountLeft("hi!");
        double double13 = item7.getPrice();
        item7.setPrice((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        boolean boolean12 = item7.isEnabled();
        item7.setAmountLeft("1");
        double double15 = item7.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.Item item7 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "", "", ".00", "1.00", (double) 10L, " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getAuthor();
        boolean boolean10 = item7.isEnabled();
        java.lang.String str11 = item7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.Item item7 = new Backend.Item(" |  | 1.00 |  Available copies. | disabled", "1.00", " |  | 1.00 |  Available copies. | disabled", "", " |  | 1.00 |  Available copies. | disabled", (double) (-1.0f), " |  | 1.00 |  Available copies. | disabled");
        java.lang.String str8 = item7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.00 |  |  | 1.00 |  Available copies. | disabled |  |  |  | 1.00 |  Available copies. | disabled Available copies. | disabled" + "'", str8.equals("1.00 |  |  | 1.00 |  Available copies. | disabled |  |  |  | 1.00 |  Available copies. | disabled Available copies. | disabled"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        boolean boolean12 = item7.isEnabled();
        item7.setAmountLeft("1");
        java.lang.String str15 = item7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1" + "'", str15.equals("1"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        item7.disable();
        item7.setPrice((double) (byte) 0);
        java.lang.String str13 = item7.getId();
        item7.setAmountLeft(" |  | 1.00 |  Available copies. | disabled");
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1" + "'", str13.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.Item item7 = new Backend.Item("hi!", "", "1.00 |  |  | 1.00 |  Available copies. | disabled |  |  |  | 1.00 |  Available copies. | disabled Available copies. | disabled", "", "", (double) 10.0f, " |  | 1.00 |  Available copies. | disabled");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getAuthor();
        java.lang.String str10 = item7.getId();
        java.lang.String str11 = item7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1.00" + "'", str11.equals("1.00"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        item7.disable();
        item7.setPrice((double) (byte) 0);
        java.lang.String str13 = item7.getId();
        item7.setAmountLeft(" |  | 1.00 |  Available copies. | disabled");
        item7.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1" + "'", str13.equals("1"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.Item item7 = new Backend.Item("hi!.00", "", "", "", ".00", (double) 1, "hi!");
        Backend.Item item15 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        item15.disable();
        item15.disable();
        boolean boolean18 = item7.equals((java.lang.Object) item15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getId();
        boolean boolean12 = item7.equals((java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        item7.disable();
        item7.disable();
        java.lang.String str10 = item7.getId();
        item7.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getId();
        item7.setAmountLeft("");
        double double13 = item7.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        item7.disable();
        item7.disable();
        java.lang.String str10 = item7.getId();
        item7.setAmountLeft("hi!");
        java.lang.String str13 = item7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1" + "'", str13.equals("1"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.getAuthor();
        item7.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getName();
        item7.enable();
        boolean boolean14 = item7.equals((java.lang.Object) (byte) -1);
        java.lang.String str15 = item7.getAuthor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        item7.enable();
        item7.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getId();
        item7.disable();
        item7.setPrice((double) (byte) 0);
        java.lang.String str13 = item7.getId();
        double double14 = item7.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1" + "'", str13.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getAmountLeft();
        java.lang.String str11 = item7.getName();
        item7.setAmountLeft("1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.Item item7 = new Backend.Item("1", "", "", "1.00", "", (double) 'a', "1.00");
        java.lang.String str8 = item7.toString();
        boolean boolean9 = item7.isEnabled();
        java.lang.String str10 = item7.getName();
        item7.setAmountLeft("1");
        Backend.Item item20 = new Backend.Item("hi!", " |  | 1.00 |  Available copies. | disabled", ".00", "1", "1", (double) (short) -1, "hi!");
        boolean boolean21 = item7.equals((java.lang.Object) item20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " |  | 1.00 |  Available copies. | disabled" + "'", str8.equals(" |  | 1.00 |  Available copies. | disabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str1 = Backend.Item.getNextID("1.00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.Item item7 = new Backend.Item("hi!", "", "1.00", "hi!.00", "1.00", (double) 10, "1.00");
        java.lang.String str8 = item7.getAuthor();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.00" + "'", str8.equals("1.00"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

