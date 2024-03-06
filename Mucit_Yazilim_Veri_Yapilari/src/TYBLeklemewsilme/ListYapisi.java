package TYBLeklemewsilme;

public class ListYapisi {
	Node head=null;
	Node tail=null;
	void basaEkle(int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null) {
			eleman.next=null;
			head=eleman;
			tail=eleman;	
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
		}
		else {
			eleman.next=head;
			head=eleman;
		}
	}
	void sonaEkle(int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null) {
			eleman.next=null;
			head=eleman;
			tail=eleman;	
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
		}
		else {
			tail.next=eleman;
			tail=eleman;
		}
		
	}
	void arayaEkle(int indis,int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null && indis==0) {
			eleman.next=null;
			head=eleman;
			tail=eleman;	
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
		}
		else if(head!=null && indis==0) {
			eleman.next=head;
			head=eleman;
			
		}
		else {
			int n=0;
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
			}
			if(n==indis ) {
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklendi");
			}
			else {
				temp=head;
				int i=0;
				while(i<indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklandi");
			}
		}
		
	}
	void Yazdir() {
		if(head== null) {
			System.out.println("liste yapısı boş!!!");
		}
		else {
			Node temp =head;
			while (temp!=null) {
				System.out.println(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.println(" son.");
		}
	}
	
	
	void bastanSil() {
		if(head==null) {
			System.out.println("Liste Boş");
			
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("listede kalan son elemanda silindi");
			
		}
		else {
			head=head.next;
			System.out.println("baştaki eleman silindi.");
		}
		
	}
	void sondanSil() {
		if(head==null) {
			System.out.println("Liste Boş");
			
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("listede kalan son elemanda silindi");
			
		}
		else {
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				
			}
			temp2.next=null;
			tail=temp2;
			System.out.println("Sondan eleman silindi");
		}
		
	}
	void aradanSil(int indis) {
		if(head==null) {
			System.out.println("liste bos, silinecek bir şey yok!!!");
			
		}
		else if(head.next==null && indis==0 ) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi"); 
			
		}
		else if(head.next!=null && indis==0) {
			head=head.next;
			System.out.println("baştaki eleman silindi");
			
		}
		else {
			int i = 0 ;
			Node temp=head;

			Node temp2=head;
			while(temp!=null) {
				i++;
				temp2=temp;
				temp=temp.next;
			}
			if(i==indis) {
				temp2.next=null;
				tail=temp2;
				System.out.println("listedeki son sıradaki eleman silindi.");
				}
			else {
				temp=head;
				temp2=head;
				int j=0;
				while(j!=indis) {
					temp2=temp;
					temp=temp.next;
					j++;
				}
				temp2.next=temp.next;
				System.out.println("Aradaki nesne silindi!!!");
			}
		}
	}
}
