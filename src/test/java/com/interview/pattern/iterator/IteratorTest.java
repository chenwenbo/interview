package com.interview.pattern.iterator;

import org.junit.Test;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        NameRepository names = new NameRepository();

        for(Iterator iter = names.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

    }
}
