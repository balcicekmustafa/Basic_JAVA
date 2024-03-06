package StackUyg;

public class StackYigin {
	int dizi[];
	int size;
	int indis;
	public StackYigin(int size) {
		this.size = size;
		dizi=new int[size];
		indis=-1;
	}
	void push(int data) {
		
		if(isFull()) {
			System.out.println("Stack Dolu");
		}
		else {
			indis++;
			dizi[indis]=data;
			System.out.println("ekleme():"+dizi[indis]);
		
		}
		}
	int pop() {
		if(isFull()) {
		return dizi[indis--];}
		else {
			System.out.println("Dizi boş!!!");
			return -1;
		}
	}
	boolean isFull() {
		return (indis==size-1);
	}
	boolean isEmpty() {
		/*if(indis==-1) {
			return true;
		}
		else {
			return false;
		}*/
		return (indis==-1);
	}
}
