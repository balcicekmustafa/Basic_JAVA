package TYBLolustur;;

public class ListeYapisi {
	Node head = null;
	Node tail = null;
	void ekle(int x) {
		Node eleman = new Node();
		eleman.data=x;
		eleman.next=null;
		if(head == null) {
			head =eleman;
			tail=eleman;
			System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
		}
		else {
			tail.next=eleman;
			tail=eleman;
			System.out.println("Listenin sonuna yeni bir eleman eklendi.");
		}
	}
	void yazdir() {
		if(head==null) {
			System.out.println("liste yapisi bos !!!");
		}
		else {
			Node temp=head;
			System.out.print("bas-> ");
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
				
			}
			System.out.println("son.");
		}
	}
}
