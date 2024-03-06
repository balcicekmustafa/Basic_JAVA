package Odev1;


public class Queue {
	private Node ilk;
    private Node son;
    private int sayac = 0;

    public void enqueue(Object data) {
        Node newNode = new Node(data);
        if (son == null) {
            ilk = son = newNode;
        } else {
            son.next = newNode;
            son = newNode;
        }
        sayac++;
    }

    public Object dequeue() {
        if (ilk == null) {
            return null;
        }
        Object item = ilk.data;
        ilk = ilk.next;
        if (ilk == null) {
            son = null;
        }
        sayac--;
        return item;
    }

    public boolean isEmpty() {
        return ilk == null;
    }

    public int size() {
        return sayac;
    }
    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }}
