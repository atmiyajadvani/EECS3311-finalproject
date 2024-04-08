package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_Student {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = Backend.Student.getNextStudentId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1002 + "'", int0 == 1002);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        int int10 = student4.getStudentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.Student student4 = new Backend.Student("", "", "", (int) (byte) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        student4.setEmail("hi!");
        student4.setEmail("hi!");
        student4.setPassword("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.Student student4 = new Backend.Student("hi!", "", "", (int) (short) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setPassword("");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        java.lang.String str6 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        int int5 = student4.getStudentId();
        student4.setStudentId(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setPassword("");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.Student student4 = new Backend.Student("", "", "", 1002);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "", (int) '#');
        java.lang.String str5 = student4.getEmail();
        int int6 = student4.getStudentId();
        java.lang.String str7 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setPassword("");
        java.lang.String str8 = student4.getUserType();
        student4.setStudentId((int) (byte) 100);
        student4.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setStudentId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        java.lang.String str6 = student4.getUserType();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.Student student4 = new Backend.Student("", "hi!", "", (int) (byte) 10);
        int int5 = student4.getStudentId();
        java.lang.String str6 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "", (int) '#');
        java.lang.String str5 = student4.getEmail();
        int int6 = student4.getStudentId();
        java.lang.String str7 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        student4.setUserType("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.Student student4 = new Backend.Student("", "hi!", "", (int) (byte) 10);
        student4.setPassword("");
        student4.setEmail("");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        int int5 = student4.getStudentId();
        student4.setUserType("");
        student4.setStudentId((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.Student student4 = new Backend.Student("", "hi!", "", (int) (byte) 10);
        student4.setPassword("");
        java.lang.String str7 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setPassword("");
        java.lang.String str8 = student4.getUserType();
        student4.setStudentId((int) (byte) 100);
        student4.setPassword("hi!");
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setPassword("");
        java.lang.String str16 = student4.getEmail();
        java.lang.String str17 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        int int5 = student4.getStudentId();
        java.lang.String str6 = student4.getPassword();
        student4.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setStudentId(0);
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getEmail();
        int int16 = student4.getStudentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setPassword("");
        java.lang.String str8 = student4.getUserType();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setStudentId(0);
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getEmail();
        student4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setStudentId((int) '4');
        student4.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.Student student4 = new Backend.Student("", "hi!", "hi!", 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setStudentId((-1));
        student4.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        student4.setEmail("hi!");
        student4.setEmail("hi!");
        int int9 = student4.getStudentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.Student student4 = new Backend.Student("", "", "", (int) '#');
        student4.setStudentId((int) 'a');
        student4.setEmail("");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setPassword("");
        java.lang.String str16 = student4.getEmail();
        student4.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setPassword("");
        student4.setStudentId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setPassword("");
        student4.setStudentId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "", (int) '#');
        java.lang.String str5 = student4.getEmail();
        int int6 = student4.getStudentId();
        student4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.Student student4 = new Backend.Student("", "hi!", "", (int) (byte) 10);
        int int5 = student4.getStudentId();
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setStudentId(0);
        student4.setUserType("");
        student4.setPassword("");
        java.lang.String str14 = student4.getUserType();
        java.lang.String str15 = student4.getUserType();
        student4.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setPassword("");
        java.lang.String str8 = student4.getUserType();
        student4.setStudentId((int) (byte) 100);
        student4.setPassword("hi!");
        student4.setStudentId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        int int5 = student4.getStudentId();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "", 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.Student student4 = new Backend.Student("", "hi!", "", (int) (short) 0);
        java.lang.String str5 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        student4.setUserType("");
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.Student student4 = new Backend.Student("", "", "", 1002);
        int int5 = student4.getStudentId();
        student4.setUserType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1002 + "'", int5 == 1002);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "", (int) (byte) -1);
        student4.setPassword("");
        java.lang.String str7 = student4.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        student4.setUserType("hi!");
        student4.setStudentId((int) '4');
        java.lang.String str16 = student4.getEmail();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setEmail("hi!");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setUserType("hi!");
        student4.setStudentId(1);
        java.lang.String str12 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setPassword("");
        java.lang.String str8 = student4.getUserType();
        student4.setStudentId((int) (byte) 100);
        student4.setPassword("hi!");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) (byte) 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getUserType();
        student4.setUserType("");
        student4.setPassword("");
        student4.setPassword("hi!");
        java.lang.String str12 = student4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.Student student4 = new Backend.Student("hi!", "hi!", "hi!", (int) '#');
        student4.setUserType("");
        java.lang.String str7 = student4.getPassword();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}
