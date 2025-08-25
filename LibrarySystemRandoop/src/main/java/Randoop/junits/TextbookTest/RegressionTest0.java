package Randoop.junits.TextbookTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        objects.Textbook textbook3 = new objects.Textbook(100, "", "hi!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "hi!", "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        objects.Textbook textbook3 = new objects.Textbook(97, "", "hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        objects.Textbook textbook3 = new objects.Textbook(97, "", "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        int int17 = textbook3.getId();
        java.lang.Class<?> wildcardClass18 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        int int14 = textbook3.getId();
        java.lang.Class<?> wildcardClass15 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        objects.Textbook textbook3 = new objects.Textbook(0, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        objects.observer observer15 = null;
        textbook3.attachObserver(observer15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        objects.Textbook textbook3 = new objects.Textbook(35, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        objects.observer observer14 = null;
        textbook3.attachObserver(observer14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.String str13 = textbook3.getEdition();
        int int14 = textbook3.getId();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        objects.observer observer12 = null;
        textbook3.attachObserver(observer12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        int int14 = textbook3.getId();
        int int15 = textbook3.getId();
        java.lang.Class<?> wildcardClass16 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        java.lang.String str15 = textbook3.getCourseId();
        java.lang.String str16 = textbook3.getCourseId();
        int int17 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        int int9 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        objects.Textbook textbook3 = new objects.Textbook(32, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        objects.Textbook textbook3 = new objects.Textbook(52, "hi!", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 10, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getEdition();
        java.lang.String str15 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        int int13 = textbook3.getId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "", "");
        int int4 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        int int11 = textbook3.getId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        objects.Textbook textbook3 = new objects.Textbook(10, "", "hi!");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        java.lang.String str12 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        objects.Textbook textbook3 = new objects.Textbook(10, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "");
        int int4 = textbook3.getId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        int int13 = textbook3.getId();
        java.lang.String str14 = textbook3.getCourseId();
        java.lang.String str15 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 10, "", "hi!");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        objects.Textbook textbook3 = new objects.Textbook(32, "", "");
        int int4 = textbook3.getId();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 0, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        int int11 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        java.lang.String str11 = textbook3.getEdition();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        int int10 = textbook3.getId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        java.lang.String str6 = textbook3.getEdition();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.String str10 = textbook3.getCourseId();
        int int11 = textbook3.getId();
        int int12 = textbook3.getId();
        objects.observer observer13 = null;
        textbook3.attachObserver(observer13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        int int12 = textbook3.getId();
        java.lang.String str13 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass14 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        int int11 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        objects.Textbook textbook3 = new objects.Textbook(97, "hi!", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        objects.Textbook textbook3 = new objects.Textbook((int) '#', "", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        objects.Textbook textbook3 = new objects.Textbook(52, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        objects.Textbook textbook3 = new objects.Textbook((-1), "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.Class<?> wildcardClass11 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 100, "", "hi!");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        objects.observer observer8 = null;
        textbook3.attachObserver(observer8);
        java.lang.String str10 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getEdition();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getCourseId();
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getEdition();
        int int10 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        objects.Textbook textbook3 = new objects.Textbook(100, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getEdition();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) 1, "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.Class<?> wildcardClass8 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        objects.Textbook textbook3 = new objects.Textbook(35, "hi!", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        objects.Textbook textbook3 = new objects.Textbook(0, "hi!", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        objects.Textbook textbook3 = new objects.Textbook((int) 'a', "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        java.lang.String str8 = textbook3.getCourseId();
        java.lang.String str9 = textbook3.getCourseId();
        java.lang.Class<?> wildcardClass10 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        objects.Textbook textbook3 = new objects.Textbook(1, "", "");
        int int4 = textbook3.getId();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.Class<?> wildcardClass7 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        objects.Textbook textbook3 = new objects.Textbook((int) ' ', "", "hi!");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        int int8 = textbook3.getId();
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        objects.Textbook textbook3 = new objects.Textbook((int) '4', "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        java.lang.String str12 = textbook3.getEdition();
        java.lang.String str13 = textbook3.getEdition();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) 0, "hi!", "hi!");
        java.lang.String str4 = textbook3.getCourseId();
        java.lang.String str5 = textbook3.getEdition();
        java.lang.String str6 = textbook3.getCourseId();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        java.lang.String str10 = textbook3.getCourseId();
        objects.observer observer11 = null;
        textbook3.attachObserver(observer11);
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        objects.Textbook textbook3 = new objects.Textbook((int) (byte) -1, "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        java.lang.Class<?> wildcardClass6 = textbook3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        objects.observer observer9 = null;
        textbook3.attachObserver(observer9);
        java.lang.String str11 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass12 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        objects.Textbook textbook3 = new objects.Textbook(10, "hi!", "");
        java.lang.String str4 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass5 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getEdition();
        int int7 = textbook3.getId();
        java.lang.String str8 = textbook3.getCourseId();
        int int9 = textbook3.getId();
        objects.observer observer10 = null;
        textbook3.attachObserver(observer10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getCourseId();
        java.lang.String str6 = textbook3.getCourseId();
        objects.observer observer7 = null;
        textbook3.attachObserver(observer7);
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getCourseId();
        java.lang.String str12 = textbook3.getEdition();
        java.lang.Class<?> wildcardClass13 = textbook3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "hi!", "");
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getEdition();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getCourseId();
        java.lang.String str8 = textbook3.getEdition();
        java.lang.String str9 = textbook3.getCourseId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        objects.observer observer4 = null;
        textbook3.attachObserver(observer4);
        objects.observer observer6 = null;
        textbook3.attachObserver(observer6);
        int int8 = textbook3.getId();
        java.lang.String str9 = textbook3.getCourseId();
        int int10 = textbook3.getId();
        java.lang.String str11 = textbook3.getEdition();
        int int12 = textbook3.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        objects.Textbook textbook3 = new objects.Textbook((int) (short) -1, "", "");
        java.lang.String str4 = textbook3.getCourseId();
        objects.observer observer5 = null;
        textbook3.attachObserver(observer5);
        int int7 = textbook3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        objects.Textbook textbook3 = new objects.Textbook((-1), "", "");
        java.lang.String str4 = textbook3.getEdition();
        int int5 = textbook3.getId();
        int int6 = textbook3.getId();
        java.lang.String str7 = textbook3.getEdition();
        int int8 = textbook3.getId();
        java.lang.Class<?> wildcardClass9 = textbook3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

