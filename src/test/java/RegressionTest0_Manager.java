package test.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_Manager {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = Backend.Manager.getNextManagerId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4001 + "'", int0 == 4001);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = Backend.Manager.getManagerId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.Class<?> wildcardClass8 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.Manager manager4 = new Backend.Manager("", "", "", (int) '#');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        manager4.setUserType("hi!");
        java.lang.String str7 = manager4.getUserType();
        java.lang.String str8 = manager4.getPassword();
        manager4.setManagerRole(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        manager4.setPassword("");
        manager4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getUserType();
        manager4.setUserType("");
        manager4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        java.lang.String str6 = manager4.getUserType();
        manager4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        manager4.setUserType("hi!");
        manager4.setPassword("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getUserType();
        manager4.setUserType("");
        java.lang.String str8 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        manager4.setManagerRole((int) (byte) 1);
        java.lang.String str7 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.String str10 = manager4.getEmail();
        manager4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        java.lang.String str6 = manager4.getUserType();
        java.lang.String str7 = manager4.getUserType();
        java.lang.String str8 = manager4.getEmail();
        java.lang.String str9 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        java.lang.String str6 = manager4.getUserType();
        java.lang.String str7 = manager4.getUserType();
        java.lang.String str8 = manager4.getEmail();
        manager4.setPassword("");
        manager4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "", 4001);
        java.lang.String str5 = manager4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        java.lang.String str6 = manager4.getUserType();
        java.lang.String str7 = manager4.getUserType();
        java.lang.Class<?> wildcardClass8 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 10);
        manager4.setEmail("");
        java.lang.String str7 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        manager4.setPassword("hi!");
        java.lang.Class<?> wildcardClass10 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        manager4.setEmail("");
        java.lang.String str7 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 10);
        manager4.setUserType("");
        manager4.setPassword("hi!");
        java.lang.String str9 = manager4.getUserType();
        manager4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.Manager manager4 = new Backend.Manager("", "", "", (int) (byte) 10);
        manager4.setManagerRole((int) (byte) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        manager4.setManagerRole((int) (byte) 1);
        java.lang.String str7 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.String str10 = manager4.getEmail();
        manager4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "", (int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.Manager manager4 = new Backend.Manager("", "", "", (int) (byte) 10);
        java.lang.String str5 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.Manager manager4 = new Backend.Manager("", "", "hi!", 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        manager4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.String str8 = manager4.getUserType();
        manager4.setEmail("hi!");
        java.lang.String str11 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        manager4.setUserType("");
        manager4.setManagerRole((int) (byte) 0);
        java.lang.String str10 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 10);
        manager4.setManagerRole((int) (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.String str8 = manager4.getUserType();
        java.lang.String str9 = manager4.getUserType();
        java.lang.String str10 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 0);
        manager4.setPassword("");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "", (int) (byte) -1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "", (int) (short) -1);
        manager4.setPassword("");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 10);
        java.lang.Class<?> wildcardClass5 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getUserType();
        manager4.setUserType("");
        java.lang.String str8 = manager4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        manager4.setPassword("hi!");
        java.lang.String str10 = manager4.getPassword();
        java.lang.String str11 = manager4.getUserType();
        java.lang.String str12 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "", (int) (short) -1);
        manager4.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = manager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) ' ');
        manager4.setUserType("hi!");
        manager4.setUserType("");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.Manager manager4 = new Backend.Manager("", "", "", 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "", (int) (short) 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = manager4.getPassword();
        manager4.setPassword("");
        manager4.setPassword("");
        java.lang.String str10 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        manager4.setUserType("hi!");
        java.lang.String str7 = manager4.getUserType();
        java.lang.String str8 = manager4.getPassword();
        java.lang.String str9 = manager4.getEmail();
        manager4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", 100);
        manager4.setManagerRole((int) '#');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "", (int) (short) -1);
        manager4.setEmail("");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) (short) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.Manager manager4 = new Backend.Manager("", "", "hi!", 4001);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.Manager manager4 = new Backend.Manager("hi!", "hi!", "hi!", (int) '#');
        manager4.setPassword("hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", (int) (short) -1);
        manager4.setEmail("");
        manager4.setPassword("");
        java.lang.String str9 = manager4.getPassword();
        manager4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "", (int) (byte) 10);
        java.lang.String str5 = manager4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.Manager manager4 = new Backend.Manager("", "hi!", "hi!", 10);
        manager4.setUserType("");
        manager4.setPassword("hi!");
        java.lang.String str9 = manager4.getUserType();
        java.lang.String str10 = manager4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.Manager manager4 = new Backend.Manager("hi!", "", "hi!", (int) '#');
        java.lang.String str5 = manager4.getEmail();
        manager4.setUserType("");
        java.lang.String str8 = manager4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }
}
