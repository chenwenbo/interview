package co.interview;

import static junit.framework.Assert.*;

public class InterviewTest {

    @org.junit.Test
    public void int_equals_Integer() throws Exception {
        int a = 11;
        Integer b = new Integer(11);
        assertEquals(true,a==b);
    }


}
