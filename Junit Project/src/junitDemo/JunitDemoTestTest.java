package junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemoTestTest {

    @Test
    public void test1() {
        JunitClassDemo obj = new JunitClassDemo();
        JunitClassDemo obj1 = new JunitClassDemo();
        int result = obj.add(9, 10);
        System.out.println(result);
        int result2 =obj1.mul(3,4);
        assertTrue(result ==19);
        assertFalse(result ==199);
        assertNotNull(result);
        assertNull(result);
    }
    @Before
    public void test2() {
        System.out.println("hello from before annotation");
    }
    @After
    public void test3() {
        System.out.println("hello from after annotation");
    }
    
//    @BeforeClass
//    public void test4() {
//        System.out.println("hello from after annotation");
//    }
//}
}