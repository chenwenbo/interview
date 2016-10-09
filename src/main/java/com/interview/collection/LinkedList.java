package com.interview.collection;

public class LinkedList {

    private Node first;

    private Node last;

    private int size;

    public LinkedList() {
    }

    public int size() {
        return size;
    }

    public Object first() {
        return first.object;
    }

    public Object last() {
        return last.object;
    }

    public void remove(Object obj){
        for (Node x = first; x != null; x = x.next) {
            if (x.object.equals(obj)) {
                unLink(x);
            }
        }
    }

    public void remove(int index) {
        Node node = node(index);
        unLink(node);
    }

    private void unLink(Node x) {
        Node prev = x.prev;
        Node next = x.next;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            first = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.object = null;
        size--;
    }

    public void add(Object obj) {
        Node l = last;
        Node newNode = new Node(l, obj, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public Object get(int index) {
        if (!isElementIndex(index)) {
            String msg =  "Index: "+index+", Size: "+size;
            throw new IndexOutOfBoundsException(msg);
        }
        return node(index).object;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = node(i).object;
        }
        return result;
    }

    private Node node(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private class Node{

        private Node prev;
        private Node next;
        private Object object;

        public Node(Node prev, Object object, Node next) {
            this.prev = prev;
            this.object = object;
            this.next = next;
        }
    }
}

