package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_ItemHandler {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        Backend.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        java.lang.Class<?> wildcardClass1 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        Backend.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        Backend.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.saveCart(0);
        itemHandler0.removeDisabledItems();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        java.util.List<Backend.Item> itemList6 = itemHandler0.filterItems("hi!");
        java.lang.Class<?> wildcardClass7 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        Backend.Item item1 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.saveCart((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        java.lang.Class<?> wildcardClass5 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("");
        itemHandler0.enableItem("");
        Backend.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.saveCart(0);
        Backend.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.removeDisabledItems();
        itemHandler0.enableItem("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.saveCart(100);
        Backend.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.saveCart(0);
        java.util.List<Backend.Item> itemList8 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        Backend.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("");
        itemHandler0.enableItem("");
        java.lang.Class<?> wildcardClass5 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        java.util.List<Backend.Item> itemList5 = itemHandler0.filterItems("");
        java.lang.Class<?> wildcardClass6 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.enableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        Backend.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        java.lang.Class<?> wildcardClass4 = itemList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        java.lang.Class<?> wildcardClass6 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        Backend.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        itemHandler0.enableItem("hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (byte) 10);
        itemHandler0.disableItem("hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (short) 0);
        itemHandler0.disableItem("");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (short) 0);
        java.util.List<Backend.Item> itemList7 = itemHandler0.filterItems("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (byte) 10);
        Backend.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        java.lang.Class<?> wildcardClass6 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.saveCart((int) '#');
        itemHandler0.removeDisabledItems();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList4 = itemHandler0.filterItems("hi!");
        java.lang.Class<?> wildcardClass5 = itemList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        java.util.List<Backend.Item> itemList2 = itemHandler0.getCsvData();
        itemHandler0.enableItem("");
        java.lang.Class<?> wildcardClass5 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.removeDisabledItems();
        itemHandler0.enableItem("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        itemHandler0.enableItem("hi!");
        itemHandler0.disableItem("hi!");
        java.util.List<Backend.Item> itemList6 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (short) 0);
        java.util.List<Backend.Item> itemList6 = itemHandler0.getCsvData();
        itemHandler0.enableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        java.util.List<Backend.Item> itemList1 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        java.util.List<Backend.Item> itemList4 = itemHandler0.getCsvData();
        java.lang.Class<?> wildcardClass5 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList4 = itemHandler0.filterItems("hi!");
        Backend.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        java.util.List<Backend.Item> itemList5 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        Backend.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.saveCart((int) (short) 10);
        itemHandler0.removeDisabledItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (byte) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        java.lang.Class<?> wildcardClass5 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        java.util.List<Backend.Item> itemList6 = itemHandler0.filterItems("hi!");
        java.util.List<Backend.Item> itemList7 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("");
        itemHandler0.enableItem("");
        itemHandler0.enableItem("hi!");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.disableItem("");
        itemHandler0.saveCart(0);
        java.lang.Class<?> wildcardClass8 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        java.util.List<Backend.Item> itemList2 = itemHandler0.getCsvData();
        itemHandler0.enableItem("");
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList2);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        itemHandler0.removeDisabledItems();
        java.util.List<Backend.Item> itemList6 = itemHandler0.getCsvData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) (byte) 10);
        itemHandler0.removeDisabledItems();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.removeDisabledItems();
        itemHandler0.enableItem("hi!");
        itemHandler0.disableItem("hi!");
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        itemHandler0.enableItem("");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.disableItem("");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        itemHandler0.removeDisabledItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.saveCart(0);
        java.util.List<Backend.Item> itemList6 = itemHandler0.filterItems("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        itemHandler0.saveCart((int) (byte) 10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        java.util.List<Backend.Item> itemList3 = itemHandler0.getCsvData();
        java.util.List<Backend.Item> itemList5 = itemHandler0.filterItems("");
        itemHandler0.enableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.disableItem("hi!");
        itemHandler0.removeDisabledItems();
        itemHandler0.saveCart((int) '4');
        java.lang.Class<?> wildcardClass6 = itemHandler0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Backend.ItemHandler itemHandler0 = new Backend.ItemHandler();
        itemHandler0.enableItem("hi!");
        itemHandler0.enableItem("");
        java.util.List<Backend.Item> itemList6 = itemHandler0.filterItems("hi!");
        itemHandler0.enableItem("");
        Backend.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            itemHandler0.addItem(item9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Backend.Item.getId()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
    }
}
