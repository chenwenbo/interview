package com.interview.patten.iterator;

public class NameRepository implements Container{

    private String[] names = {"chen", "wen", "bo"};

    @Override
    public Iterator getIterator() {
        return new Iterator() {
            private int i;
            @Override
            public boolean hasNext() {
                if (i < names.length) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                if (hasNext()) {
                    return names[i++];
                }
                return null;
            }
        };
    }
}
