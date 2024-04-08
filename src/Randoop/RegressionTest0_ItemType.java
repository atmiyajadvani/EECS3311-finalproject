package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_ItemType {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        Backend.ItemType itemType0 = Backend.ItemType.MAGAZINE;
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + Backend.ItemType.MAGAZINE + "'", itemType0.equals(Backend.ItemType.MAGAZINE));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Backend.ItemType itemType0 = Backend.ItemType.CD;
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + Backend.ItemType.CD + "'", itemType0.equals(Backend.ItemType.CD));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Backend.ItemType itemType0 = Backend.ItemType.BOOK;
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + Backend.ItemType.BOOK + "'", itemType0.equals(Backend.ItemType.BOOK));
    }
}

