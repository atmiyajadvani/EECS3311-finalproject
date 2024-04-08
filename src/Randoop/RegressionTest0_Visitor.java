package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_Visitor {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        visitor4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUserType();
        visitor4.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = Backend.Visitor.getVisitorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = Backend.Visitor.getNextVisitorId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5001 + "'", int0 == 5001);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        visitor4.setPassword("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        visitor4.setUserType("hi!");
        visitor4.setPassword("");
        visitor4.setVisitorId((int) (byte) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setUserType("hi!");
        visitor4.setPassword("hi!");
        java.lang.String str9 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "hi!", "hi!", (int) (short) 10);
        visitor4.setEmail("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        visitor4.setVisitorId(0);
        visitor4.setPassword("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", (int) ' ');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "", 1);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "hi!", (-1));
        visitor4.setUserType("");
        java.lang.Class<?> wildcardClass7 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        java.lang.String str8 = visitor4.getUserType();
        visitor4.setVisitorId((int) (byte) 1);
        java.lang.String str11 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUserType();
        java.lang.String str10 = visitor4.getUserType();
        java.lang.String str11 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "hi!", "", 0);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        java.lang.String str5 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getUserType();
        java.lang.String str9 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass10 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "", 0);
        java.lang.String str5 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 10);
        java.lang.String str5 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        visitor4.setVisitorId((int) (byte) 1);
        visitor4.setVisitorId((int) '4');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 10);
        java.lang.String str5 = visitor4.getPassword();
        java.lang.Class<?> wildcardClass6 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "hi!", (int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", (int) (short) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "", (int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "hi!", "hi!", (int) (short) 10);
        visitor4.setVisitorId((int) (byte) -1);
        java.lang.String str7 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "", 0);
        visitor4.setEmail("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 10);
        visitor4.setVisitorId((int) (byte) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        java.lang.String str8 = visitor4.getUserType();
        visitor4.setVisitorId((int) (byte) 1);
        visitor4.setVisitorId((int) 'a');
        java.lang.String str13 = visitor4.getUserType();
        visitor4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUserType();
        java.lang.String str10 = visitor4.getEmail();
        java.lang.String str11 = visitor4.getUserType();
        visitor4.setVisitorId(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        visitor4.setUserType("");
        visitor4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUserType();
        java.lang.String str10 = visitor4.getUserType();
        visitor4.setPassword("");
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = visitor4.getPassword();
        visitor4.setVisitorId((-1));
        java.lang.String str8 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "", 10);
        visitor4.setEmail("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.Class<?> wildcardClass8 = visitor4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "", (int) (short) 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getPassword();
        java.lang.String str9 = visitor4.getUserType();
        java.lang.String str10 = visitor4.getUserType();
        visitor4.setPassword("");
        java.lang.String str13 = visitor4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        java.lang.String str5 = visitor4.getEmail();
        visitor4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "hi!", (-1));
        visitor4.setEmail("hi!");
        java.lang.String str7 = visitor4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = visitor4.getPassword();
        visitor4.setPassword("hi!");
        java.lang.String str8 = visitor4.getUserType();
        visitor4.setVisitorId((int) (byte) 1);
        java.lang.String str11 = visitor4.getPassword();
        visitor4.setVisitorId(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        java.lang.String str5 = visitor4.getEmail();
        java.lang.String str6 = visitor4.getPassword();
        visitor4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) ' ');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        visitor4.setVisitorId(0);
        java.lang.String str9 = visitor4.getPassword();
        visitor4.setUserType("");
        java.lang.String str12 = visitor4.getEmail();
        visitor4.setEmail("");
        visitor4.setVisitorId((int) (short) 1);
        java.lang.String str17 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "", "hi!", 100);
        visitor4.setUserType("hi!");
        visitor4.setPassword("");
        visitor4.setEmail("");
        visitor4.setPassword("hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.Visitor visitor4 = new Backend.Visitor("", "hi!", "", 100);
        java.lang.String str5 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 100);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "hi!", "hi!", (int) (short) 10);
        visitor4.setVisitorId((int) (byte) -1);
        visitor4.setVisitorId((int) (byte) -1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.Visitor visitor4 = new Backend.Visitor("hi!", "hi!", "", 0);
        java.lang.String str5 = visitor4.getEmail();
        visitor4.setPassword("");
        visitor4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.Visitor visitor4 = new Backend.Visitor("", "", "hi!", (int) (byte) 1);
        visitor4.setPassword("");
        java.lang.String str7 = visitor4.getEmail();
        java.lang.String str8 = visitor4.getUserType();
        java.lang.String str9 = visitor4.getEmail();
        visitor4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }
}
