package com.interview.Collection;

public class ArrayList {

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private Object[] elementData;
    private Object[] EMPTY_ELEMENTDATA = {};
    private int size;

    public ArrayList() {
        this.elementData = EMPTY_ELEMENTDATA;
    }

    public void add(Object o) {
        ensureCapital(size + 1);
        elementData[size++] = o;
    }

    private void ensureCapital(int minCapacity) {
        if (elementData == EMPTY_ELEMENTDATA) {
            minCapacity = 10;
        }
        if (minCapacity > elementData.length) {
            grows(minCapacity);
        }
    }

    private void grows(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = Integer.MAX_VALUE;
        }
        if (newCapacity > elementData.length) {
            String[] newElements = new String[newCapacity];
            System.arraycopy(elementData, 0, newElements, 0, elementData.length);
            elementData = newElements;
        }
    }

    public Object get(int num) {
        return elementData[num];
    }

    public int size() {
        return size;
    }

}
