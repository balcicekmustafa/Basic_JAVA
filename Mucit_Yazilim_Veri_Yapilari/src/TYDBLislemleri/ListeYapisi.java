package TYDBLislemleri;

import java.util.Scanner;

public class ListeYapisi {
	Scanner k=new Scanner(System.in);
	Node head=null;
	Node tail=null;
	void basaEkle() {
		int data;
		System.out.println("data: ");
		data=k.nextInt();
		Node eleman=new Node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else {
			eleman.next=head;
			head=eleman;
			tail.next=head;
			
		}
	}
	void sonaEkle() {
		int data;
		System.out.println("data: ");
		data=k.nextInt();
		Node eleman=new Node (data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=eleman;
			
		}
		else {
			tail.next=eleman;
			tail=eleman;
			tail.next=head;
		}
	}
	void arayaEkle() {
		int data,indis;
		System.out.println("indis: ");
		indis=k.nextInt();
		System.out.println("sayi: ");
		data=k.nextInt();
		Node eleman=new Node (data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
			
		}
		else if (indis==0) {
			eleman.next=head;
			head=eleman;
			tail.next=head;			
		}
		else {
			int n=0;
			Node temp=head;
			Node temp2=head;
			while(temp!=tail) {
				temp=temp.next;
				n++;
			}
			n++;
			if(indis>=(n)) {
				tail.next=eleman;
				tail=eleman;
				tail.next=head;
				
			}
			else {
				temp=head;
				temp2=temp;
				temp=temp.next;
				int i=0;
				while(i< indis) {
					i++;
					temp2=temp;
					temp=temp.next;
				}
				temp2.next=eleman;
				eleman.next=temp;
			}
			
		}
	}
	void yazdir() {
		if(head==null) {
			System.out.println("Liste Boş!!");
		}
		else {
			Node temp=head;
			System.out.println("bas ->");
			while(temp!=tail) {
				System.out.println(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.println(temp.data+" -> son");
		}
	}
}
