package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_RegistrationException {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        // The following exception was thrown during execution in test generation
        try {
            registrationException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.String str3 = registrationException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Backend.RegistrationException: " + "'", str3.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.String str5 = registrationException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Backend.RegistrationException: " + "'", str5.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Class<?> wildcardClass5 = registrationException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Class<?> wildcardClass2 = registrationException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable[] throwableArray3 = registrationException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = registrationException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable[] throwableArray3 = registrationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = registrationException2.getSuppressed();
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("hi!");
        registrationException2.addSuppressed((java.lang.Throwable) registrationException6);
        java.lang.String str8 = registrationException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Backend.RegistrationException: " + "'", str8.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        java.lang.Throwable[] throwableArray7 = registrationException6.getSuppressed();
        java.lang.String str8 = registrationException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Backend.RegistrationException: " + "'", str8.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Class<?> wildcardClass5 = registrationException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException5.addSuppressed((java.lang.Throwable) registrationException9);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException9);
        java.lang.String str13 = registrationException12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Backend.RegistrationException: " + "'", str13.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        java.lang.String str7 = registrationException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Backend.RegistrationException: " + "'", str7.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException3);
        java.lang.String str5 = registrationException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Backend.RegistrationException: " + "'", str5.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("Backend.RegistrationException: ", throwable1);
        java.lang.Class<?> wildcardClass3 = registrationException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray9 = registrationException8.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.String str11 = registrationException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Backend.RegistrationException: " + "'", str11.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        java.lang.Class<?> wildcardClass7 = registrationException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray8 = registrationException7.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException7);
        java.lang.Throwable throwable11 = null;
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", throwable11);
        java.lang.Throwable[] throwableArray13 = registrationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = registrationException12.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException12);
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException4);
        java.lang.Throwable[] throwableArray17 = registrationException16.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        java.lang.Throwable[] throwableArray7 = registrationException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = registrationException6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray7 = registrationException6.getSuppressed();
        registrationException3.addSuppressed((java.lang.Throwable) registrationException6);
        java.lang.Throwable[] throwableArray9 = registrationException6.getSuppressed();
        java.lang.Throwable throwable13 = null;
        Backend.RegistrationException registrationException14 = new Backend.RegistrationException("", throwable13);
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException14);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray18 = registrationException17.getSuppressed();
        registrationException14.addSuppressed((java.lang.Throwable) registrationException17);
        java.lang.Throwable throwable21 = null;
        Backend.RegistrationException registrationException22 = new Backend.RegistrationException("", throwable21);
        java.lang.Throwable[] throwableArray23 = registrationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = registrationException22.getSuppressed();
        registrationException14.addSuppressed((java.lang.Throwable) registrationException22);
        Backend.RegistrationException registrationException26 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException14);
        registrationException6.addSuppressed((java.lang.Throwable) registrationException26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Throwable throwable7 = null;
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("", throwable7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException8);
        Backend.RegistrationException registrationException11 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray12 = registrationException11.getSuppressed();
        registrationException8.addSuppressed((java.lang.Throwable) registrationException11);
        java.lang.Throwable throwable15 = null;
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("", throwable15);
        java.lang.Throwable[] throwableArray17 = registrationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = registrationException16.getSuppressed();
        registrationException8.addSuppressed((java.lang.Throwable) registrationException16);
        registrationException3.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.Throwable throwable23 = null;
        Backend.RegistrationException registrationException24 = new Backend.RegistrationException("", throwable23);
        Backend.RegistrationException registrationException25 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException24);
        Backend.RegistrationException registrationException27 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray28 = registrationException27.getSuppressed();
        registrationException24.addSuppressed((java.lang.Throwable) registrationException27);
        registrationException3.addSuppressed((java.lang.Throwable) registrationException27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray8 = registrationException7.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException7);
        java.lang.Throwable throwable11 = null;
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", throwable11);
        java.lang.Throwable[] throwableArray13 = registrationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = registrationException12.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException12);
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException4);
        java.lang.Class<?> wildcardClass17 = registrationException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable throwable7 = null;
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("", throwable7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException8);
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException8);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray13 = registrationException12.getSuppressed();
        registrationException8.addSuppressed((java.lang.Throwable) registrationException12);
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException12);
        registrationException2.addSuppressed((java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException18 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray19 = registrationException18.getSuppressed();
        registrationException15.addSuppressed((java.lang.Throwable) registrationException18);
        Backend.RegistrationException registrationException21 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        java.lang.Throwable throwable8 = null;
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("", throwable8);
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException9);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray13 = registrationException12.getSuppressed();
        registrationException9.addSuppressed((java.lang.Throwable) registrationException12);
        java.lang.Throwable throwable16 = null;
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("", throwable16);
        java.lang.Throwable[] throwableArray18 = registrationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = registrationException17.getSuppressed();
        registrationException9.addSuppressed((java.lang.Throwable) registrationException17);
        registrationException4.addSuppressed((java.lang.Throwable) registrationException9);
        Backend.RegistrationException registrationException22 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        java.lang.Throwable[] throwableArray7 = registrationException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException5.addSuppressed((java.lang.Throwable) registrationException9);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException9);
        java.lang.Throwable[] throwableArray13 = registrationException9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = registrationException9.getSuppressed();
        java.lang.Class<?> wildcardClass15 = registrationException9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable[] throwableArray3 = registrationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = registrationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = registrationException2.getSuppressed();
        java.lang.String str6 = registrationException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Backend.RegistrationException: " + "'", str6.equals("Backend.RegistrationException: "));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException3);
        java.lang.Throwable[] throwableArray5 = registrationException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("hi!");
        java.lang.String str2 = registrationException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Backend.RegistrationException: hi!" + "'", str2.equals("Backend.RegistrationException: hi!"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Class<?> wildcardClass3 = registrationException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Throwable throwable7 = null;
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("", throwable7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException8);
        Backend.RegistrationException registrationException11 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray12 = registrationException11.getSuppressed();
        registrationException8.addSuppressed((java.lang.Throwable) registrationException11);
        java.lang.Throwable throwable15 = null;
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("", throwable15);
        java.lang.Throwable[] throwableArray17 = registrationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = registrationException16.getSuppressed();
        registrationException8.addSuppressed((java.lang.Throwable) registrationException16);
        registrationException3.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.Throwable[] throwableArray21 = registrationException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray9 = registrationException8.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.Throwable[] throwableArray11 = registrationException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("Backend.RegistrationException: hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable[] throwableArray3 = registrationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = registrationException2.getSuppressed();
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray7 = registrationException6.getSuppressed();
        registrationException2.addSuppressed((java.lang.Throwable) registrationException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("Backend.RegistrationException: ");
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable throwable6 = null;
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", throwable6);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException7);
        Backend.RegistrationException registrationException11 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray12 = registrationException11.getSuppressed();
        registrationException7.addSuppressed((java.lang.Throwable) registrationException11);
        Backend.RegistrationException registrationException14 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException11);
        registrationException1.addSuppressed((java.lang.Throwable) registrationException14);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray18 = registrationException17.getSuppressed();
        registrationException14.addSuppressed((java.lang.Throwable) registrationException17);
        java.lang.Throwable throwable21 = null;
        Backend.RegistrationException registrationException22 = new Backend.RegistrationException("", throwable21);
        java.lang.Throwable[] throwableArray23 = registrationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = registrationException22.getSuppressed();
        Backend.RegistrationException registrationException26 = new Backend.RegistrationException("hi!");
        registrationException22.addSuppressed((java.lang.Throwable) registrationException26);
        java.lang.Throwable[] throwableArray28 = registrationException26.getSuppressed();
        registrationException14.addSuppressed((java.lang.Throwable) registrationException26);
        java.lang.String str30 = registrationException26.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Backend.RegistrationException: hi!" + "'", str30.equals("Backend.RegistrationException: hi!"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("Backend.RegistrationException: ");
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException2);
        java.lang.Throwable throwable7 = null;
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("", throwable7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException8);
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException8);
        java.lang.Throwable[] throwableArray11 = registrationException10.getSuppressed();
        registrationException3.addSuppressed((java.lang.Throwable) registrationException10);
        java.lang.Class<?> wildcardClass13 = registrationException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        java.lang.Throwable[] throwableArray4 = registrationException3.getSuppressed();
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Throwable[] throwableArray6 = registrationException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        java.lang.Throwable[] throwableArray4 = registrationException3.getSuppressed();
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Throwable[] throwableArray6 = registrationException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException5.addSuppressed((java.lang.Throwable) registrationException9);
        java.lang.Throwable throwable15 = null;
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("", throwable15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException18 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException20 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray21 = registrationException20.getSuppressed();
        registrationException16.addSuppressed((java.lang.Throwable) registrationException20);
        registrationException9.addSuppressed((java.lang.Throwable) registrationException16);
        java.lang.Throwable throwable28 = null;
        Backend.RegistrationException registrationException29 = new Backend.RegistrationException("", throwable28);
        Backend.RegistrationException registrationException30 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException29);
        Backend.RegistrationException registrationException31 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException29);
        Backend.RegistrationException registrationException33 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray34 = registrationException33.getSuppressed();
        registrationException29.addSuppressed((java.lang.Throwable) registrationException33);
        Backend.RegistrationException registrationException36 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException33);
        registrationException16.addSuppressed((java.lang.Throwable) registrationException36);
        Backend.RegistrationException registrationException38 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException16);
        java.lang.Class<?> wildcardClass39 = registrationException38.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray9 = registrationException8.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.Throwable throwable14 = null;
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("", throwable14);
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException19 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray20 = registrationException19.getSuppressed();
        registrationException15.addSuppressed((java.lang.Throwable) registrationException19);
        registrationException8.addSuppressed((java.lang.Throwable) registrationException15);
        java.lang.Throwable[] throwableArray23 = registrationException15.getSuppressed();
        java.lang.Throwable throwable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            registrationException15.addSuppressed(throwable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        java.lang.Throwable[] throwableArray4 = registrationException3.getSuppressed();
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Throwable throwable9 = null;
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("", throwable9);
        Backend.RegistrationException registrationException11 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException10);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException10);
        Backend.RegistrationException registrationException14 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray15 = registrationException14.getSuppressed();
        registrationException10.addSuppressed((java.lang.Throwable) registrationException14);
        java.lang.Throwable throwable20 = null;
        Backend.RegistrationException registrationException21 = new Backend.RegistrationException("", throwable20);
        Backend.RegistrationException registrationException22 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException21);
        Backend.RegistrationException registrationException23 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException21);
        Backend.RegistrationException registrationException25 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray26 = registrationException25.getSuppressed();
        registrationException21.addSuppressed((java.lang.Throwable) registrationException25);
        registrationException14.addSuppressed((java.lang.Throwable) registrationException21);
        java.lang.Throwable throwable33 = null;
        Backend.RegistrationException registrationException34 = new Backend.RegistrationException("", throwable33);
        Backend.RegistrationException registrationException35 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException34);
        Backend.RegistrationException registrationException36 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException34);
        Backend.RegistrationException registrationException38 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray39 = registrationException38.getSuppressed();
        registrationException34.addSuppressed((java.lang.Throwable) registrationException38);
        Backend.RegistrationException registrationException41 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException38);
        registrationException21.addSuppressed((java.lang.Throwable) registrationException41);
        registrationException5.addSuppressed((java.lang.Throwable) registrationException21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        java.lang.Throwable[] throwableArray8 = registrationException7.getSuppressed();
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        java.lang.Throwable[] throwableArray4 = registrationException3.getSuppressed();
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException3);
        java.lang.Class<?> wildcardClass6 = registrationException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException5.addSuppressed((java.lang.Throwable) registrationException9);
        java.lang.Throwable throwable15 = null;
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("", throwable15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException18 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException20 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray21 = registrationException20.getSuppressed();
        registrationException16.addSuppressed((java.lang.Throwable) registrationException20);
        registrationException9.addSuppressed((java.lang.Throwable) registrationException16);
        java.lang.Throwable[] throwableArray24 = registrationException16.getSuppressed();
        Backend.RegistrationException registrationException25 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray9 = registrationException8.getSuppressed();
        registrationException4.addSuppressed((java.lang.Throwable) registrationException8);
        java.lang.Throwable throwable14 = null;
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("", throwable14);
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException19 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray20 = registrationException19.getSuppressed();
        registrationException15.addSuppressed((java.lang.Throwable) registrationException19);
        registrationException8.addSuppressed((java.lang.Throwable) registrationException15);
        java.lang.Throwable throwable24 = null;
        Backend.RegistrationException registrationException25 = new Backend.RegistrationException("", throwable24);
        java.lang.Throwable[] throwableArray26 = registrationException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = registrationException25.getSuppressed();
        Backend.RegistrationException registrationException29 = new Backend.RegistrationException("hi!");
        registrationException25.addSuppressed((java.lang.Throwable) registrationException29);
        java.lang.Throwable throwable32 = null;
        Backend.RegistrationException registrationException33 = new Backend.RegistrationException("", throwable32);
        java.lang.Throwable[] throwableArray34 = registrationException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = registrationException33.getSuppressed();
        Backend.RegistrationException registrationException37 = new Backend.RegistrationException("hi!");
        registrationException33.addSuppressed((java.lang.Throwable) registrationException37);
        registrationException25.addSuppressed((java.lang.Throwable) registrationException33);
        java.lang.Throwable throwable44 = null;
        Backend.RegistrationException registrationException45 = new Backend.RegistrationException("", throwable44);
        Backend.RegistrationException registrationException46 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException45);
        Backend.RegistrationException registrationException47 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException45);
        Backend.RegistrationException registrationException49 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray50 = registrationException49.getSuppressed();
        registrationException45.addSuppressed((java.lang.Throwable) registrationException49);
        java.lang.Throwable throwable55 = null;
        Backend.RegistrationException registrationException56 = new Backend.RegistrationException("", throwable55);
        Backend.RegistrationException registrationException57 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException56);
        Backend.RegistrationException registrationException58 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException56);
        Backend.RegistrationException registrationException60 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray61 = registrationException60.getSuppressed();
        registrationException56.addSuppressed((java.lang.Throwable) registrationException60);
        registrationException49.addSuppressed((java.lang.Throwable) registrationException56);
        java.lang.Throwable throwable68 = null;
        Backend.RegistrationException registrationException69 = new Backend.RegistrationException("", throwable68);
        Backend.RegistrationException registrationException70 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException69);
        Backend.RegistrationException registrationException71 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException69);
        Backend.RegistrationException registrationException73 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray74 = registrationException73.getSuppressed();
        registrationException69.addSuppressed((java.lang.Throwable) registrationException73);
        Backend.RegistrationException registrationException76 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException73);
        registrationException56.addSuppressed((java.lang.Throwable) registrationException76);
        Backend.RegistrationException registrationException78 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException56);
        registrationException33.addSuppressed((java.lang.Throwable) registrationException56);
        registrationException8.addSuppressed((java.lang.Throwable) registrationException33);
        java.lang.Throwable[] throwableArray81 = registrationException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray81);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException3);
        java.lang.Throwable[] throwableArray5 = registrationException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Throwable throwable3 = null;
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("", throwable3);
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException4);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException9);
        java.lang.Throwable throwable14 = null;
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("", throwable14);
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException15);
        java.lang.Throwable[] throwableArray18 = registrationException17.getSuppressed();
        registrationException10.addSuppressed((java.lang.Throwable) registrationException17);
        registrationException4.addSuppressed((java.lang.Throwable) registrationException17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("hi!");
        java.lang.Throwable[] throwableArray2 = registrationException1.getSuppressed();
        java.lang.Throwable throwable5 = null;
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("", throwable5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException6);
        registrationException1.addSuppressed((java.lang.Throwable) registrationException6);
        Backend.RegistrationException registrationException10 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable throwable15 = null;
        Backend.RegistrationException registrationException16 = new Backend.RegistrationException("", throwable15);
        Backend.RegistrationException registrationException17 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException18 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException16);
        Backend.RegistrationException registrationException20 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray21 = registrationException20.getSuppressed();
        registrationException16.addSuppressed((java.lang.Throwable) registrationException20);
        Backend.RegistrationException registrationException23 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException20);
        registrationException10.addSuppressed((java.lang.Throwable) registrationException23);
        Backend.RegistrationException registrationException26 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray27 = registrationException26.getSuppressed();
        registrationException23.addSuppressed((java.lang.Throwable) registrationException26);
        java.lang.Throwable throwable30 = null;
        Backend.RegistrationException registrationException31 = new Backend.RegistrationException("", throwable30);
        java.lang.Throwable[] throwableArray32 = registrationException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = registrationException31.getSuppressed();
        Backend.RegistrationException registrationException35 = new Backend.RegistrationException("hi!");
        registrationException31.addSuppressed((java.lang.Throwable) registrationException35);
        java.lang.Throwable[] throwableArray37 = registrationException35.getSuppressed();
        registrationException23.addSuppressed((java.lang.Throwable) registrationException35);
        java.lang.Throwable[] throwableArray39 = registrationException23.getSuppressed();
        registrationException1.addSuppressed((java.lang.Throwable) registrationException23);
        Backend.RegistrationException registrationException43 = new Backend.RegistrationException("Backend.RegistrationException: ");
        Backend.RegistrationException registrationException44 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException43);
        Backend.RegistrationException registrationException46 = new Backend.RegistrationException("");
        java.lang.Throwable throwable50 = null;
        Backend.RegistrationException registrationException51 = new Backend.RegistrationException("", throwable50);
        Backend.RegistrationException registrationException52 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException51);
        Backend.RegistrationException registrationException54 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray55 = registrationException54.getSuppressed();
        registrationException51.addSuppressed((java.lang.Throwable) registrationException54);
        Backend.RegistrationException registrationException57 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException51);
        registrationException46.addSuppressed((java.lang.Throwable) registrationException57);
        registrationException44.addSuppressed((java.lang.Throwable) registrationException57);
        registrationException23.addSuppressed((java.lang.Throwable) registrationException44);
        java.lang.Throwable[] throwableArray61 = registrationException23.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.RegistrationException registrationException1 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable throwable6 = null;
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", throwable6);
        Backend.RegistrationException registrationException8 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException7);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException7);
        Backend.RegistrationException registrationException11 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray12 = registrationException11.getSuppressed();
        registrationException7.addSuppressed((java.lang.Throwable) registrationException11);
        Backend.RegistrationException registrationException14 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException11);
        registrationException1.addSuppressed((java.lang.Throwable) registrationException14);
        java.lang.String str16 = registrationException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Backend.RegistrationException: Backend.RegistrationException: " + "'", str16.equals("Backend.RegistrationException: Backend.RegistrationException: "));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.Throwable throwable4 = null;
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", throwable4);
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException7 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException5);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException5.addSuppressed((java.lang.Throwable) registrationException9);
        Backend.RegistrationException registrationException12 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException9);
        java.lang.Throwable[] throwableArray13 = registrationException9.getSuppressed();
        Backend.RegistrationException registrationException15 = new Backend.RegistrationException("");
        java.lang.Throwable throwable19 = null;
        Backend.RegistrationException registrationException20 = new Backend.RegistrationException("", throwable19);
        Backend.RegistrationException registrationException21 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException20);
        Backend.RegistrationException registrationException23 = new Backend.RegistrationException("Backend.RegistrationException: ");
        java.lang.Throwable[] throwableArray24 = registrationException23.getSuppressed();
        registrationException20.addSuppressed((java.lang.Throwable) registrationException23);
        Backend.RegistrationException registrationException26 = new Backend.RegistrationException("Backend.RegistrationException: ", (java.lang.Throwable) registrationException20);
        registrationException15.addSuppressed((java.lang.Throwable) registrationException26);
        registrationException9.addSuppressed((java.lang.Throwable) registrationException15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.Throwable throwable1 = null;
        Backend.RegistrationException registrationException2 = new Backend.RegistrationException("", throwable1);
        java.lang.Throwable[] throwableArray3 = registrationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = registrationException2.getSuppressed();
        Backend.RegistrationException registrationException6 = new Backend.RegistrationException("hi!");
        registrationException2.addSuppressed((java.lang.Throwable) registrationException6);
        Backend.RegistrationException registrationException9 = new Backend.RegistrationException("hi!");
        java.lang.Throwable[] throwableArray10 = registrationException9.getSuppressed();
        registrationException2.addSuppressed((java.lang.Throwable) registrationException9);
        java.lang.Throwable[] throwableArray12 = registrationException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("Backend.RegistrationException: ", throwable2);
        java.lang.Throwable[] throwableArray4 = registrationException3.getSuppressed();
        Backend.RegistrationException registrationException5 = new Backend.RegistrationException("", (java.lang.Throwable) registrationException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Throwable throwable2 = null;
        Backend.RegistrationException registrationException3 = new Backend.RegistrationException("", throwable2);
        Backend.RegistrationException registrationException4 = new Backend.RegistrationException("hi!", (java.lang.Throwable) registrationException3);
        java.lang.String str5 = registrationException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Backend.RegistrationException: hi!" + "'", str5.equals("Backend.RegistrationException: hi!"));
    }
}

