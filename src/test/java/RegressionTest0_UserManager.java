package test.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_UserManager {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", (int) (short) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.UserManager userManager0 = new Backend.UserManager();
        java.lang.Class<?> wildcardClass1 = userManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        boolean boolean1 = Backend.UserManager.isEmailUnique("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        boolean boolean1 = Backend.UserManager.isValidEmailFormat("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean1 = Backend.UserManager.isValidEmailFormat("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int2 = Backend.UserManager.getNextUserId("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.UserManager.registerUserWithDashboard("", "", "", "hi!", (int) (short) -1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int2 = Backend.UserManager.getNextUserId("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "hi!", (int) ' ');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int2 = Backend.UserManager.getNextUserId("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int2 = Backend.UserManager.getNextUserId("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", (int) (byte) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: Invalid email format!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "hi!", (int) '#');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", (int) (short) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        boolean boolean1 = Backend.UserManager.isEmailUnique("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: Invalid email format!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "", (int) (short) -1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "", (int) (short) 100);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", (int) '4');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", (int) (byte) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "hi!", 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "hi!", (int) 'a');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "", (int) (byte) -1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) (short) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "", (int) (short) -1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "hi!", (int) '#');
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "hi!", (int) (short) 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) 'a');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", (int) (short) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "hi!", (int) (byte) 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.UserManager.registerUserWithDashboard("", "", "", "hi!", (int) (short) 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "", 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "hi!", (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "hi!", (int) '4');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "hi!", (int) 'a');
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "", (int) (byte) 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "hi!", 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "", 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "hi!", (int) ' ');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", (int) (byte) 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", (-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "hi!", (int) (byte) 1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "", 10);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "", (int) (byte) 10);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "hi!", (int) (short) 0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "", (int) '4');
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "", (int) (byte) 100);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        Backend.UserManager.registerUserWithDashboard("", "", "", "hi!", (int) (byte) 0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", 1);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "", (int) (byte) 100);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "hi!", (int) (short) 1);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "hi!", (int) (byte) 10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) (short) 10);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", (int) 'a');
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "hi!", (int) (short) 0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) (byte) -1);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) (byte) 1);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "hi!", (int) (short) 10);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "hi!", (int) (short) 100);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "hi!", 10);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "hi!", (int) ' ');
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "hi!", (int) (byte) 100);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "hi!", (int) (short) 100);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", (int) (short) 10);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "", (-1));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "", "", (int) (short) 0);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "", (int) (byte) 100);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "", "", (int) (byte) 0);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", 10);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = Backend.UserManager.registerUser("hi!", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type Backend.RegistrationException; message: All fields are required!");
        } catch (Backend.RegistrationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", 0);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "hi!", "hi!", (int) (byte) -1);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "hi!", (int) '#');
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", (int) (byte) 0);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "", (int) (byte) 0);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "", (int) (byte) 10);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        Backend.UserManager.registerUserWithDashboard("", "", "hi!", "hi!", 10);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        Backend.UserManager.registerUserWithDashboard("", "hi!", "hi!", "", (int) (byte) 10);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        Backend.UserManager.registerUserWithDashboard("hi!", "hi!", "hi!", "", 1);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", 1);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        Backend.UserManager.registerUserWithDashboard("", "", "", "", 10);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        Backend.UserManager.registerUserWithDashboard("hi!", "", "", "", (int) ' ');
    }
}

