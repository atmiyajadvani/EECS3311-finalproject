package test.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_FacultyCoursesManager {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        java.lang.Class<?> wildcardClass2 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(100);
        java.lang.Class<?> wildcardClass2 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str9 = facultyCoursesManager1.addCourse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid course code." + "'", str9.equals("Invalid course code."));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str9 = facultyCoursesManager1.addCourse("Course code does not exist.");
        boolean boolean11 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Course code does not exist." + "'", str9.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.addCourse("hi!");
        java.lang.Class<?> wildcardClass6 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Course code does not exist." + "'", str5.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str11 = facultyCoursesManager1.addCourse("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Course code does not exist." + "'", str11.equals("Course code does not exist."));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        boolean boolean5 = facultyCoursesManager1.isCourseCodeValid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.Class<?> wildcardClass6 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.addCourse("Course code does not exist.");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Course code does not exist." + "'", str7.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        boolean boolean5 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.Class<?> wildcardClass4 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(10);
        java.lang.String str3 = facultyCoursesManager1.getTextbookForCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((-1));
        java.lang.Class<?> wildcardClass2 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.Class<?> wildcardClass10 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("N/A");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("Invalid course code.");
        java.lang.Class<?> wildcardClass10 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.addCourse("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Course code does not exist." + "'", str7.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        java.lang.String str7 = facultyCoursesManager1.addCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Course code does not exist." + "'", str7.equals("Course code does not exist."));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean11 = facultyCoursesManager1.isCourseCodeValid("N/A");
        java.lang.String str13 = facultyCoursesManager1.addCourse("N/A");
        java.lang.String str15 = facultyCoursesManager1.addCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Course code does not exist." + "'", str13.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Course code does not exist." + "'", str15.equals("Course code does not exist."));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.addCourse("Course code does not exist.");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Course code does not exist." + "'", str7.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.Class<?> wildcardClass8 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str9 = facultyCoursesManager1.addCourse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid course code." + "'", str9.equals("Invalid course code."));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(100);
        java.lang.String str3 = facultyCoursesManager1.getTextbookForCourse("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(100);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(10);
        java.lang.String str3 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str5 = facultyCoursesManager1.addCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Course code does not exist." + "'", str5.equals("Course code does not exist."));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) 1);
        java.lang.String str3 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean5 = facultyCoursesManager1.isCourseCodeValid("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean11 = facultyCoursesManager1.isCourseCodeValid("N/A");
        java.lang.String str13 = facultyCoursesManager1.addCourse("N/A");
        boolean boolean15 = facultyCoursesManager1.isCourseCodeValid("Invalid course code.");
        java.lang.String str17 = facultyCoursesManager1.getTextbookForCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Course code does not exist." + "'", str13.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "N/A" + "'", str17.equals("N/A"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        java.lang.String str3 = facultyCoursesManager1.addCourse("Course code does not exist.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Course code does not exist." + "'", str3.equals("Course code does not exist."));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(100);
        java.lang.String str3 = facultyCoursesManager1.addCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Course code does not exist." + "'", str3.equals("Course code does not exist."));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str9 = facultyCoursesManager1.addCourse("Course code does not exist.");
        java.lang.String str11 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        java.lang.String str13 = facultyCoursesManager1.addCourse("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Course code does not exist." + "'", str9.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "N/A" + "'", str11.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Course code does not exist." + "'", str13.equals("Course code does not exist."));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("Invalid course code.");
        java.lang.String str11 = facultyCoursesManager1.getTextbookForCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "N/A" + "'", str11.equals("N/A"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        java.lang.Class<?> wildcardClass8 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        boolean boolean5 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.addCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Course code does not exist." + "'", str7.equals("Course code does not exist."));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        boolean boolean9 = facultyCoursesManager1.isCourseCodeValid("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.addCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Course code does not exist." + "'", str5.equals("Course code does not exist."));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("Course code does not exist.");
        java.lang.Class<?> wildcardClass6 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.Class<?> wildcardClass8 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("N/A");
        java.lang.Class<?> wildcardClass8 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(0);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        boolean boolean5 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.Class<?> wildcardClass6 = facultyCoursesManager1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) ' ');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        boolean boolean7 = facultyCoursesManager1.isCourseCodeValid("");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("N/A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) -1);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str9 = facultyCoursesManager1.getTextbookForCourse("hi!");
        java.lang.String str11 = facultyCoursesManager1.addCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "N/A" + "'", str9.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Course code does not exist." + "'", str11.equals("Course code does not exist."));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (short) 1);
        java.lang.String str3 = facultyCoursesManager1.getTextbookForCourse("Invalid course code.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) (byte) 1);
        java.lang.String str3 = facultyCoursesManager1.addCourse("Invalid course code.");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("N/A");
        java.lang.String str7 = facultyCoursesManager1.getTextbookForCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Course code does not exist." + "'", str3.equals("Course code does not exist."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((-1));
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager(100);
        boolean boolean3 = facultyCoursesManager1.isCourseCodeValid("Course code does not exist.");
        java.lang.String str5 = facultyCoursesManager1.getTextbookForCourse("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Backend.FacultyCoursesManager facultyCoursesManager1 = new Backend.FacultyCoursesManager((int) '4');
    }
}

